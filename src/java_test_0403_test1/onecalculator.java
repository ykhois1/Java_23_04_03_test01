package java_test_0403_test1;

import java.util.Scanner;						// 패케지를 선언으로 class를 가져옴

public class onecalculator {
	
	final double CHANGE_RATE = 1309.5 ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("당신의 이름은 무엇입니까? ");
//		Scanner scanner = new Scanner(System.in); // Scanner 객체가 선언됨
		
//		String student_name = scanner.next();
//		System.out.println("입력하신 이름은 " + student_name + "입니다.");
			// 0100 1110  오(0011 1000)  왼(0001 0011)

		System.out.println("당신의 나이는 얼마입니까? ");
		Scanner scanner = new Scanner(System.in); // Scanner 객체가 선언됨
		
		int student_age = scanner.nextInt();

		if(student_age >= 20) {
			System.out.println("당신은 성인이시군요!");			
		} else {
			System.out.println("당신은 미성년자이시군요!");						
		}
		System.out.println("당신의 나이는 " + student_age + "살 입니다.");
		scanner.close(); 						// Scanner 객체 닫기 
	}

}
