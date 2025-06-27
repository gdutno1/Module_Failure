clc;clear;
%% 初始化数据
n1 = 4; n2 = 4; g = 0;  h = 2;  b = 2;
AT1 = [72 0 78 100];    bt1 = 1;    lt1 = 4;    mt1 = 1;    dt1 = 20;
AT2 = [76 87 92 88];    bt2 = 2;    lt2 = 5;    mt2 = 1;    dt2 = 20;

% AT1 = [82 0 92 100];    bt1 = 1;    lt1 = 4;    mt1 = 1;    dt1 = 20;
% AT2 = [82 87 87 88];    bt2 = 1;    lt2 = 4;    mt2 = 1;    dt2 = 20;
%% 计算各个参数的值
phy(1) = n1*lt1 + 2*bt1 + (n1+1)*mt1;
phy(2) = (n2+1) * (lt2+mt2);

L(1) = max(AT1([1:b-1, b+1:end])) + lt1;
U(1) = min(AT1([1:b-1, b+1:end])) + lt1 + dt1;
L(2) = max(AT2) + lt2;
U(2) = min(AT2) + lt2 + dt2;
 
th = max([L, phy]); %   整体周期时间

%% 计算等待时间(第三种情况）W1 = zeros(1,n1);
Ws1 = zeros(1,n1); 
W1 = zeros(1,n1);
if U(1) < th
    E = logical((AT1 + lt1 + dt1< th) .* (AT1 ~= 0));
    W1(E) = th - AT1(E) - dt1 - lt1;
    Ws1(n1) = th - phy(1) - sum(W1);
end

W2 = zeros(1,n1);
Ws2 = zeros(1,n1);
if U(2) < th
    E = logical((AT2 + lt2 + dt2< th) .* (AT2 ~= 0));
    W2(E) = th - AT2(E) - dt2 - lt2;
    Ws2(n1) = th - phy(2) - sum(W2);
end


