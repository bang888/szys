package entity;

public class TestSystem {
	 private int num1;            
	 private int num2;
	 private String operateEle;        
	private int num3;
	 private static int grade = 0;        
	
	 public TestSystem() {
	 
	 }
	
	 public TestSystem(int num1,int num2,int num3,String operateEle) {
		 this.num1 = num1;
		 this.num2 = num2;
		 this.num3 = num3;
		 this.operateEle = operateEle;
		 
	 }
	 public int getNum1() {
		 return num1;
	 }
	 public void setNum1(int num1) {
		 this.num1 = num1;
	 }
	 public int getNum2() {
		 return num2;
	 }
	 public void setNum2(int num2) {
		 this.num2 = num2;
	 }
	 public void setNum3(int num3) {
		 this.num3 = num3;
	 }
	 public String toString() {
		 return this.num1 + this.operateEle + this.num2+this.operateEle+this.num3;
	 }
	 public int getResult() {
		 int result = 0;
		 switch(this.operateEle) {
		 case "+": result = this.num1 + this.num2;break;
		 case "-": result =  this.num1 - this.num2;break;
		 case "*": result =  this.num1 * this.num2;break;
		 case "/": result =  this.num1 / this.num2;break;
		 }
		 return result;
	 }
	 public static void getGrade() {
		 System.out.println( "考试结束，最后成绩为：" + TestSystem.grade );
	 }
	 public static void setGrade(int grade) {
		 TestSystem.grade += grade;
	 }
	 public static void clear() {
		 TestSystem.grade = 0;
	 }
}
