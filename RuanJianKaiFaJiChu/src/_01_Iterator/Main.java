package _01_Iterator;
/*图解设计模式第一章示例代码
 * 日期2017、09/20
 * 作者：宋宗垚
 * 
 */

public class Main {

	public static void main(String[] args) {
		//新建一个最多有四本书的书架，
		BookShelf bookshelf = new BookShelf(4);
		//在书架上添加4本书
		bookshelf.appendBook(new Book("Around the World in 80 Days"));
		bookshelf.appendBook(new Book("Bible"));
		bookshelf.appendBook(new Book("Cinderella"));
		bookshelf.appendBook(new Book("Daddy-Long-Legs"));
		//新建一个迭代器it
		Iterator it = bookshelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			//由于next返回的是一个object类，所要强制转化为lower case 的Book类
			System.out.println(book.getName());
		}
	}

}
