package _02_Adapter;
/*图解设计模式第二章示例代码
 * 日期2017、09/20
 * 作者：宋宗垚
 * 
 * 使用继承的适配器的实现
 */
public class Main_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//里氏替换原则
			Print_inherit p = new PrintBanner_inherit("Hello");
			p.printStrong();
			p.printWeak();
	}

}
