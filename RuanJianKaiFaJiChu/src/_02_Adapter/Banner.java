package _02_Adapter;

/*ͼ�����ģʽ�ڶ���ʾ������
 * ����2017��09/20
 * ���ߣ����ڈ�
 * 
 * banner��Ϊ�������ߣ�����˵��Ҫ����banner�ķ�����������Ҫ��banner����Ƥ�����������÷�ʽ
 */
public class Banner {
	private String string;

	public Banner(String string) {
		this.string = string;
	}

	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
