import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int u = 1; u <= i; u++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		System.out.println("=============================================");
		
		System.out.println("구구단 출력");
		System.out.println("2 미만의 숫자를 입력하면 구구단을 출력하지 않습니다");
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int multi = Integer.parseInt(inputData);
		if (multi<2) {
			System.out.println("구구단을 종료합니다");
		} else {
			System.out.println("출력할 구구단의 숫자를 입력하세요");
			new Scanner(System.in);
			String inputData2 = sc.nextLine();
			int user = Integer.parseInt(inputData2);
			for(int i=1; i<=9; i++) {
				System.out.println(user + "x" + i + "=" +user*i);
			}
			
			}
		
	

	}
}
