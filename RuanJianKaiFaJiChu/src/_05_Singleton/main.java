package _05_Singleton;

/**
 * 2017/09/28
 * 
 * @author songzy ��һ����ֻ����һ��ʵ����ʱ�� Ӧ��ʹ��singleton���ģʽ
 *         �����ģʽ�У������췽������Ϊprivate���������о�������һ����̬�����ʵ��
 *         ֻ�����ṩһ����̬��getInstance��������д������Ǹ�ʵ���ķ�����
 *         ����������ֻ���Ե�����������������Ѿ����ɵ��Ǹ���̬�����ʵ���� ���������´���һ���µ�ʵ��
 */
public class main {

	public static void main(String[] args) {
		System.out.println("Start:");
		/**Singleton�Ĳ��Բ���*/
//		Singleton obj1 = Singleton.getInstance();
//		Singleton obj2 = Singleton.getInstance();
//		if(obj1==obj2){
//			System.out.println("obj1��obj2����ͬ��ʵ��");
//		}
//		else{
//			System.out.println("obj1��obj2������ͬ��ʵ��");
//		}
		
		
		/**TicketMaker�Ĳ��Բ���*/
//		TicketMaker tm1 = TicketMaker.getInstance();
//		tm1.getTicketNumber();
//		tm1.getTicketNumber();
//		tm1.getTicketNumber();
//		TicketMaker tm2 = TicketMaker.getInstance();
//		if (tm1==tm2){
//			System.out.println("tm1��tm2��ͬһ��ʵ��");
//		}
//		else{
//			System.out.println("tm1��tm2����ͬһ��ʵ��");
//		}
//		tm2.getTicketNumber();
		
		
		/**Triple�Ĳ��Բ���*/
		Triple t0 = Triple.getInstance(0);
		Triple t1 = Triple.getInstance(1);
		Triple t2 = Triple.getInstance(2);
		
		
		
	}

}
