package Proxy;


import java.lang.reflect.Proxy;  
  
/** 
 *  
 *作者：alaric 
 *时间：2013-7-24下午10:44:37 
 *描述：测试类  包括静态代理和动态代理 
 */  
public class Client {  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        //静态代理测试  
        CEO ceo = new CEO();  
        Leader leader1 = new Assistant(ceo);  
        leader1.sign();  
          
        System.out.println("=========================================");  
        //动态代理测试，一些三种方式都可以获得动态代理对象  
        //AssistantHandler ah = new AssistantHandler(ceo);  
        
        //Leader leader2 = (Leader) ah.createProxy(new CEO());  
        //leader2.sign();  
      
        //Leader leader3 = (Leader) Proxy.newProxyInstance(CEO.class.getClassLoader(),    
        //      ceo.getClass().getInterfaces(), ah);    
        //leader3.sign();  
          
/*        Leader leader4 = (Leader) Proxy.newProxyInstance(Leader.class.getClassLoader(),  
                 new Class[] { Leader.class },  
                 ah);  
        leader4.sign();  
        */
        /*Leader leader5 = (Leader) Proxy.newProxyInstance(
        		CEO.class.getClassLoader(), ceo.getClass().getInterfaces(), new InvocationHandler() {

        		@Override
        		public Object invoke(Object proxy, Method method, Object[] args)
        		throws Throwable {
        		Object result = null;    
        		        System.out.println("递给领导");  
        		        result = method.invoke(ceo, args);    
        		        System.out.println("装入袋子，送出");  
        		        return result;
        		}
        		});
        		leader5.sign();*/
          
    }  
  
}  