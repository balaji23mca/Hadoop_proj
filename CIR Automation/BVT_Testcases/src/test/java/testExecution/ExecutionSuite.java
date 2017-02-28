package testExecution;

import drivers.WebActions;

public class ExecutionSuite extends WebActions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebActions newWebActions1 = new WebActions();
		newWebActions1.executeTestSuite("ie","STAGECIR","Smoke","QA");

	}

}	
