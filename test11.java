import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		
		1.	10/4 �� ������� �Ҽ������� ����ض�
		.
		2.	�ϳ��� ������ �Է¹޾� �� ���� ������ ���ض�.

		3.	a�� 4.0, b�� 1.2�� �ʱ�ȭ�Ͽ� 4.0+1.2�� printf�� ����ض�.
		���� ���) 4.0+1.2=5.2
		3-1. �տ��� ����� 5.2�� �Ҽ����� ������. 

		4.	ScannerŬ������ �̿��Ͽ� �̸�, ��� ��, ����, ü���� �Է¹ް�, ����ϴ� ���α׷� �ۼ��ض�.
		���� ���) �Է��ض�: kim seoul 29 65.5
		                    �� �̸��� kim�̴�.
		                    ��� ���� seoul�̰�, ���̴� 29���̴�.
		                    �����Դ� 65.5kg�̴�.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		1. float a = 10/4;
		   System.out.println(a);


		2.Scanner s = new Scanner(System.in); 
 	   System.out.println("������ �Է��ϼ���!");
		  int n = s.nextInt();			
		  int a = n*n;
		  System.out.println(a);


		3.double a = 4.0, b = 1.2 ;
		  System.out.println(a+b);


		4.double a = 4.0, b = 1.2 ;
		  System.out.println(a+b);
		  System.out.println((int)(a+b));

		5.Scanner s = new Scanner(System.in);
				
		  System.out.println("�̸�");
		  String name = s.next();
				
		  System.out.println("����");
		  String area = s.next();
				
		  System.out.println("����");
		  int age = s.nextInt();
				
		  System.out.println("����");
		  float weight = s.nextFloat();
				
		  System.out.printf("�� �̸��� "+name+"�̴�.\n" + "������"+area+"�̰�,\n" + "���̴�" +age+ "�̴�.\n" + "�����Դ�" +weight+ "�̴�.");
	
	}
}
