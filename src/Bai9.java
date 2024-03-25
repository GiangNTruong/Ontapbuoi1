import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Nhập chỉ số phần tử cần xóa:");
        int deleteIndex = scanner.nextInt();

        if (deleteIndex >= 0 && deleteIndex < n) {
            for (int i = deleteIndex; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            --n;
            System.out.println("Đã xóa phần tử tại chỉ số: " + deleteIndex);
        } else {
            System.out.println("Không tìm thấy chỉ số trong mảng");
        }

        System.out.println("Mảng sau khi cập nhật:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
