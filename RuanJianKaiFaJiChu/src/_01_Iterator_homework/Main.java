package _01_Iterator_homework;
/*ͼ�����ģʽ��һ����ҵ
 * ����2017��09/20
 * ���ߣ����ڈ�
 * 
 */

public class Main {

	public static void main(String[] args) {
		//�½�һ��������ı������ܣ�
		BookShelf bookshelf = new BookShelf();
		//����������4����
		for(int i = 0;i<20;i++){
			bookshelf.appendBook(new Book("A"+i));
		}
		
		
		//�½�һ��������it
		Iterator it = bookshelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			//����next���ص���һ��object�࣬��Ҫǿ��ת��Ϊlower case ��Book��
			System.out.println(book.getName());
		}
	}

}
