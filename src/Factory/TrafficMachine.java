package Factory;

/**
 * 
 * 【描述】：抽象类 车 【作者】：alaric 【时间 】：May 20, 2012
 * 【文件】：com.pattern.SimpleFactoryMachine.java
 * 
 */
public abstract class TrafficMachine {
	public float power;
	public float load;

	public abstract void traffic();
}