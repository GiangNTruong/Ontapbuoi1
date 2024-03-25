import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập giá trị cho các phần tử của mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử thứ " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhập giá trị cần tìm (findNumber): ");
        int findNumber = scanner.nextInt();

        int sum = 0;
        System.out.println("Các phần tử có giá trị bằng " + findNumber + " là:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == findNumber) {
                System.out.println("Phần tử thứ " + (i+1) + ": " + array[i]);
                sum += array[i];
            }
        }

        System.out.println("Tổng các phần tử có giá trị bằng " + findNumber + " là: " + sum);
    }
}
