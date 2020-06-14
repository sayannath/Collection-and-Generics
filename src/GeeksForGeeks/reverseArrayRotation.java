package GeeksForGeeks;

public class reverseArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int d = 2;

        leftRotate(arr, d); // Rotate array by d
        printArray(arr);
    }
    static void leftRotate(int[] a, int d){
        if (d == 0)
            return;
        int n = a.length;
        reverseArray(a, 0, d-1);
        reverseArray(a, d, n-1);
        reverseArray(a, 0, n-1);
    }
    static void reverseArray(int[] a, int start, int end){
        int temp;
        while(start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int[] a){
        for (int value : a) System.out.print(value + " ");
    }
}
