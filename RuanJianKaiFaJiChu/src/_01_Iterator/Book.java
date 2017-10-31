package _01_Iterator;

/*图解设计模式第一章示例代码
 * 日期2017/09/20
 * 作者：宋宗垚
 * 图书类，作为放在书架上的具体元素，
 * 
 * 类中定义了book的私有的名字，和book的构造方法还有得到name的getName方法
 * 
 */
public class Book {
	private String name;

	public Book(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
