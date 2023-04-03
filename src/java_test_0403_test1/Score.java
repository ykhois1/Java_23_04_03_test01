package java_test_0403_test1;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점수를 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char grade ;

/*
//		if(score >= 90) {
//			System.out.println("당신의 A 입니다!" );
//		} else if (score >= 80) {
//			System.out.println("당신의 성적은 B 입니다!" );
//		} else if (score >= 70) {
//			System.out.println("당신의 성적은 미 입니다!" );
//		} else if (score >= 60) {
//			System.out.println("당신의 성적은 양 입니다!" );
//	    } else {
//	    	System.out.println("당신의 성적은 가 입니다!" );
//	    }
		
		if(score >= 90)			grade = 'A'	;
		else if(score >= 80)	grade = 'B'	;
		else if(score >= 70)	grade = 'C';
		else if(score >= 60)	grade = 'D';
		else if(score >= 50)	grade = 'D';
	    else   					grade = 'F';
		
    	System.out.println("당신의 학점은 " +  grade + "입니다!" );
 */
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
