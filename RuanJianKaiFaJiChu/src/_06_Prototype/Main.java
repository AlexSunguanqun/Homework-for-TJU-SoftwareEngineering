package _06_Prototype;

public class Main {

	public static void main(String[] args) {
		//׼��,�½�һ��manager��������Ҫע�����
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		Messagebox mbox1 = new Messagebox('*');
		Messagebox mbox2 = new Messagebox('/');
		//��������Ҫע�����ע�ᵽmanager��
		manager.register("strong message", upen);
		manager.register("warning box", mbox1);
		manager.register("slash box", mbox2);
		//����
		Product p1 = manager.creat("strong message");
		p1.ues("Hello world");
		Product p2 = manager.creat("warning box");
		p2.ues("Hello world");
		Product p3 = manager.creat("slash box");
		p3.ues("Hello world");
	}

}
