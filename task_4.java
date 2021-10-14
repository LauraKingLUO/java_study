import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class task_4 {
	public static void main(String[] args)
	{
        System.out.print(" 请输入班级人数:"+'\n');
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		int[] arr=new int[num];
		Random rand= new Random();
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=rand.nextInt(101);
		}
		int count=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<60)
			{
				count+=1;
			}
			sum+=arr[i];
		}
		System.out.print("不及格人数："+count+'\n');
		System.out.print("班级平均分："+sum/num+'\n');
	}
}
