package print;
import java.util.Scanner;
public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3~5�� ���� �ؼ� �ø��µ� Ŭ������ �ص� ������ �޼ҵ�� ������ ������
//�޼ҵ�� ������ ��ó���� � ��� ����Ҳ��� �Է� �޾Ƽ� �ϰ� �ϰ�
		System.out.println("� ��� , �� ��?");
		System.out.println("����ȣ)�������İ��-1, ���������İ��-2");
		System.out.println("�Ƕ�̵�-3 , �Ƕ�̵�x2-4");
		Scanner scan = new Scanner(System.in);
		int num , n;
		System.out.println("����ȣ�Է�");
		num = scan.nextInt();
		System.out.println("�� �� �Է�");
		n = scan.nextInt();
		star(num, n);
	}
	private static void star(int a, int b) {
		// TODO Auto-generated method stub
		int i, j,k ;
		switch(a)
		{
		case 1 :
		{
			for( i = 0 ; i <  b; i++ )
			{
				for(j = 0 ; j <= i ; j ++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}break;
		case 2 :
		{
			for( i = 0 ; i <  b; i++ )
			{
				for(k = b-i; k> 1 ;k--)
				{
					System.out.print(" ");
				}
				for(j = 0 ; j <= i ; j ++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}break;
		case 3 :
		{
			for(i = 0 ; i < b ; i++)
			{
				for(j = b-1; j>i ; j --)
				{
					System.out.print(" ");
				}
				for(k= 0 ; k < 2*i +1; k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}break;
		
		case 4 :
		{
			for(i = 0 ; i < b ; i++)
			{
				for(j = b-1; j>i ; j --)
				{
					System.out.print(" ");
				}
				for(k= 0 ; k < 2*i +1; k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			for(i = 0 ; i < b ; i++)
			{
				for(j = 0 ; j <= i ; j ++)
				{
					System.out.print(" ");
				}
				for(k= b-2*i+3; k >1 ; k--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}break;
	}

	}

}