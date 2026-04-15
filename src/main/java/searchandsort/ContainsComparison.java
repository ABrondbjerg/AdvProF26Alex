package searchandsort;
import java.util.ArrayList;
import java.util.HashSet;

public class ContainsComparison {

    public static void main(String[] args) {
        final int SIZE     = 500000;
        final int EXISTS   = 499999;
        final int MISSING  = 999999;

        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer>   hashSet   = new HashSet<>();

        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
            hashSet.add(i);
        }

        // exists
        long start, end;

        start = System.currentTimeMillis();
        arrayList.contains(EXISTS);
        end = System.currentTimeMillis();
        System.out.println("ArrayList  contains (exists):  " + (end - start) + " ms");

        start = System.currentTimeMillis();
        hashSet.contains(EXISTS);
        end = System.currentTimeMillis();
        System.out.println("HashSet    contains (exists):  " + (end - start) + " ms");

        // missing
        start = System.currentTimeMillis();
        arrayList.contains(MISSING);
        end = System.currentTimeMillis();
        System.out.println("ArrayList  contains (missing): " + (end - start) + " ms");

        start = System.currentTimeMillis();
        hashSet.contains(MISSING);
        end = System.currentTimeMillis();
        System.out.println("HashSet    contains (missing): " + (end - start) + " ms");
    }
}

/*
ArrayList - skal tælle op igennem listen og tjekke om data er det vi leder efter LINIÆRT
HashSet - Er delt op i 'buckets' og finder derfor svaret hurtigt i KONSTANT
 */