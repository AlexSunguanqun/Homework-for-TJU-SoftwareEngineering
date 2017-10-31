package _05_Singleton;

/**
 * 2017/09/28
 * 
 * @author songzy 当一个类只生成一个实例的时候 应当使用singleton编程模式
 *         在这个模式中，将构造方法设置为private并且在类中就生成了一个静态的类的实例
 *         只对外提供一个静态的getInstance获得在类中创建的那个实例的方法，
 *         这样在外面只可以调用这个方法，调用已经生成的那个静态的类的实例， 而不能重新创建一个新的实例
 */
public class main {

	public static void main(String[] args) {
		System.out.println("Start:");
		/**Singleton的测试部分*/
//		Singleton obj1 = Singleton.getInstance();
//		Singleton obj2 = Singleton.getInstance();
//		if(obj1==obj2){
//			System.out.println("obj1与obj2是相同的实例");
//		}
//		else{
//			System.out.println("obj1与obj2不是相同的实例");
//		}
		
		
		/**TicketMaker的测试部分*/
//		TicketMaker tm1 = TicketMaker.getInstance();
//		tm1.getTicketNumber();
//		tm1.getTicketNumber();
//		tm1.getTicketNumber();
//		TicketMaker tm2 = TicketMaker.getInstance();
//		if (tm1==tm2){
//			System.out.println("tm1和tm2是同一个实例");
//		}
//		else{
//			System.out.println("tm1和tm2不是同一个实例");
//		}
//		tm2.getTicketNumber();
		
		
		/**Triple的测试部分*/
		Triple t0 = Triple.getInstance(0);
		Triple t1 = Triple.getInstance(1);
		Triple t2 = Triple.getInstance(2);
		
		
		
	}

}
