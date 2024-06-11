public class ArrayRotation {
    public static int[] rotLeft(int[] a, int d) {
        int maxSize = 6;
        int n = Math.min(a.length, maxSize);
        d = d % n;

        int[] truncatedArray = new int[n];
        System.arraycopy(a, 0, truncatedArray, 0, n);

        int[] rotatedArray = new int[n];

        for (int i = d; i < n; i++) {
            rotatedArray[i - d] = truncatedArray[i];
        }

        for (int i = 0; i < d; i++) {
            rotatedArray[n - d + i] = truncatedArray[i];
        }

        return rotatedArray;
    }
}