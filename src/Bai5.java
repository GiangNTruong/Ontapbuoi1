import java.util.Scanner;

public class Bai5 {
    //Nhập số phần tử của mảng số thực 2 chiều (row*col), khai báo và
    //nhập giá trị các phần tử mảng 2 chiều số thực (row*col), in ra gia tri các
    //phần tử có giá trị chẵn và tính tổng các phần tử đó
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số hàng của ma trận:");
        int rows = scanner.nextInt();

        System.out.println("Nhập số cột của ma trận:");
        int cols = scanner.nextInt();

        double[][] matran = new double[rows][cols];

        System.out.println("Nhâập giá trị cho ma tran");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("matran[%d][%d]",i,j);
                matran[i][j] = scanner.nextDouble();
            }
        }
        double sum =0 ;
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cols; j++) {
                if(matran[i][j] %2==0){
                    System.out.printf("%-3f" , matran[i][j]);
                    sum += matran[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}