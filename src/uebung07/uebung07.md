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

Wenn `true`, dann ist $x$ eine Primzahl, also nur durch sich und $1$ ohne Rest teilbar. Bei `false` ist $x$ keine Primzahl.

---

## **Umkehrung des Horner-Schemas**

    String s = "";
    do {
        s = (z % q) + s;
        z = z / q;
    } while (z != 0);
    System . out. println (s);

**1.**

    public class UmkehrungHornerSchema {
        public static void main(String[] args) {
            System.out.print("binär:" + "\t\t\t");
            UmkehrungHSqa(13,2);
            System.out.print("\t" + "\n" + "Dezimalstellen: ");
            UmkehrungHSz(13,2);
        }
        public static void UmkehrungHSqa(int z, int q) {
            if (z != 0) {
            int x = z % q;
            z = z / q;
            UmkehrungHSqa(z,q);
            System.out.print(x);
            }
        }
        public static void UmkehrungHSz(int z, int q) {
            if (z != 0) {
            z = z / q;
            UmkehrungHSz(z,q);
            System.out.print(z);
            }
        }
    }

**2.**
**rekursives Ablaufprotokoll**

| Zeile       |   $z$   |   $x$   |
|:------------|:-------:|:-------:|
| $57,58$     |  $13$   |   $1$   |
| $59$        |   $6$   |   $1$   |
| $60$        |   $6$   |   $1$   |
| $57,58$     |   $6$   |   $0$   |
| $59$        |   $3$   |   $0$   |
| $60$        |   $3$   |   $0$   |
| $57,58$     |   $3$   |   $1$   |
| $59$        |   $1$   |   $1$   |
| $60$        |   $1$   |   $1$   |
| $57,58$     |   $1$   |   $1$   |
| $59$        |   $0$   |   $1$   |
| $60$        |   $0$   |   $1$   |
| $57,58$     |   $0$   |         |
| $61$        |         |$1101_2$ |
| $68$        | $0136$  |         |