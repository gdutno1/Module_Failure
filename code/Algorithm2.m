function [A,B,r1,r2,a,c,d] = Algorithm2(n1,n2,b,g,h,e,f,m,z)

% ��ʼ������
%clc;clear;
%g = 4;  h = 4;  b = 2;  n1 = 4; n2 = 4; e = 3; f = -1; z = 10;
%m = -1; % BM ���ľ�Բ����C1
n = 1;

if g == 0   % �ж�C1��firstUT��λ���ǲ���LL
    if z == n1+n2+2
        r1 = 1;
        n=2; % n��ʾA(n)�ľ�Բ���
    else
        r1 = 0;
    end
end
i = n1; % ��C1���ξ�Բ���б�ţ��ڶ����֣�
while i >= b + 1
    A(i) = n;
    if i == g
        r1 = n + 1;
        n = n + 1;
    end
    i = i - 1;
    n = n + 1;
end
if m == 1   % ��ʱ��ʾBM�е�w��ж�ص�C1
    A(b) = n;  
    n = n + 1;
    if g == b
         r1 = z - b + 1;
    end
end
    
i = n2; %   ��C2�еľ�Բ���б��
if h == 0 % �ж�C2�е�FirstUT��λ���ڲ���BM
    r2 = n;
    n = n + 1;
%     c = r2; % ͬʱȷ��c��ֵ
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
if m == -1 % ��ʱBM�еľ�Բ������C2
    A(b) = n;  % ��ʱ��ʾBM�е�w��ж�ص�C1
    n = n + 1;
end


i = b - 1; % ��C1���ξ�Բ���б��
while i >= 1
    A(i) = n;
    if i == g
        r1 = n + 1;
        n = n + 1;
    end
    i = i - 1;
    n = n + 1;
end

if e ~= -1   % ��a��ֵ
    a = A(e); % a Ϊ����ģ���еľ�Բ���
else
    a = B(f);
end

d = max([max(B),r2,A(b)]);
c = min(min(B) ,r2);

end
    
    
    
    
    
    
    
    
    
    