package _03_TemplateMethod;

/**
 * Template Method����ģʽ�Ǵ���ģ�幦�ܵ�ģʽ�� �ڸ��ࣨabstract���ж��崦������ĵ����̣� ��������ʵ�־���Ĵ�����
 *����ʹ�߼�����ͨ�û����Ѵ������·��abstract�ĸ�����д�ã�Ȼ����������д�������
 *Ȼ��ͨ����ʵ�����ø����еĲ�����·���������̣������Ŀ�� 
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
