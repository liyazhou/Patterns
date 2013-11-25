package Decorator;

public class Client {

	/**
	 *作者：alaric
	 *时间：2013-7-22下午10:57:13
	 *描述：测试
	 */
	public static void main(String[] args) {

		女人 女1 = new 程序媛();
		new 涂口红(new 刷睫毛(new 画眉(女1)));
		
	}

}