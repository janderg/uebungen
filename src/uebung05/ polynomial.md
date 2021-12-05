# **Informatik I, Übung 04**
## **Polynomfunktion**
### **1.**
    q = a [0];
    for (i = 1; i <= n; i++) {
    potenz = 1;
    for (j = 1; j <= i*i; j++)
    potenz = potenz * x;
    q = a[i] * potenz + q;
    }
    return q;
    
Addition: n

Multiplikation: $n+sum_(i=1)^n i*i$
### **2.** 
a)

$q =(...((a_n)x^((n^2)-(n-1)^2)+a_(n-1))x^((n-1)^2-(n-2)^2)+...)x^(1^2)+a_0 $

b)

Die Potenzen von x können in einem Array mit größe N gespeichert werden und die Potenzen selbst durch: $Potenz[n] = 1 + n*2 + Potenz[n-1]$ berechnet werden.

c)

Eingabe: Koefizienten: a[n],..,a[o] und $x$

    Array [n] exp;
    q = a [n];
    for (i = 1; i <= n; i++) {
    exp [i] = 1 + (i-1) * 2
    }
    for (j = n; j >= 1; j--) {
    q = q * Math.pow(x,exp[j]) + a[j-1];
    }
    return q;

d)

2n Additionen, 2n Multiplikationen
### **3.**
**a)**

$x^(n * (n + 1) * (2 * n + 1) / 6)$

**b)**

Eingabe: Argument x, n ($n > 0$)

    long pow = (n * (n + 1) * (2 * n + 1) / 6);
    long q = 1;
    for (long i = 0; i < pow; i++)
        q *= x;

**c)**

Addition: 2

Multiplikation: (n * (n + 1) * (2 * n + 1) / 6) + 3
