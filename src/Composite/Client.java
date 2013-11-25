package Composite;

/**
 * 
 *作者：alaric
 *时间：2013-7-20下午5:49:37
 *描述：测试类
 */
public class Client {

	/**
	 *作者：alaric
	 *时间：2013-7-20下午5:49:32
	 *描述：
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader leader1 = new Leader("张三");
		Leader leader2 = new Leader("李四");
		Employe employe1 = new Employe("王五");
		Employe employe2 = new Employe("赵六");
		Employe employe3 = new Employe("陈七");
		Employe employe4 = new Employe("徐八");
		leader1.add(leader2);
		leader1.add(employe1);
		leader1.add(employe2);
		leader2.add(employe3);
		leader2.add(employe4);
		leader1.doSomething();
		
	}
}