package Bridge;

/**
 * 
 *作者：alaric
 *时间：2013-8-1下午10:58:25
 *描述：客车
 */
public class Guest implements Transport{

	@Override
	public void transport() {

		System.out.println("运客");
	
	}

}