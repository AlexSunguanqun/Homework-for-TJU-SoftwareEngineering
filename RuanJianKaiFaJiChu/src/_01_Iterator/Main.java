package _01_Iterator;
/*ͼ�����ģʽ��һ��ʾ������
 * ����2017��09/20
 * ���ߣ����ڈ�
 * 
 */

public class Main {

	public static void main(String[] args) {
		//�½�һ��������ı������ܣ�
		BookShelf bookshelf = new BookShelf(4);
		//����������4����
		bookshelf.appendBook(new Book("Around the World in 80 Days"));
		bookshelf.appendBook(new Book("Bible"));
		bookshelf.appendBook(new Book("Cinderella"));
		bookshelf.appendBook(new Book("Daddy-Long-Legs"));
		//�½�һ��������it
		Iterator it = bookshelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			//����next���ص���һ��object�࣬��Ҫǿ��ת��Ϊlower case ��Book��
			System.out.println(book.getName());
		}
	}

}
