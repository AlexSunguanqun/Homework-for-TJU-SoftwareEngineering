package _01_Iterator_homework;

import java.util.ArrayList;

/*图解设计模式第一章作业
 * 日期2017、09/20
 * 作者：宋宗垚
 * 书架类，实现了Aggregate容器接口
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
