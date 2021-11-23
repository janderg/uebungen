# **Informatik I, Übung 04**
## **Aufgabe 01**
### **Codierung von Sprachen**
**1.**

**a)**
5 Bits; $log_2(22) = ~4.459$

**b)**
4 Bits; $log_2(11) = ~3.459$

**c)**
Weniger Bits werden benötigt für die Kodierung, also wird mehr Rechenleistung gespart.

**2.**

**a)** 5 Bits; $log_2(26) = 4.7$

**b)** 4 Bits; $log_2(16) = 4$

**c)** ?

**d)** Die Glyphen, außer die '-Glyphe werden als Tripletts zusammengenommen $rarr 21/3=7$ und die Zahlzeichen 
werden mit der '-Glyphe kodiert + '-Glyphe $rarr 4$; $7+4+1=12$, also $log_2(12) = ~3.585$ = 4 Bits

**e)** Es wird anstatt bei a) nur 4 Bits benötigt, was wieder weniger Rechenleistung beansprucht.

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

* Zeile 1 , Fehler: Integer number to large
* Zeile 2 , Fehler: Integer number to large
* Zeile 4 , Fehler: Wrong data type > float

### Casting-Show (I1-ID: b9ej9071yii0)

1. `int n1 = (int) 3000000000.;`
2. `int n2 = (int) 3000000.0f;`
3. `long n3 = (long) 3000000000;`
4. `double n4 = (int) 30000000e0;`

Von den vorstehenden Codezeilen akzeptiert der Java-Compiler die Zeile 3 nicht, weil die Zahl zu groß für 'long' ist.

Die anderen Zeilen sind richtig, weil alle noch im möglichen Wertebreich der verschiedenen Integer liegen.  