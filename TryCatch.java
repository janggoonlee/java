package JavaBeginnerStart;

public class TryCatch {

	public static void main(String[] args) {
		//예외처리 try,catch,finally
		//throw : 오류 메세지를 직접 만들어 사용한다
		
/*		
 		//aa[3]은 aa[3]=100; 과 같을수 없으니 try~ catch 활용
		int [] aa = new int[3];
		
		try { // 오류가 날것같은 코드를 이안에 묶는다 . try혼자 단독 수행 불가능.
			aa[3]=100;
		}catch(Exception e) { //catch 가 Exception e 을 이용해서 오류를 잡아준다. 
			System.out.println("배열 첨자가 배율 크기보다 커요!");
		}
		finally {
			System.out.println("종료"); // 이건 무조건 작동 . 
		}
*/	
		
/*		
		int aa [] = new int[3];
		
		try {
			aa[2] = 100/0;// 제일 위에 있어서 해결된것이다. 해결된 이후엔 다음 오류는 잡지 않는다. (ArithmeticException e)
			aa[3] = 100; // 해결 x 
		}catch(ArrayIndexOutOfBoundsException e) {
			 // 배열 인덱스 보다 실제보다 클때 발생하는 오류처리.
			System.out.println("배열이 첨자보다 커요~");
		}catch(ArithmeticException e) {
			// 수학문제가 잘못 되었을때 발생하는 오류처리.
			System.out.println("0으로 나누는 등의 오류에요~");
		}finally {
			System.out.println("저는 무조건 나옵니다.");
		}
*/		
		
		
	}

}
