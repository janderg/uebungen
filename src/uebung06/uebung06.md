# **Informatik I, Übung 06**
## **Java. Type Casting**
    public class TypeCasting {
        public static void main ( String [] args ) {
            short a =73;
            short b =219;
            short c=(short) (a+b);
            int d=(byte) c;
            short e= -3;
            int f=(char) e;
            int g=1;
            int h=4;
            double i=g/h *4.0;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println(h);
            System.out.println(i);
        }
    }

**1.**

**a)**

Die Zahl $73$ wird ausgegeben, da bei der Initialisierung, der Variable $a$, der Wert $73$ zugewiesen wurde und durch die Deklaration in den ganzzahligen Datentypen short gespeichert wurde.   
$rarr$ Eine beliebige ganze Zahl von $−32.768$ bis $32.767$ passt in ein short ($16$ bit).

**b)**

Die Zahl $219$ wird ausgegeben, da bei der Initialisierung, der Variable $b$, der Wert $219$ zugewiesen wurde und durch die Deklaration in den ganzzahligen Datentypen short gespeichert wurde.   
$rarr$ Eine beliebige ganze Zahl von $−32.768$ bis $32.767$ passt in ein short ($16$ bit).

**c)**

Die Zahl $292$ wird ausgegeben, da bei der Initialisierung, der Varibale $c$, der Wert $292$ durch die Addition von $a$ und $b$ zugewiesen wird und durch die Deklaration in den ganzzahligen Datentypen short gespeichert wurde.
Jedoch ist hier ein type casting notwendig, da durch die Addition von $a$ und $b$, der Wert automatisch in ein int gespeichert wird.
Ohne ein type casting zu short, gäbe es beim Übergang von int zu short Informationsverluste und die Ausgabe wäre fehlerhaft, da int $32$ bit hat und short $16$ bit.

**d)**

Die Zahl $36$ wird ausgegeben und nicht $292$, weil ein type casting von short ($16$ bit) in Byte ($8$ bit) vorgenommen wird. Da ein Byte jedoch aus $8$ bit besteht, ist die größtmöglich darstellbare Zahl $255$.
Demnach wird bei der Zahl $292$ (Binär:$100100100$) das vorderste Bit "eliminiert" und es bleiben die letzten $8$ bit übrig ($292-256 = 36$).

**e)**

Die Zahl $-3$ wird ausgegeben, da bei der Initialisierung, der Variable $e$, der Wert $-3$ zugewiesen wurde und durch die Deklaration in den ganzzahligen Datentypen short gespeichert wurde.   
$rarr$ Eine beliebige ganze Zahl von $−32.768$ bis $32.767$ passt in ein short ($16$ bit).

**f)**

Die Zahl $65533$ wird ausgegeben und nicht $-3$, weil der Datentyp char keine negativen Zahlen speichern kann. Dadurch, dass short die Zweierkomplement-Darstellung verwendet, entspricht die Darstellung der $-3$ in short der Darstellung von $65533$ in char.

**g)**

Die Zahl $1$ wird ausgegeben, da bei der Initialisierung, der Variable $g$, der Wert $1$ zugewiesen wurde und durch die Deklaration in den ganzzahligen Datentypen int gespeichert wurde.   
$rarr$ Der Standard-Zahlentyp umfasst ganze Zahlen von $-2.147.483.648$ bis $2.147.483.647$ ($32$ bit).

**h)**

Die Zahl $4$ wird ausgegeben, da bei der Initialisierung, der Variable $h$, der Wert $4$ zugewiesen wurde und durch die Deklaration in den ganzzahligen Datentypen int gespeichert wurde.   
$rarr$ Der Standard-Zahlentyp umfasst ganze Zahlen von $-2.147.483.648$ bis $2.147.483.647$ ($32$ bit).

**i)**

Die Zahl $0.0$ wird ausgegeben, da bei der Initialisierung, der Varibale $i$, der Wert $0.0$ durch die Divison von $g$ durch $h$ und der Multiplikation von $4.0$ zugewiesen wird und durch die Deklaration in den Gleitkomma-Datentypen double gespeichert wurde.
Durch die Division von $g$ durch $h$, erhält man zunächst den Wert $0.25$, jedoch wird dieser Wert automatisch in ein int gespeichert, wodurch die Nachkommastellen wegfallen (aus $0.25$ wird zunächst $0$).
Anschließend wird die $0$ mit $4.0$ multipliziert, was $0$ ergibt und dadurch, dass der Wert in ein double gespeichert wird, wird daraus $0.0$ (Gleitkomma-Datentyp).

**2.**

**Zeile $5$** $rarr$ **short $c=$(short) ($a+b$);**
Hierbei ist ein type casting notwendig, da durch die Addition von $a$ und $b$, der Wert automatisch in ein int gespeichert wird.
Ohne ein type casting zu short, gäbe es beim Übergang von int zu short Informationsverluste und die Ausgabe wäre fehlerhaft, da int $32$ bit hat und short $16$ bit.



---

## **Disassembly, Capture the Flag**

**Schritt 1:** man javap

*Ausgabe:*

	-p
	Shows all classes and members.


**Schritt 2:** `javap -p Test.class`

*Ausgabe:*

	public class Test {
  		public static final int password;
		public Test();
		public static void main(java.lang.String[]);
	}

int password wir in einer Konstanten `(static final)` gespeichert

**Schritt 3:** man javap

*Ausgabe:*

	-constants
	Shows static final constants.

**Schritt 4:** `javap -constants Test.class`

*Ausgabe:* 
```
	public class Test {
 		public static final int password = 42;
 		public Test();
 		public static void main(java.lang.String[]);
	}
```
**Schritt 5:** Passwort ablesen

*Passwort:* $42$