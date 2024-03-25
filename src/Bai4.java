import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        // Nhập số phần tử và giá trị các phần tử của mảng một chiều số
        //nguyên. Tìm giá trị lớn nhất và nhỏ nhất trong mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mang");
        int size = scanner.nextInt();
        int [] arr = new int[size];
        System.out.println("nhập giá trị của phan tu trong mảng : ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int min =arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min : " + min);
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max : " + max);
    }
}
