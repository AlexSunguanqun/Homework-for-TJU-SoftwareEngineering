package _02_Adapter;
/*ͼ�����ģʽ�ڶ���ʾ������
 * ����2017��09/20
 * ���ߣ����ڈ�
 * 
 * ʹ�ü̳е���������ʵ��
 * �����ߡ����������ṩ������banner���ṩҪ�󣨻���˵������ʽ�ģ�print��������
 * �ﵽʹ��PrintҪ��ķ�ʽ����ִ��banner�еķ���
 */
public class PrintBanner_inherit extends Banner implements Print_inherit{

	public PrintBanner_inherit(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		showWithParen();
		
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		showWithAster();
	}

}
