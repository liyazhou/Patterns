package FactoryII;

interface IProduct {
	public void productMethod();
}

class Product implements IProduct {
	public void productMethod() {
		System.out.println("产品");
	}
}

interface IFactory {
	public IProduct createProduct();
}

class Factory implements IFactory {
	public IProduct createProduct() {
		return new Product();
	}
}

public class Client {
	public static void main(String[] args) {
		IFactory factory = new Factory();
		IProduct product = factory.createProduct();
		product.productMethod();
	}
}





















