# **Informatik I, Übung 04**
## **Aufgabe 01**
### **Codierung von Sprachen**
**1.**

**a)**
<u>5 Bits</u>; $log_2(22) = ~4.459 rarr 9$

**b)**
<u>9 Bits</u>; $22^2 = 484$; $log_2(484) = ~8.919 rarr 9$ 

**c)**
Ein Wort mit 8 Glyphen mit der Methode aus a) ist ($8 * 5 = 40$) 40 Bits lang, mit Methode b) bräuchte man nur ($4*9 = 36$) 36 Bits. 
Was Rechenleistung schonen würde.

**2.**

**a)** <u>5 Bits</u>; $log_2(26) = 4.7 rarr 5$

**b)** <u>9 Bits</u>; $22^2-22-2+4+1=465$; $log_2(465) = 8.861 rarr 9$. 

**c)** Wenn man einen Text nur aus Zahlen und '-Glyphe hat, wäre die Codierung a) besser als b), weil a) weniger Bits benötigen würde.

**d)** $22^3-22^2+5^2-5-2=10182$, also $log_2(10182) = ~13.314 rarr 14$ = 14 Bits

**e)** 
* Mit a): $5*2 = 10$ = <u>10 Bits</u>
* Mit b): $14 * 1/3 = 4,6 rarr 5$ = <u>5 Bits</u>

---

## **Aufgabe 02**

### `long`, `long` ago (I1-ID: 5nufzi61yii0)

1. `int n1 = 3000000000;`
2. `long n2 = 3000000000;`
3. `long n3 = 300000000L;`
4. `long n4 = 300000000F;`

Nachfolgend sind die drei der vorstehenden Codezeilen aufgelistet,
die der Java-Compiler nicht akzeptiert,
jeweils mit einer Beschreibung des Fehlers.

* Zeile 1 , Fehler: Integer number to large: Die Zahl ist zu groß für int.
* Zeile 2 , Fehler: Integer number to large: Die Zahl ist zu groß für long.
* Zeile 4 , Fehler: Wrong data type > float: Die Zahl ist ein float, wird aber vom Compiler als long gelesen. Muss also sie noch in ein long gecastet werden.

### Casting-Show (I1-ID: b9ej9071yii0)

1. `int n1 = (int) 3000000000.;`
2. `int n2 = (int) 3000000.0f;`
3. `long n3 = (long) 3000000000;`
4. `double n4 = (int) 30000000e0;`

Von den vorstehenden Codezeilen akzeptiert der Java-Compiler die Zeile 3 nicht, weil die Zahl zu groß für 'long' ist.

Die anderen Zeilen sind richtig, weil...
* n1: Die Zahl ist eigentlich ein double wird aber in ein int gewandelt. Ein Compiler zeigt daher den maximalen positiven Wert (2147483647) von einem int an.
* n2: f steht für float, damit wird dem Compiler gesagt, dass die Zahl ein float sein soll. Die wird wiederum direkt zum int wieder umgewandelt.  Ausgabe: 3000000 (keinen wirklichen Nutzen in dem Fall)
* n4: Das e0 fässt die Nullen zusammen, sodass der Compiler 3.0E7 ausgibt. Die Zahl ist 57083918398 was für ein int zu groß wäre.