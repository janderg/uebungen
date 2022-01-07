# **Informatik I, Übung 07**

## **Java. Reverse Engineering**

    public static foo(int x) {
        b = true;
        t = 2;
        while ((t*t <= x) && b) {
            b = ((x%t) != 0);
            t++;
        }
        res = (b && (x != 1));
        return res;
    }

**1.**

    public static boolean foo(int x) {
        boolean b , res;
        int t;
        b = true;
        t = 2;
        while ((t*t <= x) && b) {
            b = ((x%t) != 0);
            t++;
        }
        res = (b && (x != 1));
        return res;
    }

**2.**

Ja, weil entweder $b$ `false` wird, wenn $x%t !=0$ ergibt oder $t*t >= x$ ist. Bei allen Zahlen $< 4$ wird die while-Schleife gar nicht genutzt.

**3.**

Wenn `true`, dann ist $x$; $x!=1$ & durch $t$ mit Rest teilbar($(x%t!=0$).

Wenn `false`, dann ist $x$; $x=1$ oder durch $t$ ohne Rest teilbar($(x%t=0$).

---

## **Umkehrung des Horner-Schemas**

    String s = "";
    do {
        s = (z % q) + s;
        z = z / q;
    } while (z != 0);
    System . out. println (s);

**1.**

**2.**