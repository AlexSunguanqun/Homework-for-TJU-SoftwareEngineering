package _01_Iterator;

/*图解设计模式第一章示例代码
 * 日期2017、09/20
 * 作者：宋宗垚
 * 
 * 书架上的迭代器类
 */
public class BookShelfIterator implements Iterator{
	//属性
	private BookShelf bookshelf;
	private int index;
	
	//方法
	//构造方法。需要指明建立的迭代器是在哪个书架上的。
	//并且将index初始化为0，即将迭代器放在书架的第一个元素位置之前的位置
	public BookShelfIterator(BookShelf bookshelf){
		this.bookshelf = bookshelf;
		this.index = 0;
	}
	//可以理解为是否可以调用next方法，
	
	@Override
	public boolean hasNext() {
		if(index<bookshelf.getLength()){
			return true;
		}
		else{
			return false;
		}
		
	}
	//返回当前的元素并且指向下一个
	@Override
	public Object next() {
		Book book = bookshelf.getBook(index);
		index++;
		return book;
	}
}
