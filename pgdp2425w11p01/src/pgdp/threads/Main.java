package pgdp.threads;

import java.util.stream.IntStream;

public class Main {
    public static long sumParallel(int[] array, int threadCount) {
        // TODO: Vervollständige diese Methode
        int length = array.length / threadCount;
        int modulo = array.length % threadCount;

        ParallelSummer[] threads = new ParallelSummer[threadCount];
        int size = 0;
        int currendIndex = 0;
        for (int i = 0; i < threadCount; i++) {

            if (modulo > 0){
                size = length+1;
                modulo--;
            }else {
                size = length;
            }
            threads[i] = new ParallelSummer(array, currendIndex, currendIndex + size);
            currendIndex += size;
        }

        for (Thread thread : threads){
            thread.start();
        }

        for (Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long result = 0;
        for (ParallelSummer thread : threads){
            result += thread.getResult();
        }

        return result;
        // throw new UnsupportedOperationException("Die Methode sumParallel muss noch implementiert werden");
    }

    public static void main(String[] args) {
        int[] toSum = IntStream.range(0, 1_000_000_000).toArray();

        long startTime = System.currentTimeMillis();

        // TODO: Setze threadCount auf verschiedene Werte und ermittele so
        //  1. ob du "korrekt" parallelisierst, also mit mehreren Threads die Berechnung tatsächlich schneller ist
        //  2. mit wie vielen Threads genau die Berechnung am schnellsten ist
        long result = sumParallel(toSum, 13);

        long finishTime = System.currentTimeMillis();

        System.out.println("Ergebnis der Berechnung: " + result);
        System.out.println("Dauer der Berechnung: " + ( finishTime - startTime ) + "ms");
    }
}
