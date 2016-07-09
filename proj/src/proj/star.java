package print;
import java.util.Scanner;
public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3~5개 정도 해서 올리는데 클래스로 해도 괜찮고 메소드로 나눠도 괜찮고
//메소드로 나누면 맨처음에 어떤 모양 출력할껀지 입력 받아서 하게 하고
		System.out.println("어떤 모양 , 몇 줄?");
		System.out.println("모양번호)왼쪽정렬계단-1, 오른쪽정렬계단-2");
		System.out.println("피라미드-3 , 피라미드x2-4");
		Scanner scan = new Scanner(System.in);
		int num , n;
		System.out.println("모양번호입력");
		num = scan.nextInt();
		System.out.println("줄 수 입력");
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