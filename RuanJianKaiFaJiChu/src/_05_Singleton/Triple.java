package _05_Singleton;
/***
 * 
 * @author songzy
 *����ֻ����������ʵ��
 */
public class Triple {
	private static Triple tri0 = new Triple();
	private static Triple tri1 = new Triple();
	private static Triple tri2 = new Triple();

	private Triple() {
	}
	public static Triple getInstance(int id){
	Triple trix = new Triple();
		switch(id){
		case 0: trix = tri0;break;
		case 1: trix = tri1;break;
		case 2: trix = tri2;break;
		default:System.out.println("�����id����");
		}
		return trix;
	}
	
}
