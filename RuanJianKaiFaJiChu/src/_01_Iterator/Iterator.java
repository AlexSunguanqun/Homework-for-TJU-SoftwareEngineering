package _01_Iterator;

/*ͼ�����ģʽ��һ��ʾ������
 * ����2017��09/20
 * ���ߣ����ڈ�
 *
 *�½�һ��Iterator ������ �ӿ�
 *�ýṹ�涨�ķ�����
 *1.hasNext�ж��Ƿ�����һ��Ԫ�ء�������ǰ�������Ƿ������һ��
 *2.next���������ص�ǰ��Ԫ�أ�����ָ����һ��
 *
 */
public interface Iterator {
	
	public abstract boolean hasNext();

	public abstract Object next();

}
