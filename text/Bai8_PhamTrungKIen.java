import java.util.Scanner;

public class Bai8_PhamTrungKIen {
public static void main(String[] args) {
	int n;
	int tong = 0;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("co giao nhap kich thuoc mang: ");
		n = sc.nextInt();
	}while(n<0);
	int A[] = new int[n];
	for(int i = 0 ; i < n ; i++) {
		System.out.println("vui long nhap [" +i+ "]= ");
		A[i]= sc.nextInt();
		tong += A[i];
	}	
	float trungBinhCong = (float)tong/n;
	System.out.println("trung binh cong " + n + " so nguyen da nhap là : " + trungBinhCong);
	System.out.println("em cam on co giao da check!");
}
}
