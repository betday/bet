public class b6 {
    public static void main(String[] args) {
        int[] numbers = {25, 24, 67, 78, 85, 151, 150, 30};
        int max = findMax(numbers);
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
