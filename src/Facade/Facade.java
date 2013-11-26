package Facade;

/**
 * 
 *作者：alaric
 *时间：2013-7-30下午7:53:46
 *描述：门面类，就是我们的学长，学姐
 */
public class Facade {
	
	EnrollmentOffice enroll = new EnrollmentOffice();
	FinanceSection finance = new FinanceSection();
	StudentAffairsOffice studentAffairs = new StudentAffairsOffice();
	public void helpJion(){
		enroll.register();
		finance.payment();
		studentAffairs.getSomeGoods();
	}

}