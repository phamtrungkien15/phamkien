import java.util.Scanner;

public class Bai6_PhamTrungKien {
	public static void main(String[] args) {
		System.out.println("vui long nhap gia tri: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		while (a <= 0) {
			System.out.println("nhap lai so nguyen duong: ");
			a = sc.nextInt();

		}
		System.out.println("co giao da nhap so thanh cong !");

		int ketQua = 1;
		for (int i = 1; i <= a; i++) {
			ketQua *= i;
		}
		System.out.println("gia thua cua so " + a + "!= " + ketQua);
		System.out.println("em cam on co giao da check !");
	}
}
