package pgdp.math;

import static pgdp.PinguLib.*;

public class Calculator {

    public static void main(String[] args) {
        String start = "Wählen Sie eine Operation:\n" +
                "1) +\n" +
                "2) -\n" +
                "3) *\n" +
                "4) /\n" +
                "5) %\n" +
                "6) Programm beenden";
        int operator = readInt(start);

        while (operator<1||operator>6) {
            operator = readInt(start);
        }

        while (operator != 6) {

            while (operator<1||operator>6) {
                System.out.println();
                operator = readInt(start);
            }

            int firstOp = readInt("Ersten Operanden eingeben:");
            int secOp = readInt("Zweiten Operanden eingeben:");

            if ( (operator == 4 || operator == 5) && secOp == 0) {
                System.out.println("Fehler: Division durch 0!");
            } else {
                switch (operator) {
                    case 1:
                        System.out.println(firstOp + secOp);
                        break;
                    case 2:
                        System.out.println(firstOp - secOp);
                        break;
                    case 3:
                        System.out.println(firstOp * secOp);
                        break;
                    case 4 :
                        System.out.println(firstOp / secOp);
                        break;
                    case 5:
                        System.out.println(firstOp % secOp);
                        break;
                }
            }

            operator = readInt(start);
        }

    }

}
