package _06_Prototype;

public interface Product extends Cloneable {
	public abstract void ues(String s);

	public abstract Product creatClone();
}
