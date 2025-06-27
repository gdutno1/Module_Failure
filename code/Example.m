clc;clear;
%% 初始化数据
n1 = 4; n2 = 4; g = 0;  h = 2;  b = 2;
AT1 = [82 0 92 100];    bt1 = 1;    lt1 = 4;    mt1 = 1;    dt1 = 20;
AT2 = [82 87 87 88];    bt2 = 1;    lt2 = 4;    mt2 = 1;    dt2 = 20;

% AT1 = [72 0 78 100];    bt1 = 1;    lt1 = 4;    mt1 = 1;    dt1 = 20;
% AT2 = [82 87 87 88];    bt2 = 2;    lt2 = 5;    mt2 = 1;    dt2 = 20;

T_initial = 907;    % R1在 PM1,0 开始装入，R2 在 PM2,1 卸载W8完成
T0 = 1000;   

%% 计算各个参数的值
phy(1) = n1*lt1 + 2*bt1 + (n1+1)*mt1;
phy(2) = (n2+1) * (lt2+mt2);

L(1) = max(AT1([1:b-1, b+1:end])) + lt1;
U(1) = min(AT1([1:b-1, b+1:end])) + lt1 + dt1;
L(2) = max(AT2) + lt2;
U(2) = min(AT2) + lt2 + dt2;
 
th = max([L, phy]); %   整体周期时间
    
%% 计算等待时间(第三种情况）
% W1 = zeros(1,n1);
% Ws1 = zeros(1,n1);
% if U(1) < th
%     E = logical((AT1 + lt1 + dt1< th) .* (AT1 ~= 0));
%     W1(E) = th - AT1(E) - dt1 - lt1;
%     Ws1(n1) = th - phy(1) - sum(W1);
% end
% 
% W2 = zeros(1,n1);
% Ws2 = zeros(1,n1);
% if U(2) < th
%     E = logical((AT2 + lt2 + dt2< th) .* (AT2 ~= 0));
%     W2(E) = th - AT2(E) - dt2 - lt2;
%     Ws2(n1) = th - phy(2) - sum(W2);
% end
%% 计算等待时间(第一种情况）
for i = 1:2
    if th <= U(i) && phy(i) <= L(i)
        W(i,:) = zeros(1,n1);
        W(i,n1) = th - phy(i);
        Ws(i,:) = zeros(1,n1);
    end
end
W = [W [0;0] W]; % 为了后续处理方便
Ws = [Ws [0;0] Ws];
%% 不算LL处处理的时间周期序列
for i = 1: n1 
    Time1(i,:) = [W(1,i) bt1 lt1-2*bt1 Ws(1,i) bt1 mt1];
end
for i = 1: n2+1
    Time2(i,:) = [W(2,i) bt2 lt2-2*bt2 Ws(2,i) bt2 mt2];
end
Time(1,:) = sum(Time1,2);
Time(1,n1+1) = bt1*2 + mt1;
Time(2,:) = sum(Time2,2);
Time = [Time  Time];

%% 求 g T1 以及下一次在BM处卸载的时间
T = T_initial + 2 * bt1;
g = 0;
T1 = T - bt1;
if T <= T0
    g = 1;  i = 1;
    T = T + mt1;
    while T < T0
        T = T + Time(1,i);
        g = g + 1;
        i = i + 1;
    end
end
T1 = T;
if  T - Time(1,i-1) + W(1,i-1) >= T0 % 当 T0 时刻正处于等待时间区间时
    g = g - 1;
    T1 = T0;
    i = i - 1;
    T = T - Time(1,i);
end
% 求下次再BM处卸载的时间
if i < b
    while i < b
        T = T + Time(1,i);
        i = i + 1;
    end
    Tb1 = T;
elseif i == b
    Tb1 = T;
else
    while i < b + n1 + 1
        T = T + Time(1,i);
        i = i + 1;
    end
    Tb1 = T;
end

%% 求h T2 及下一次在BM处卸载的时间
% T = T_initial + bt2 + mt2;
% h = 5;  i = 5;
% T2 = T;
T = T_initial + lt2 - bt2 + Ws(2,1) + mt2;
h = 2;  i = 2;
T2 = T;

while T < T0
    T = T + Time(2,i);
    h = h + 1;
    i = i + 1; 
end
T2 = T;
if  T - Time(2,i-1) + W(2,i-1) >= T0 % 当 T0 时刻正处于等待时间区间时
    h = h - 1;
    T2 = T0;    
    i = i - 1;
    T = T - Time(2,i);
end
h = mod(h, n2+1);
% 求下次再BM处卸载的时间
if i < n2 + 1
    while i < n2 + 1
        T = T + Time(2,i);
        i = i + 1;
    end
    Tb2 = T;
elseif i == n2 + 1
    Tb2 = T;
else
    while i < n2 + 1 + n2 + 1
        T = T + Time(1,i);
        i = i + 1;
    end
    Tb2 = T;
end

%% 判断 T0 之后 R1、R2哪个先到达 BM
if Tb1 <= Tb2
    m = 1;
else
    m = -1;
end
    
%% 求故障前的装载时间，用于lingo的驻留时间约束部分

% C1
t_load(1,1) = T_initial + 2*bt1 + mt1 + W(1,1) + lt1 - bt1 + Ws(1,1);
for i = 1:3
    t_load(1,i+1) = t_load(i) + bt1 + mt1 + W(1,i+1) + lt1 - bt1 + Ws(1, i+1);
end
% t_load(4) > T1 ,所以使用T_initial前的 t_load
t_load(1,4) = 905;

%C2
T2_initial = 904;
t_load(2,1) = T2_initial + bt2 + mt2 + W(2,1) + lt2 - bt2 + Ws(2,1);
for i = 1:3
    t_load(2,i+1) = t_load(i) + bt2 + mt2 + W(2, i+1) + lt2 - bt2 + Ws(2, i+1);
end
% t_load(2, 4) > T2 ,所以使用T2_initial前的 t_load
t_load(2,4) = 899;






























