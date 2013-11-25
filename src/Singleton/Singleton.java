package Singleton;


//饿汉式单例
public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton(){}
	public static Singleton getInstance(){
		return singleton;
	}
}


//懒汉式单例
/*
public class Singleton {
	private static Singleton singleton;
	private Singleton(){}
	
	public static synchronized Singleton getInstance(){
		if(singleton==null){
			singleton = new Singleton();
		}
		return singleton;
	}
}
*/



/*
Class c = Class.forName(Singleton.class.getName());
Constructor ct = c.getDeclaredConstructor();
ct.setAccessible(true);
Singleton singleton = (Singleton)ct.newInstance();


*/

















