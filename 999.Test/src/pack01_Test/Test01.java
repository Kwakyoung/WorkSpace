package pack01_Test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("������ ���");
		System.out.println("2 �̸��� ���ڸ� �Է��ϸ� �������� ������� �ʽ��ϴ�");
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		
		int multi = Integer.parseInt(inputData);
		if (multi<2) {
			System.out.println("�������� �����մϴ�");
		} else {
			System.out.println("����� �������� ���ڸ� �Է��ϼ���");
			new Scanner(System.in);
			String inputData2 = sc.nextLine();
			int user = Integer.parseInt(inputData2);
			for(int i=1; i<=9; i++) {
				System.out.println(user + "x" + i + "=" +user*i);
			}
			
			}
	}

}
