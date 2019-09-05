package functions;
import java.util.Scanner;
public class character_type {
	public static char low_up(char c)
	{
		if(c>='a' && c<='z')
		{
			return 'L';
		}
		else if(c>='A' && c<='Z')
		{
			return 'U';
		}
		else
		{
			return 'I'; 
		}
	}	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		System.out.println(low_up(a));
	}
}