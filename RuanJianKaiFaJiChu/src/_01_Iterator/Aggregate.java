package _01_Iterator;

/*图解设计模式第一章示例代码
 * 日期2017、09/20
 * 作者：宋宗垚
 * 
 */
//新建一个容器的接口，
//接口内有一个返回Iterator 迭代器的iterator方法
//由于是接口，所以接口内的方法都只能是abstract虚函数
public interface Aggregate {
	public abstract Iterator iterator();

}
