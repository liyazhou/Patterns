package Decorator;


public class 涂口红  extends 化妆 {

	private 女人 女人;
	
	
	public 涂口红(女人 女人) {
		super();
		this.女人 = 女人;
		打扮();
	}


	public void 打扮() {
		System.out.println("有了口红，哇塞，狐狸精一个！");
		女人.打扮();
	}

}