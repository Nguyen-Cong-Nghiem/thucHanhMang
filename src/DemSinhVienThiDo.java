import java.util.Scanner;

public class DemSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("Nhap vao do dai mang: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Size khong duoc qua 30");

            }
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.printf("Dien vao so diem cua sinh vien " + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sach diem la: ");
        for (int j = 0; j < array.length; j++) {
            System.out.printf(array[j] + "\t");
            if (array[j] > 5 && array[j] <10)
                count++;
        }
        System.out.printf("\n so hoc sinh thi do la: " + count);
    }
}
