function [A,B,r1,r2,a,c,d] = Algorithm2(n1,n2,b,g,h,e,f,m,z)

% 初始化数据
%clc;clear;
%g = 4;  h = 4;  b = 2;  n1 = 4; n2 = 4; e = 3; f = -1; z = 10;
%m = -1; % BM 处的晶圆属于C1
n = 1;

if g == 0   % 判断C1中firstUT的位置是不是LL
    if z == n1+n2+2
        r1 = 1;
        n=2; % n表示A(n)的晶圆编号
    else
        r1 = 0;
    end
end
i = n1; % 对C1下游晶圆进行编号（第二部分）
while i >= b + 1
    A(i) = n;
    if i == g
        r1 = n + 1;
        n = n + 1;
    end
    i = i - 1;
    n = n + 1;
end
if m == 1   % 此时表示BM中的w会卸载到C1
    A(b) = n;  
    n = n + 1;
    if g == b
         r1 = z - b + 1;
    end
end
    
i = n2; %   对C2中的晶圆进行编号
if h == 0 % 判断C2中的FirstUT的位置在不在BM
    r2 = n;
    n = n + 1;
%     c = r2; % 同时确定c的值
% else
%     c = n;
end

while i >= 1
    B(i) = n;
    if i == h
        r2 = n + 1;
        n = n + 1;
    end
    i = i - 1;
    n = n  + 1;
end
if m == -1 % 此时BM中的晶圆将进入C2
    A(b) = n;  % 此时表示BM中的w会卸载到C1
    n = n + 1;
end


i = b - 1; % 对C1上游晶圆进行标号
while i >= 1
    A(i) = n;
    if i == g
        r1 = n + 1;
        n = n + 1;
    end
    i = i - 1;
    n = n + 1;
end

if e ~= -1   % 对a赋值
    a = A(e); % a 为故障模块中的晶圆编号
else
    a = B(f);
end

d = max([max(B),r2,A(b)]);
c = min(min(B) ,r2);

end
    
    
    
    
    
    
    
    
    
    