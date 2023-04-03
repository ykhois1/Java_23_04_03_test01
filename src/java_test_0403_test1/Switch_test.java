package java_test_0403_test1;

import java.util.Scanner;

public class Switch_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점수를 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char grade ;
	
		
		switch(score/10){
		
    	case 10: 
		case 9:     grade = 'A'	;   break;
		case 8:     grade = 'B'	;   break;
		case 7:     grade = 'C'	;   break;
		case 6:     grade = 'D'	;   break;
		case 5:     grade = 'E'	;   break;
		default:    grade = 'F'	;   break;
    	
    	}
	
    	System.out.println("당신의 학점은 " +  grade + "입니다!" );

	}

}
