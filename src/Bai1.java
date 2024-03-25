import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    //Bài 1: Khai báo mảng số nguyên gồm 5 phần tử, nhập giá trị các phần
    //tử từ bàn phím và in ra giá trị các phần tử của mảng
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.printf("Nhap gia tri phan tu vao mang");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu" + (i+1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Giá trị phan tu trong mang"+ Arrays.toString(arr));

    }

}
