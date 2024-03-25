import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        //Bài 3: Nhập vào số dòng và cột của mảng 2 chiều (row * col), khai báo và
        //nhập giá trị các phần tử mảng số nguyên 2 chiều. In giá trị các phần tử
        //mảng theo ma trận
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập só dòng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập só cột");
        int col = Integer.parseInt(scanner.nextLine());
        double [][] matran = new double[row][col];
        System.out.println("Nhập giá trị của ma trận");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("matran[%d][%d]",i,j);
                matran[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println("Giá trị của ma trận:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%.2f ", matran[i][j]);
            }
            System.out.println();
        }
    }
}
