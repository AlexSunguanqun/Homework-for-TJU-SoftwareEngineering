package _01_Iterator;

/*图解设计模式第一章示例代码
 * 日期2017、09/20
 * 作者：宋宗垚
 *
 *新建一个Iterator 迭代器 接口
 *该结构规定的方法有
 *1.hasNext判断是否有下一个元素。即，当前迭代的是否是最后一个
 *2.next函数，返回当前的元素，并且指向下一个
 *
 */
public interface Iterator {
	
	public abstract boolean hasNext();

	public abstract Object next();

}
