public class TypeAndOperatorExperiments {
    public static void main(String[] args) {
        //basistypen();
        operatoren();
        /*byte a = -2;
        char b = (char) a;
        System.out.println("b = " +(int) b);
        System.out.println("7/4 = "+  7/4);*/

    }

    public static void basistypen(){
        float f0 = 1_000_000_000_000L;
        float f1 = 1_000_000_000_001L;
        float f2 = 1_000_000_000_010L;
        float f3 = 1_000_000_000_100L;
        // ...
        //Auslöschung
        System.out.println(f1 - f0);
        System.out.println(f2 - f0);
        System.out.println(f3 - f0);

        // cast
        short s = (short) 246;
        byte b = (byte) 246;
        int n = (int)(char) -1;

        System.out.println("s = " + s);
        System.out.println("b = " + b);
        System.out.println("n = " + n);
    }

    public static void operatoren(){
        //Arithmetische Operatoren
        /*int n = 2;
        long l = 3L;
        var x = n + l;*/


        /*int n = 2;
        double d = 7.0;
        var x = n + d;
        System.out.println("x = " + x);*/

        /*short s1 = 1;
        short s2 = 2;
        short s3 = s1 + s2;*/

        //Division
        /*double d1 = 7 / 3;
        System.out.println("d1 = " + d1);
        double d2 = 7.0 / 3;
        System.out.println("d2 = " + d2);
        double d3 = 7 / 3.0;
        System.out.println("d3 = " + d3);
        double d4 = 7.0 / 3.0;
        System.out.println("d4 = " + d4);

        double d5 = 3 / 0.5;
        System.out.println("d5 = " + d5);*/
        // double d6 = 3 / (1/2);
        //System.out.println("d6 = " + d6);

        /*//Modulo 5 Minute
        int v1 = 11 % 4;
        System.out.println("v1 = " + v1);
        int v2 = 0 % 4;
        System.out.println("v2 = " + v2);
        // int v3 = 4 % 0;
        //System.out.println("v3 = " + v3);

        int v4 = -11 % 4;
        System.out.println("v4 = " + v4);
        int v5 = 11 % -4;
        System.out.println("v5 = " + v5);
        int v6 = -11 % -4;
        System.out.println("v6 = " + v6);

        double v7 = 3.5 % 2;
        System.out.println("v7 = " + v7);
        double v8 = 3.5 % 2.5;
        System.out.println("v8 = " + v8);
        double v9 = (22/7) % (19/7);
        System.out.println("v9 = " + v9);

*/
        //Inkrement- und Dekrement 5 Minute
        /*int n = 5;
        --n;
        int k = n++ - --n; //0
        int l = ++n + n--; //10
        n = n--; // 4

        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("n = " + n);

        double d = 3.14;
        char c = 'L';
        int n1 = (int) d--;
        int n2 = ++c;

        System.out.println("d = " + d);
        System.out.println("c = " + c);
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);*/

        //Vergleichsoperatoren 5 Minute
        /*boolean b1 = 4 == 4.0;
        System.out.println("b1 = "+b1);
        boolean b2 = 7L == (short) 5;
        System.out.println("b2 = "+b2);
        // boolean b3 = true == 1;
        boolean b4 = 'd' == 100;
        System.out.println("b4 = "+b4);
        boolean b5 = false == b4;
        System.out.println("b5 = "+b5);

        //String Vergleisch 5 Minute
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "a" + "b" + "c";
        String s4 = new String("abc");
        String s5 = s1 + "";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1 == s4: " + (s1 == s4));
        System.out.println("s1 == s5: " + (s1 == s5));

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equals(s4): " + s1.equals(s4));
        System.out.println("s1.equals(s5): " + s1.equals(s5));


        double d = Math.sqrt(2) * Math.sqrt(2);
        System.out.println(d == 2.0);

         */


        //Logische Operatoren & | ^

        /*
         &	    false	true
        false	false	false
        true	false	true
        */

        /*
          |     false	true
        false	false	true
        true	true	true
        */
        /*
          ^     false	true
        false	false	true
        true	true	false
        */



        // && || 3 Minute
        /*int n1 = 7;
        boolean b1 = n1 < 4 & ++n1 % 2 == 0;*/
        // n1 < 4 ：false
        // ++n1 : geben 8 zurück
        // 8 % 2 : 0
        // 0 == 0 : true
        // false & true : false
        // endet
        /*int n2 = 7;
        boolean b2 = n2 < 4 && ++n2 % 2 == 0;
        // n2 < 4
        // endet

        System.out.println("n1 == " + n1);
        System.out.println("b1 == " + b1);
        System.out.println("n2 == " + n2);
        System.out.println("b2 == " + b2);*/
/*
        boolean für_ÜPA_angemeldet = true;
        boolean Themen_gut_gelernt = true;
        boolean Themen_direkt_verstanden = true;
        boolean gutVorbereitet = für_ÜPA_angemeldet && (Themen_gut_gelernt || Themen_direkt_verstanden);
        System.out.println("gutVorbereitet  = "+gutVorbereitet);
*/

        // Zuweisungsoperatoren 5 Minute
        /*int n1 = 1, n2 = 2, n3 = 3;
        n1 = n2 = n3 = 4;

        System.out.println("n1 == " + n1);
        System.out.println("n2 == " + n2);
        System.out.println("n3 == " + n3);*/

        /*int n1 = 1, n2 = 2, n3 = 3;
        n1 += n2 += n3 += 4;

        System.out.println("n1 == " + n1);
        System.out.println("n2 == " + n2);
        System.out.println("n3 == " + n3);*/

        /*int n1 = 1, n2 = 2, n3 = 3;
        n1 += n2 + n3 = 4;

        System.out.println("n1 == " + n1);
        System.out.println("n2 == " + n2);
        System.out.println("n3 == " + n3);*/

        /*int n1 = 1, n2 = 2, n3 = 3;
        n1 += n2 = n3 + 4;

        System.out.println("n1 == " + n1);
        System.out.println("n2 == " + n2);
        System.out.println("n3 == " + n3);*/
    }
}
