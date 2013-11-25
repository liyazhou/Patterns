package Factory;

/**
*
*【描述】：工厂类
*【作者】：alaric
*【时间 】：May 20, 2012
*【文件】：com.pattern.SimpleFactoryFactory.java
*
*/
public class Factory {
/**
*
*【描述】：创建车的实例 这个类里面的判断代码在实际应用中多配置成map，如果用spring 则可以配置在bean的xml内
*【作者】：alaric
*【时间 】：May 20, 2012
* @throws TypeErrorException
*
*/
    public TrafficMachine creator(String type) throws TypeErrorException{
        if(type.equals("Automobile")){
            return new Automobile();
        }else if (type.equals("Tractor")) {
            return new Tractor();
        }else if (type.equals("Train")) {
            return new Train();
        }else{
            throw new TypeErrorException("not find "+type);
        }
    }

}