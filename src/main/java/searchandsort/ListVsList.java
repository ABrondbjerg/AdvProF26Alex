package searchandsort;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListVsList {

    public static void main(String[] args) {
        final int SIZE = 500000;
        final int MID  = 250000;

        ArrayList<Integer>  arrayList  = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // get
        long start, end;

        start = System.currentTimeMillis();
        arrayList.get(MID);
        end = System.currentTimeMillis();
        System.out.println("ArrayList  get: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.get(MID);
        end = System.currentTimeMillis();
        System.out.println("LinkedList get: " + (end - start) + " ms");

        // add(250000, 99)
        start = System.currentTimeMillis();
        arrayList.add(MID, 99);
        end = System.currentTimeMillis();
        System.out.println("ArrayList  add: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.add(MID, 99);
        end =System.currentTimeMillis();
        System.out.println("LinkedList add: " + (end - start) + " ms");

        //  remove
        start = System.currentTimeMillis();
        arrayList.remove(MID);
        end = System.currentTimeMillis();
        System.out.println("ArrayList  remove: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        linkedList.remove(MID);
        end = System.currentTimeMillis();
        System.out.println("LinkedList remove: " + (end - start) + " ms");
    }
}

/*
ArrayList - Finder værdi og erstatte værdi er INSTANT - MEN så skal alt rykkes 1 værdi. Så den LINIÆRT skal tælle andre værdier 1 op.
LinkedList - LINIÆRT tælle op - tilføje er INSTANT
 */