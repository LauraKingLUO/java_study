import java.io.*;
import java.util.Scanner;
public class task_2 {
  public static void main(String[] args)
  {
      while(true)
      {
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        switch(num)
        {
        case 1:
          System.out.print("新建");
          break;
        case 2:
          System.out.print("打开文件");
          break;
        case 3:
          System.out.print("保存");
          break;
        case 4:
          System.out.print("刷新");
          break;
        case 5:
          System.out.print("退出");
                System.exit(0);		
         }
      }
  }
}
