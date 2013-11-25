package Adapter;

/**
 * 
 *作者：alaric
 *时间：2013-7-21下午6:44:05
 *描述：适配器类
 */
/*public class Adapter2 implements Target{

	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void operate2() {
		// 业务逻辑
	}

	@Override
	public void operate1() {
		//调用源的方法
		adaptee.operate1();
		
	}

}*/

public class Adapter2 implements Target{
	private Adaptee adaptee;
	public Adapter2(Adaptee adaptee){
		super();
		this.adaptee = adaptee;
	}
	
	@Override
	public void operate2(){
		
	}
	@Override
	public void operate1(){
		adaptee.operate1();
	}
}




