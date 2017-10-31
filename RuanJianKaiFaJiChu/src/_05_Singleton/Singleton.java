package _05_Singleton;

/**
 * 2017/09/28
 * 
 * @author songzy 当一个类只生成一个实例的时候 应当使用singleton编程模式
 *         在这个模式中，将构造方法设置为private并且在类中就生成了一个静态的类的实例
 *         只对外提供一个静态的getInstance获得在类中创建的那个实例的方法，
 *         这样在外面只可以调用这个方法，调用已经生成的那个静态的类的实例， 而不能重新创建一个新的实例
 *         由于设置了sing是一个静态的实例，所以每次调用getInstance方法返回的都是同一个实例
 */
public class Singleton {
	private static Singleton sing = new Singleton();

	private Singleton() {
		System.out.println("生成了一个singleton的实例");
	}

	public static Singleton getInstance() {
		return sing;
	}
}
