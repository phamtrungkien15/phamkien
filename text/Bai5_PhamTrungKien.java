import java.util.Scanner;

public class Bai5_PhamTrungKien {
public static void main(String[] args) {
	int tong= 0;
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println(" vui long nhap so nguyen: ");
		int a = sc.nextInt();
		tong += a;
	}while(tong<=100);
	System.out.println("tong cac so vua nhap la: " + tong);
	System.out.println("em cam on co giao da check !");
}
}
