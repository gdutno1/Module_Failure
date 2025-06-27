clc;clear;
%% 引入算法一，初始化数据
g = 4;  h = 4;  b = 2;  n1 = 4; n2 = 4; e = 3; f = 0; m=-1; z = 10;
[A,B,r1,r2,a,c,d] = Algorithm2(n1,n2,b,g,h,e,f,m,z);
BM = A(b);  
%% C1晶圆动作序列
i = g;  k = 1;  w = 0;  x = 0;  y = 0; l = 0;
tt = 1; % 用 tt 作为一个标签来判断nextUT属不属于L
if i == 0
    r1 = 0;
    i = 1;
    l = l + 1;  L(1) = 1; 
end
if m == 1   % 初始化 j, j 为第一个从BM上卸载的晶圆编号
    j = c - 1;
else
    j = c;
end
while i <= n1
    if i == b 
        if (e < b && j < a) || (e > b && j <= z)
            A(b) = j;   j = j + 1;
        end
    end
    if A(i) ~= 0
        w = w + 1;  D(w) = i;       
        E(w) = A(i);    A(i) = r1;  
        if tt == 0
            l = l + 1;
            L(l) = w;
        end
        if i ~= e-1 && i ~= e && i ~= n1
            x = x + 1;  F(x) = w;   r1 = E(w);  k = 1;  tt = 1;
        else
            y = y + 1;  G(y) = w;   r1 = 0; tt = 0;
        end
    end
    i = i + 1;
    if i == n1 + 1
        if (e < b && j < a) || (e > b && j <= z) || k == 1
            i = 1;  k = 0;
        end
    end
end

%% C2晶圆动作序列
i = h;  k = 1;  v = 0;  r = 0;  s = 0;   o = 0; tt = 1;
j = d + 1;
while i <= n2
    if i == 0 
        if (e < b && j < a) || (e > b && j <= z)
            v = v + 1;  P(v) = i;   Q(v) = j;   
            r2 = j;     j = j + 1;
            r = r + 1;  H(r) = v;   k = 1;  
            tt = 1;
        else
            tt = 0;
        end
        i = 1;
    end
    if B(i) ~= 0
        v = v + 1;  P(v) = i;   Q(v) = B(i);    B(i) = r2;  
        if tt == 0
            o = o + 1;
            O(o) = v;
        end
        if i ~= n2
            r = r + 1;  H(r) = v;   r2 = Q(v);  k = 1;  tt = 1;
        else
            s = s + 1;  S(s) = v;   r2 = 0; tt = 0;
        end    
    end
    i = i + 1;
    if i > n2 && k == 1
        i = 0;  k = 0;
    end
end

%%











