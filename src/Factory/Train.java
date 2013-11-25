package Factory;

/**
 * 
 * 【描述】：火车 【作者】：alaric 【时间 】：May 20, 2012
 * 【文件】：com.pattern.SimpleFactoryTrain.java
 * 
 */
public class Train extends TrafficMachine {
	private int nodeNum; // 节数
	private int trainNum; // 车次

	@Override
	public void traffic() {
		// TODO Auto-generated method stub
	}

	public int getNodeNum() {
		return nodeNum;
	}

	public void setNodeNum(int nodeNum) {
		this.nodeNum = nodeNum;
	}

	public int getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(int trainNum) {
		this.trainNum = trainNum;
	}
}