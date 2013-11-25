package Composite;

/**
 * 
 *作者：alaric
 *时间：2013-7-20下午5:59:11
 *描述：普通员工类
 */
public class Employe implements Worker {

	private String name;

	public Employe(String name) {
		super();
		this.name = name;
	}
	@Override
	public void doSomething() {
		System.out.println(toString());
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "我叫"+getName()+",就一普通员工!";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

}


























