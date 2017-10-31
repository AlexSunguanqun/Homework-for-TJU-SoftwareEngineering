package _05_Singleton;

/**
 * 2017/09/28
 * 
 * @author songzy ��һ����ֻ����һ��ʵ����ʱ�� Ӧ��ʹ��singleton���ģʽ
 *         �����ģʽ�У������췽������Ϊprivate���������о�������һ����̬�����ʵ��
 *         ֻ�����ṩһ����̬��getInstance��������д������Ǹ�ʵ���ķ�����
 *         ����������ֻ���Ե�����������������Ѿ����ɵ��Ǹ���̬�����ʵ���� ���������´���һ���µ�ʵ��
 *         ����������sing��һ����̬��ʵ��������ÿ�ε���getInstance�������صĶ���ͬһ��ʵ��
 */
public class Singleton {
	private static Singleton sing = new Singleton();

	private Singleton() {
		System.out.println("������һ��singleton��ʵ��");
	}

	public static Singleton getInstance() {
		return sing;
	}
}
