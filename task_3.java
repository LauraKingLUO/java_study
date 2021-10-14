import java.io.*;
import java.util.Scanner;
public class task_3 {
   public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,0};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			min= min <= arr[i] ? min:arr[i];
		}
		System.out.print("数组中的最小值："+min);
	}
 }
