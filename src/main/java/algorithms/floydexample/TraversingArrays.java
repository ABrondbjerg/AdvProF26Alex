package algorithms.floydexample;

public class TraversingArrays {

    public static void naiveWalk(int[] array) {
        int current = array[0];
        while (current != -1 && current != array.length) {
            System.out.print(current + " → ");
            current = array[current];
        }
        System.out.println("null");
    }

    public static boolean hasCycle(int[] array) {
        int slow = 0;
        int fast = 0;

        while (fast < array.length &&
                        array[fast] < array.length) {
            slow = array[slow];                    // ét skridt
            fast = array[array[fast]];             // to skridt

            if (slow == fast) {
                return true;
            }
        }

        return false; // hvis vi rammer enden uden at mødes
    }



}
