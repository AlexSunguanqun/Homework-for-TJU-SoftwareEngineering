package _02_Adapter;
/*ͼ�����ģʽ�ڶ���ʾ������
 * ����2017��09/20
 * ���ߣ����ڈ�
 * 
 * ʹ��ί�е���������ʵ��
 * ��print����Ϊ���࣬��banner����Ϊ�Լ���һ���ڲ���Ա�����������ķ���
 *  * �����ߡ����������ṩ������banner���ṩҪ�󣨻���˵������ʽ�ģ�print��������
 * �ﵽʹ��PrintҪ��ķ�ʽ����ִ��banner�еķ���
 */
public class PrintBanner extends Print{
	private Banner banner ;
	
	public PrintBanner(String string){
		this.banner = new Banner(string);
	}
	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		banner.showWithAster();
	}

}
