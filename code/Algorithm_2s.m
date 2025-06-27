clc;clear
n1 = 5;
n2 = 5;
b = 3;
g = 5;
h = 1;
f = 3;
A = [0 9 8 0 2 1];
B = [7 6 0 5 4 3];
a = 5;
c = 3;
d = 6;

i = g;  j = c;  k = 1;  w = 0;  x = 0;  y = 0;
while i <= n1
    if i == b && j <= a - 1
        A(b+1) = j;
        j = j + 1;
    end
    if A(i+1) ~= 0
        w = w + 1;  D(w+1) = i; E(w+1) = A(i+1);    A(i+1) = 0;
        if i ~= b - 1 && i ~= n1
            x = x + 1;  F(x+1) = w; A(i+2) = E(w+1); k = 1;   
        else
            y = y + 1;   G(y+1) = w;
        end
    end
    i = i + 1;
    if i == n1 + 1
        if j <= a - 1 || k == 1
            i = 1; k = 0;
        end
    end
end

i = h;  k = 1;  v = 0;  r = 0;  s = 0;
if B(1) ~= 0 && h > f
    B(1) = 0;
end
while i >= 0
    if B(i+1) ~= 0 && i ~= f
        v = v + 1;  P(v+1) = i; Q(v+1) = B(i+1);    B(i+1) = 0;
        if i ~= f - 1 && i ~= n2
            B(i+2) = Q(v+1);    k = 1;  r = r + 1;  H(r+1) = v;
        else
            s = s + 1;  S(s+1) = v;
        end
    end
    i = i - 1;
    if i < 0 && k == 1
        i = n2; k = 0;
    end
end
if P(v+1) == n2
    v = v + 1;  P(v+1) = f; Q(v+1) = B(f+1);    s = s + 1;
    S(s+1) = v;
else
    P(v+2) = P(v+1);    Q(v+2) = Q(v+1);
    P(v+1) = f; Q(v+1) = B(f+1);    v = v + 1;  s = s + 1;
    S(s+1) = v;
end

D = D(2:end);
E = E(2:end);
F = F(2:end);
G = G(2:end);
P = P(2:end);
Q = Q(2:end);
H = H(2:end);
S = S(2:end);
    

    
            