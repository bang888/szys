package tools;
import java.util.Random;
import java.util.Scanner;
public class Operate {
	public static int getRandom() {
		Random ran = new Random();
		return ran.nextInt(100);
	}
	 public static String getOperateEle() {
		 String[] operateEle = {"+","-","*","/"};
		 Random ran = new Random();
		 return operateEle[ran.nextInt(4)];
	 }
	 public static int getInput() {
		 Scanner scan = new Scanner(System.in);
		 int result = 0;
		 System.out.println( "ÇëÊäÈë½á¹û£º" );
		 result = scan.nextInt();
		 return result;
		 
	 }
}
