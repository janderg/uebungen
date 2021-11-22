Markdown/AciiMath to HTML/PDF (by pandoc/wkhtmltopdf)
# **Informatik I, Übung 02, Aufgabe 1**
Markdown und AsciiMath
## **Größter gemeinsamer Teiler (ggT)**
### **Das ggT-Problem**
**Gegeben.** Zwei positive ganze $a$, $b$ $in$ $ZZ$ Zahlen mit $a$, $b$ $>$ $0$.

**Gesucht.** Eine positive ganze Zahl $d in ZZ$ mit $d > 0$ und folgenden Eigenschaften.
* $d$ teilt und $b$ ohne Rest
* es gibt keine ganze Zahl $d' in ZZ$ mit $d' > d$ , die $a$ und $b$ ohne Rest teilt

### **Der Euklidischer Algorithmus (klassisch)**
**Eingabe.** zwei ganze Zahlen $a$, $b$ mit $a > b >= 0$

**Initialisierung.** $x larr a$ , $y larr b$

**Iteration.** wiederhole das Folgende solange $y != 0$ gilt
* falls $(x > y)$ dann $x larr x - y$
* sonst $y larr y -x$

**Abschluss.** $d larr x$

**Rückgabe.** $d$

*Hinweis.* $A larr B$ steht für: speichere aktuellen Wert von $B$ in $A$.
### **Euklidischer Algorithmus in Java**
    // Eklidischer Algorithmus (klassisch)
    // Eingabe von a und b
    // Initialisierung
    int x = a;
    int y = b;
    // Iteration
    while (y != 0) { // ’!=’ steht fuer ’ungleich’
    if (x > y)
    x = x - y;
    else
    y = y - x;
    }
    // Abschluss
    int d = x
    // Rückgabe von d
---
# **Informatik I, Übung 02, Aufgabe 2**
## **Algorithmus zum Quadrieren natürlicher Zahlen**
### **Prosa**
Von der natürlichen Zahl $x$, also $x in {NN}$, soll die Quadratzahl ($x^2$) ermittelt werden. 
Dafür nimmt man die Summe der ersten $x$ ungeraden Zahlen.

### **Pseudocode**
**Eingabe.** natürliche Zahl $x$ 

**Initialisierung.** $n larr x$, $y = 0$, $"sum" = 0$

**Iteration.** Für ($i = 1$) $i < n*2$ addiere $2$ zu $i$
* $"sum " + i$
* $y + 1$
* Ausgabe $y$ und $i$

**Terminierung.**
* **Abschluss.** $i >= n*2$

* **Rückgabe.** liefere $"sum" rarr x^2$

### **Java-Code (Fragment)**
    int n = Integer.parseInt(args[0]);
    int y = 0; 
    int sum = 0;
    for (int i=1; i<=n*2; i+=2){
        sum += i;
        y += 1;
        System.out.println("Die " + y + ". ungerade Zahl ist " + i);   
    }    
    System.out.println("Die Quadratzahl aus dem Betrag von " + n + " ist = " + sum);