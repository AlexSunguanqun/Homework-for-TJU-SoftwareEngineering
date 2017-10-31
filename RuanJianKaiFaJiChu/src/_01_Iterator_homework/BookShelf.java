package _01_Iterator_homework;

import java.util.ArrayList;

/*ͼ�����ģʽ��һ����ҵ
 * ����2017��09/20
 * ���ߣ����ڈ�
 * ����࣬ʵ����Aggregate�����ӿ�
 */
public class BookShelf implements Aggregate{
	private ArrayList<Book> books;
	private int last = 0;
	public BookShelf(){
		this.books = new ArrayList<Book>();
	}
	public Book getBook(int index){
		return books.get(index);
	}
	public void appendBook(Book book){
		this.books.add(book);
		last++;
	}
	public int getLength(){
		return last;
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	

}
