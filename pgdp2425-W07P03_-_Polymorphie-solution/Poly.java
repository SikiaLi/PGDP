public class Poly {
     static class A {
         int x() {
             return 0;
         }

         int y = 3;

         static void f(A a) {
             System.out.print(a.x() + "-" + "A.x "); // stat. Typ: A.x() dyn. Typ: A.x()
             a.g(a); // sta. Typ :A.g(A)   dyn. Typ :A.g(A)
         }

         static void f(B b) {
             System.out.print(b.y + "-" + "A.f(B b) ");
             b.g(b); // sta. Typ :   dyn. Typ :
         }

         void g(A a) {
             System.out.println(a.y + "A.g(A a) ");
         }

         void g(B b) {
             System.out.print(b.y + "-" + "A.g(B b) ");
             this.f(this); // this : a1  sta. Typ :A.f(A)   dyn. Typ :A.f(A)
         }
     }

     static class B extends A {
         int x() {
             return 1;
         }

         int y = 9;

         static void f(A a) {
             System.out.print(a.y + "-" + "A.x ");
             (new A()).g(a); // sta. Typ : A.g(A)  dyn. Typ : A.g(A)
         }

         static void f(B b) {
             System.out.print(b.y + "-"+ "B.f(B b) ");
             ((B) b).f((A) b); // sta. Typ : B.f(A)  dyn. Typ : B.f(A)
         }

         void g(A a) {
             System.out.print(a.y + "-" + "B.g(A a) ");
             a.f((B) a); // sta. Typ :   dyn. Typ :
         }

         void g(B b) {
             System.out.print(b.x() + "-"+ "B.g(B b) "); // sta. Typ :  dyn. Typ :
             b.f(b); // sta. Typ :   dyn. Typ :
         }
     }

     public static void main(String[] args) {
         A a1 = new A();
         A a2 = new B();
         B b = new B();

         b.f(b); // Aufruf 1 //B.f(B)
         a1.g(b); // Aufruf 2 // stat. Typ : A.g(B) dyn. Typ : A.g(B)
         a2.f(b); // Aufruf 3
         a2.g(a1); // Aufruf 4
         a2.f(a2); // Aufruf 5
     }
}

/*
* Aufruf: 1
* Zeilennummer: 62
* b.f(b) stat. Typ: B.f(B) dyn. Typ: B.f(B)
* statischer Typ:
*  B
* kompatible Methoden (die gemäß statischem Typ aufgerufen werden könnten):
*  41, 14, 36, 9
* statisch gewähle Methode:
*  41
* Signatur:
*  f(B)
* Begründung:
*  speziellste Signatur,
*  niedrigste Unterklasse
* dynamischer Typ:
*  B
* zur Laufzeit ausgeführt:
*  41
* Begründung:
*  static, kein Dispatch
* Ausgabe:
*  9- (B.y)
*
 * Zeilennummer: 43
 * ((B) b).f((A) b) stat. Typ: B.f(A) dyn. Typ: B.f(B)
 * statischer Typ:
 *  B
 * kompatible Methoden (die gemäß statischem Typ aufgerufen werden könnten):
 *  36, 9
 * statisch gewähle Methode:
 *  36
 * Signatur (die Methodensignatur der statisch gewählten Methode):
 *  f(A)
 * Begründung:
 *  speziellste Signatur
 * dynamischer Typ:
 *  B
 * zur Laufzeit ausgeführt:
 *  36
 * Begründung:
 *  static, kein Dispatch
 * Ausgabe:
 *  3- (A.y)
*
 * Zeilennummer: 38
 * (new A()).g(a) stat. Typ: A.g(A) dyn. Typ: A.g(B)
 * statischer Typ:
 *  A
 * kompatible Methoden (die gemäß statischem Typ aufgerufen werden könnten):
 *  19
 * statisch gewähle Methode:
 *  19
 * Signatur (die Methodensignatur der statisch gewählten Methode):
 *  g(A)
 * Begründung:
 *  Eindeutig
 * dynamischer Typ:
 *  A
 * zur Laufzeit ausgeführt:
 *  19
 * Begründung:
 *  stat. Typ = dyn. typ
 * Ausgabe:
 *  3 (A.y)
 *
 *
 *
 * Aufruf: 2
 * Zeilennummer: 63
 * a1.g(b)  stat. Typ: A.g(B) dyn. Typ: A.g(B)
 * statischer Typ:
 *  A
 * kompatible Methoden (die gemäß statischem Typ aufgerufen werden könnten):
 *  23, 19
 * statisch gewähle Methode:
 *  23
 * Signatur (die Methodensignatur der statisch gewählten Methode):
 *  g(B)
 * Begründung:
 *  speziellste Signatur, niedrigste Unterklasse
 * dynamischer Typ:
 *  A
 * zur Laufzeit ausgeführt:
 *  23
 * Begründung:
 *  stat. Typ = dyn. typ
 * Ausgabe:
 *  9- (B.y)
 *
 * Zeilennummer: 25
 * this.f(this)==a1.f(a1) stat. Typ: A.f(A) dyn. Typ: A.f(A)
 * statischer Typ:
 *  A
 * kompatible Methoden (die gemäß statischem Typ aufgerufen werden könnten):
 *  9
 * statisch gewähle Methode:
 *  9
 * Signatur (die Methodensignatur der statisch gewählten Methode):
 *  f(A)
 * Begründung: Eindeutig
 * dynamischer Typ:
 *  A
 * zur Laufzeit ausgeführt:
 *  9
 * Begründung: static, kein Dispatch
 * Ausgabe:
 *  0- (A.x())
 *
 * Zeilennummer: 11
 * a.g(a)==a1.g(a1)  stat. Typ: A.g(A) dyn. Typ: A.g(A)
 * statischer Typ:
 *  A
 * kompatible Methoden (die gemäß statischem Typ aufgerufen werden könnten):
 *  19
 * statisch gewähle Methode:
 *  19
 * Signatur (die Methodensignatur der statisch gewählten Methode):
 *  g(A)
 * Begründung:
 *  Eindeutig
 * dynamischer Typ:
 *  A
 * zur Laufzeit ausgeführt:
 *  19
 * Begründung:
 *  stat. Typ = dyn. typ
 * Ausgabe:
 *  3 (A.y)
 *
 *
 *
 *
 * Aufruf: 3
 * Zeilennummer: 64
 * a2.f(b)  stat. Typ: A.f(B) dyn. Typ: B.f(B)
 * statischer Typ:
 *  A
 * kompatible Methoden (die gemäß statischem Typ aufgerufen werden könnten):
 *  9, 14
 * statisch gewähle Methode:
 *  14
 * Signatur (die Methodensignatur der statisch gewählten Methode):
 *  f(B)
 * Begründung:
 *  speziellste Signatur
 * dynamischer Typ:
 *  B
 * zur Laufzeit ausgeführt:
 *  14
 * Begründung:
 *  static, kein Dispatch
 * Ausgabe:
 *  9- (B.y)
 *
 * Zeilennummer: 16
 * b.g(b)   stat. Typ: B.g(B) dyn. Typ: B.g(B)
 * statischer Typ:
 *  B
 * kompatible Methoden (die gemäß statischem Typ aufgerufen werden könnten):
 *  51, 23, 46, 19
 * statisch gewähle Methode:
 *  51
 * Signatur (die Methodensignatur der statisch gewählten Methode):
 *  g(B)
 * Begründung:
 *  speziellste Signatur, niedrigste Unterklasse
 * dynamischer Typ:
 *  B
 * zur Laufzeit ausgeführt:
 *  51
 * Begründung:
 *  stat. Typ = dyn. typ
 * Ausgabe: 1- (B.x())
 *
 *
 * Zeilennummer: 53
 * b.f(b)   stat. Typ: B.f(B) dyn. Typ: B.f(B)
 * Aufruf 1
 *
 *
 * Aufruf: 4
 * Zeilennummer: 65
 * a2.g(a1)  stat. Typ: A.g(A) dyn. Typ: B.g(A)
 * statischer Typ:
 *  A
 * kompatible Methoden (die gemäß statischem Typ aufgerufen werden könnten):
 *  19
 * statisch gewähle Methode:
 *  19
 * Signatur (die Methodensignatur der statisch gewählten Methode):
 *  g(A)
 * Begründung:
 *  Eindeutig
 * dynamischer Typ:
 *  B
 * zur Laufzeit ausgeführt:
 *  46
 * Begründung:
 *  dynamisch ein B
 * Ausgabe:
 *  3- (A.y)
 *
 * Zeilennummer: 48
 * a.f((B) a)==a1.f((B) a1)   stat. Typ: A.f(B) dyn. Typ: A.f(A)
 * ClassCastException, dynamic Typ von a is A. A cannot be cast to B,
 *
 *
 * Aufruf: 5
 * Zeilennummer: 66
 * a2.f(a2)  stat. Typ: A.f(A) dyn. Typ: B.f(B)
 * statischer Typ:
 *  A
 * kompatible Methoden (die gemäß statischem Typ aufgerufen werden könnten):
 *  9
 * statisch gewähle Methode:
 *  9
 * Signatur (die Methodensignatur der statisch gewählten Methode):
 *  f(A)
 * Begründung:
 *  Eindeutig
 * dynamischer Typ:
 *  B
 * zur Laufzeit ausgeführt:
 *  9
 * Begründung:
 *  static, kein Dispatch
 * Ausgabe:
 *  1- (B.x())
 *
 *
 * Zeilennummer: 11
 * a.g(a)==a2.g(a2)   stat. Typ: A.g(A) dyn. Typ: B.g(B)
 * statischer Typ:
 *  A
 * kompatible Methoden (die gemäß statischem Typ aufgerufen werden könnten):
 *  19
 * statisch gewähle Methode:
 *  19
 * Signatur (die Methodensignatur der statisch gewählten Methode):
 *  g(A)
 * Begründung:
 *  Eindeutig
 * dynamischer Typ:
 *  B
 * zur Laufzeit ausgeführt:
 *  46
 * Begründung:
 *  dynamisch ein B
 * Ausgabe:
 *  3- (A.y)
 *
 * Zeilennummer: 48
 * a.f((B) a) == a2.f((B) a2)   stat. Typ: A.f(B) dyn. Typ: B.f(B)
 * a.f((B) a) == a2.f(b) => Aufruf 3
* */
