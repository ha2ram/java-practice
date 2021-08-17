package kr.co.ezen.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	
	public void method1() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫번째 값: ");
		int first=sc.nextInt();
		System.out.println("두번째 값: ");
		int second=sc.nextInt();
		System.out.println("연산자(+,-,*,/)");
		char op=sc.next().charAt(0);
		
		int result=0;
		
		switch(op) {
		case '+':
			result=first+second;
			break;
		case '-':
			result=first-second;
			break;
		case '*':
			result=first*second;
			break;
		case '/':
			result=first/second;
			break;
		}
		
		System.out.println(first+" "+op+" "+second+"="+result);
		
		sc.close();
	}

	public void method2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("과일 이름을 입력하시오.");
		String fruit=sc.nextLine();
		
		int price=0;
		
		switch(fruit) {
		case "딸기":
			price=1000;
			break;
		case "바나나":
			price=3000;
			break;
		case "망고":
			price=5000;
			break;
		case "귤":
			price=10000;
			break;
		default:
			System.out.println("해당하는 과일이 없습니다.");
		}
		
		System.out.println(fruit+"의 가격은"+price+"원 입니다.");
		
		sc.close();
	}
	
	public void method3() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.회원 등록");
		System.out.println("2.회원 수정");
		System.out.println("3.회원 삭제");
		System.out.println("메뉴 번호를 입력하세요.");
		
		int menu=sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("회원 등록 메뉴입니다.");
			break;
		case 2:
			System.out.println("회원 수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("회원 삭제 메뉴입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}
	
	public void method4() {
		
		// 1~12월까지 입력받아 해당하는 달의 마지막 날짜를 출력
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int num=sc.nextInt();
		
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("입력하신 월은 31일 까지입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("입력하신 월은 30일 까지입니다.");
			break;
		case 2:
			System.out.println("입력하신 월은 28일 혹은 29일 까지입니다.");
			break;
		default:
			System.out.println("반드시 1~12월까지 입력해야 합니다.");	
		}
		
		sc.close();
	}
}
