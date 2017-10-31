package _04_FactoryMethod;

public abstract class Factory {
	public final Product creat(String string){
		Product p = creatProduct(string);
		signProduct(p);
		return p;
	}
	protected abstract Product creatProduct(String string);
	protected abstract void signProduct(Product p);
}
