import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            pos = i;
            x = list[i];
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }

            if (x == list[pos]) {
                System.out.println("No need to insert " + x);
            } else {
                System.out.println("Insert " + x + " into " + list[pos] + " index");
                list[pos] = x;
            }

            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }
}
