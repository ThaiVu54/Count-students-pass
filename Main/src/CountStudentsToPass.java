import java.util.Scanner;

public class CountStudentsToPass {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Số lượng nhập không được quá 30");
            }
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm sinh viên " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("danh sách điểm nhập:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\nsố sinh viên thi đỗ là: " + count);
    }
}
