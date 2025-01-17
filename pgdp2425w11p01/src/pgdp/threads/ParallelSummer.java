package pgdp.threads;

// TODO: Vervollständige diese Klasse, sodass sie einen Thread repräsentiert, der das übergebene Array von lowerBound
//  (inklusive) bis upperBound (exklusive) summiert und das Ergebnis in result speichert.
public class ParallelSummer extends Thread{
    private final int[] array;
    private final int lowerBound;
    private final int upperBound;

    private long result = 0;

    public ParallelSummer(int[] array, int lowerBound, int upperBound) {
        this.array = array;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public void run() {
        for (int i = lowerBound; i < upperBound; i++) {
            result += array[i];
        }
    }

    public long getResult() {
        return result;
    }
}
