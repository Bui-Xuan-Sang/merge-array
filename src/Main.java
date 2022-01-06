import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sizeA, sizeB;
        int[] a;
        int[] b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng 1: ");
        sizeA = scanner.nextInt();
        a = new int[sizeA];
        int i = 0;
        System.out.println("Nhập các phần tử mảng thứ 1:");
        while (i < a.length) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            a[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Nhập độ dài mảng 2: ");
        sizeB = scanner.nextInt();
        b = new int[sizeB];
        int j = 0;
        System.out.println("Nhập các phần tử mảng thứ 2: ");
        while (j < b.length) {
            System.out.print("Nhập phần tử thứ " + j + ": ");
            b[j] = scanner.nextInt();
            j++;
        }
        // Cách 1:
//        int[] result = new int[a.length + b.length];
//        int pos = 0;
//        for( int element : a){
//            result[pos] = element;
//            pos++;
//        }
//        for (int element : b) {
//            result[pos] = element;
//            pos++;
//        }
//        System.out.println(Arrays.toString(result));
        // Cách 2:
        int[] c = merge(a, b);
        for (int k = 0; k < c.length; k++) {
            System.out.print(c[k] + " ");
        }
    }

    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i, j;
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
            for (j = 0; j < b.length; j++) {
                c[j + a.length] = b[j];
            }
        }
        return c;
    }
}
