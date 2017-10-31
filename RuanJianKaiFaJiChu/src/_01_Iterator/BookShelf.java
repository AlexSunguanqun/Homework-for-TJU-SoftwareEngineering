package _01_Iterator;
/*图解设计模式第一章示例代码
 * 日期2017、09/20
 * 作者：宋宗垚
 * 书架类，实现了Aggregate容器接口
 */
public class BookShelf implements Aggregate{
	private Book[] books;
	private int last = 0;
	public BookShelf(int maxsize){
		this.books = new Book[maxsize];
	}
	public Book getBook(int index){
		return books[index];
	}
	public void appendBook(Book book){
		this.books[last] = book;
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
