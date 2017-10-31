package _01_Iterator_homework;
/*图解设计模式第一章作业
 * 日期2017、09/20
 * 作者：宋宗垚
 * 
 */

public class Main {

	public static void main(String[] args) {
		//新建一个最多有四本书的书架，
		BookShelf bookshelf = new BookShelf();
		//在书架上添加4本书
		for(int i = 0;i<20;i++){
			bookshelf.appendBook(new Book("A"+i));
		}
		
		
		//新建一个迭代器it
		Iterator it = bookshelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			//由于next返回的是一个object类，所要强制转化为lower case 的Book类
			System.out.println(book.getName());
		}
	}

}
