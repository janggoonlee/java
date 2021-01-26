package JavaBeginnerStart;

import java.util.Scanner;

public class Munja_yeal {

	public static void main(String[] args) {
		/// 문자열 
/*	
//p. 302		
		String str = "IT CookBook, Java";
		
		int len;
		
		len = str.length();
		
		System.out.printf("문자열: %s \n",str);
		System.out.printf("문자열 길이: %d", len);
*/		
	
/*		
		Scanner s = new Scanner(System.in);
		
		String str;
		
		System.out.print("문자열 입력==> ");
		str = s.nextLine();
		
		System.out.print("출력 문자열==>");
		
/*	
		for(int i = 0; i<str.length();i++) { 
			if(str.charAt(i)=='o') {
				System.out.printf("%c",'$');
			}
			else
				System.out.printf("%c",str.charAt(i));
		}
*/	

/*		
		//// 출력전 문자 뒤에 +1 해보기 
		Scanner s = new Scanner(System.in);
		
		String str;
		
		System.out.print("문자열 입력==> ");
		str = s.nextLine();
		
		System.out.print("출력문자열==> ");
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='o') {
				System.out.printf("%c",'$');
			}
			else {
				System.out.printf("%c",str.charAt(i)+1); // 출력전 문자에 +1 하면 다음 알파벳으로 한칸씩 밀려서 출력
			}
		}
*/		
	
/*		
		/// indexOf(): 찾을 문자열 맨처음것으로 찾아줌 ,lastIndexOf(): 마지막 나오는걸 찾아줌 
		
		String str =  "자바는 어렵다, 왜이리 어렵나? ";
				System.out.print("문자열==>"+ str);
		
				
				System.out.println(str.indexOf("어렵")); // 앞에서 찾아준다 0 에서 시작
				System.out.println(str.lastIndexOf("어렵")); //뒤에서 가까운것을 찾아준다 0에서 시작
*/				
		

/*		
	// repalce():문자열을 바꿔줌 , substring():일부 문자열 추출, split(): 문자열 분리	
		Scanner s = new Scanner(System.in);
		
		String str, strRep, strSub, strAry[];
		
		System.out.print("문자열을 입력하세요 : ");
		str = s.nextLine();
		// It CookBook Java Progreming 입력 
		strRep = str.replace(" ", "$");// 공백을 달러로 바꾼다.
		strSub = str.substring(3,8);	//입력 문자열의 세번째 부터 여덞 번째 문자를 추출.
		strAry = str.split(" "); //입력 문자열을 공백으로 분리.
		
		System.out.println("입력 문자열 ==> "+str);
		System.out.println("바꾼 문자열 ==> "+strRep);
		System.out.println("일부 문자열 ==> "+strSub);
		
		for(int i = 0; i<strAry.length; i++) {						//분리된 문자열 배열을 하나씩 출력
			System.out.println("분리된 문자열"+ i + "==> "+strAry[i]); // 분리된 문자열 배열을 하나씩 출력
		}
*/
		
/*		
		//toUpperCase():대문자로 변환, toLowerCase():소문자로 변환, trim():앞뒤 공백제거.
		
		String str = "  한글  ABCD  efgh  ";
		
		System.out.println("원 문자열 ==> [" + str + "]");
		
		System.out.println("대문자로 ==> [" + str.toUpperCase() + "]"); // 대문자로 
		System.out.println("소문자로 ==> [" + str.toLowerCase() + "]"); // 소문자로
		System.out.println("공백제거 ==> [" + str.trim() +"]");// 중간 공백은 제거 하지 않는다 양끝만 제거
*/
	
/*		
		///compareTo():두 문자열 비교 , contains():문자열 포함확인
		
		String str1 = "Java Programming";
		String str2 = "Java IT CookBook";
		
		System.out.println("원 문자열1 ==> [" + str1 + "]");
		System.out.println("원 문자열1 ==> [" + str2 + "]");
		
		System.out.println(str1.compareTo(str2));
		 // 두 문자열을 비교 : java 까지는 같지만 P와 I 비교시 아스키코드 기준으로 두수를 뺀 결과값이 7 이라는것. 
		System.out.println(str1.contains("Java")); // Java 글자가 포함 되었는지 확인
*/	
		
		
		// == 연산자 비교 방법 , equals() 문자열 비교할때
		// length 배열 셀때 , length() 글자수 셀때 .


		
		
	}
	
}
