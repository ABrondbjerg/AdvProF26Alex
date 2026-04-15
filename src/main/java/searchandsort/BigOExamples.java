package searchandsort;

public class BigOExamples {
    public static void main(String[] args) {
        int n = 100000; // Juster n for at se effekten
        System.out.println("O(1) - Konstant tid:");
        constantTime(n);

        System.out.println("\nO(log n) - Logaritmisk tid:");
        logTime(n);

        System.out.println("\nO(n) - Lineær tid:");
        linearTime(n);

        System.out.println("\nO(n^2) - Kvadratisk tid:");
        quadraticTime(n);
    }

    // O(1) - Konstant tid
    public static void constantTime(int n) {
        System.out.println("Jeg printer altid én gang, uanset n.");
    }

    // O(log n) - Logaritmisk tid (Binær nedtælling)
    public static void logTime(int n) {
        for (int i = n; i > 1; i /= 2) {
            System.out.println("Jeg kører log n gange, n er nu: " + i);
        }
    }

    // O(n) - Lineær tid
    public static void linearTime(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Itererer: " + i);
        }
    }

    // O(n^2) - Kvadratisk tid
    public static void quadraticTime(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Kvadratisk iteration: " + i + "," + j);
            }
        }

    }

    // O(1)
    public int getFirst(int[] arr) {
        return arr[0];
    }
    // O(Log n)
    public boolean binarySearch(int[] sortedArr, int target) {
        int low = 0, high = sortedArr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArr[mid] == target) return true;
            else if (sortedArr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    // O(n)
    public int sumAll(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}

