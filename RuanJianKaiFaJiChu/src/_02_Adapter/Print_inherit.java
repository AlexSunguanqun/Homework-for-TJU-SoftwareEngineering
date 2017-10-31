package _02_Adapter;
/*图解设计模式第二章示例代码
 * 日期2017、09/20
 * 作者：宋宗垚
 * 
 * 使用继承的适配器的实现
 * print来定义需要的方法。可以使用接口和父类来实现
 * 在继承的模式中，使用接口的方法
 */
public interface Print_inherit {
public abstract void printWeak();
public abstract void printStrong();
}
