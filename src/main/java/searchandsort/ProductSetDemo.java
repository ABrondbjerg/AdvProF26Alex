package searchandsort;
import searchandsort.entities.Product;

import java.util.HashSet;
import java.util.TreeSet;

public class ProductSetDemo {

    static final int SIZE = 100000;

    public static void main(String[] args) {

        TreeSet<Product> treeSet = new TreeSet<>();
        HashSet<Product> hashSet = new HashSet<>();

        // Populate
        for (int i = 0; i < SIZE; i++) {
            Product p = new Product("Product-" + i, i, i * 1.5);
            treeSet.add(p);
            hashSet.add(p);
        }

        Product target  = new Product("Product-75000", 75000, 0);
        Product missing = new Product("Ghost",         999999, 0);


        // Add

        Product newProduct = new Product("NewProduct", SIZE + 1, 9.99);

        // long start = System.currentTimeMillis();
        long start = System.nanoTime();
        treeSet.add(newProduct);
        // System.out.println("TreeSet add: " + (System.currentTimeMillis() - start) + " ms  — O(log n)");
        System.out.println("TreeSet add: " + (System.nanoTime() - start) + " ns  — O(log n)");

        start = System.currentTimeMillis();
        hashSet.add(newProduct);
        System.out.println("HashSet add: " + (System.currentTimeMillis() - start) + " ms  — O(1)");

        // Contains

        start = System.currentTimeMillis();
        boolean treeFound = treeSet.contains(target);
        System.out.println("TreeSet contains (exists):  " + (System.currentTimeMillis() - start) + " ms  — O(log n) — found: " + treeFound);

        start = System.currentTimeMillis();
        boolean hashFound = hashSet.contains(target);
        System.out.println("HashSet contains (exists):  " + (System.currentTimeMillis() - start) + " ms  — O(1)     — found: " + hashFound);

        start = System.currentTimeMillis();
        boolean treeMiss = treeSet.contains(missing);
        System.out.println("TreeSet contains (missing): " + (System.currentTimeMillis() - start) + " ms  — O(log n) — found: " + treeMiss);

        start = System.currentTimeMillis();
        boolean hashMiss = hashSet.contains(missing);
        System.out.println("HashSet contains (missing): " + (System.currentTimeMillis() - start) + " ms  — O(1)     — found: " + hashMiss);

        // Remove
        start = System.currentTimeMillis();
        treeSet.remove(target);
        System.out.println("TreeSet remove: " + (System.currentTimeMillis() - start) + " ms  — O(log n)");

        start = System.currentTimeMillis();
        hashSet.remove(target);
        System.out.println("HashSet remove: " + (System.currentTimeMillis() - start) + " ms  — O(1)");

    }
}
/*
HashSet - 0(1) - finder hurtigt grundet 'buckets'
Treeset - 0(log n) - sortere fra for at finde resultatet
 */