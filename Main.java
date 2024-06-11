public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int d = 4;

        int[] rotatedArray = ArrayRotation.rotLeft(a, d);
        System.out.println(ArrayToString.arrayToString(rotatedArray));
    }
}