package main;
import tools.Operate;
import entity.TestSystem;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i = 0;
		 int inputResult = 0;
		 do {
			 TestSystem ts = new TestSystem(Operate.getRandom(),Operate.getRandom(),inputResult, Operate.getOperateEle());
			 System.out.println(ts);
			 inputResult = Operate.getInput();
			 if( inputResult == ts.getResult() ) { 
				 System.out.println( "回答正确!" ); 
				 TestSystem.setGrade(20); 
			 }else {
				 System.out.println( "回答错误！" );
			 }
			 i++;
			 
		 }
		 while(i < 5);
		 TestSystem.getGrade();
		 TestSystem.clear(); 
	}

}
