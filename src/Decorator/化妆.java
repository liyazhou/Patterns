package Decorator;

public class 化妆 implements 女人 {

	private 女人 女人;
	@Override
	public void 打扮() {
		女人.打扮();
	}

}