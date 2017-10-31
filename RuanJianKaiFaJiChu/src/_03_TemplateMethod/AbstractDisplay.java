package _03_TemplateMethod;

/**
 * Template Method开发模式是带有模板功能的模式， 在父类（abstract）中定义处理事物的的流程， 在子类中实现具体的处理方法
 *可以使逻辑处理通用化，把处理的套路在abstract的父类中写好，然后在子类中写具体操作
 *然后通过让实例调用父类中的操作套路（操作流程），完成目标 
 */
public abstract class AbstractDisplay {
	public abstract void open();

	public abstract void print();

	public abstract void close();

	public void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
