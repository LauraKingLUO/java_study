import java.io.*;
public class task_1 {
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=0;i<=100;i++)
		{
			if(i%3==0&&i%5==0)
			{
				sum+=i;
			}
		}
		System.out.print("sum: "+ sum);
	}
}
