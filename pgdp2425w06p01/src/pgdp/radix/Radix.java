package pgdp.radix;

import java.util.ArrayList;
import java.util.List;

import pgdp.PinguLib;

import static pgdp.PinguLib.*;

public class Radix {

    public static void radixSort(StringList unsorted) {
        StringList[] buckets = new StringList[256];
        for (int i = 0; i < 256; i++) {
            buckets[i] = new StringList();
        }
        int maxLength = 0;
        for (String s : unsorted) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        for (int index = maxLength - 1; index >=0; index--) {
            while (!unsorted.isEmpty()) {
                String s = unsorted.remove(0);
                buckets[charAt(s, index)].add(s);
            }
            for (int j = 0; j < 256; j++) {
                unsorted.addAll(buckets[j]);
                buckets[j].clear();
            }
        }
    }
}
