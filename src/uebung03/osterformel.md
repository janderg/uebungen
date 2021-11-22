# **Informatik I, Übung 03, Aufgabe 1**
## **Algorithmus zum Errechnen des Osterdatums von 1700 bis 1899**
### **Prosa**
Ein beliebiges Osterdatum zwischen den Jahren 1700-1899 soll mit der gaußschen Osterformel von Carl Friedrich Gauß ermittelt werden. 

**Gegeben:** 
Jahreszahl $x in NN$ ${1700 <= x <= 1899}$

Gaußsche Osterformel: 
1. Man deklariert 3 neue Variablen, $a=$ Jahreszahl $%19$, $b=$ Jahreszahl $%4$ und $c=$ Jahreszahl $%7$
2. Danach wird $d$ deklariert, $d=(19a+23)%30$
3. Zuletzt rechnet man $(2b+4c+6d+n)%7$, $n=3$, wenn das Jahr zwischen 1700 und 1799 liegt und $n=4$, wenn es zwischen 1800 und 1899 liegt. Das Ergebnis ist dann die Variable $e$. Um schließlich den Monat, März oder April, herauszufinden, rechnet man wenn $d+e>9$, $d+e-9$ für den April und wenn $d+e<9$ ist $22+d+e$ für den März.   

**Gesucht:** Das Datum vom Ostersonntag zwischen dem 22.März und 25.April

### **Pseudocode**
**Eingabe.** natürliche Zahl $x$ zwischen $1700$ und $1899$ 

**Initialisierung.** $j larr x$, $a larr j % 19$, $b larr j % 4$, $c larr j % 7$, $d larr (19 * a + 23) % 30$, $n = 3$, $e larr (2*b + 4*c + 6*d + n) % 7$ 

**Iteration.**
* Wenn $j >= 1800$, dann $n=4$
* Wenn $e + d > 9$, dann $y larr d+e-9$ 
* Sonst $z larr d+e+22$

**Abschluss.** 
* $y rarr$ Apriltag
* $z rarr$ Märztag

**Rückgabe.** liefere Apriltag  || liefere Märztag

### **Java-Code (Fragment)**
    //Initialisierung
    int j = Integer.parseInt(args[0]);
        int a = j % 19;
        int b = j % 4;
        int c = j % 7;
        int d = (19 * a + 23) % 30;
        int n = 3;
        if (j > 1799){
            n = 4;
        }
        int e = (2*b + 4*c + 6*d + n) % 7;
    //Iteration
        if (e + d > 9){
            int apriltag = d + e - 9;
            System.out.println("Ostern war im Jahre " + j + " am " + apriltag + ". April."); //Terminierung
        }
        else {
            int märztag = d + e + 22;
            System.out.println("Ostern war im Jahre " + j + " am " + märztag + ". März."); //Terminierung
        }