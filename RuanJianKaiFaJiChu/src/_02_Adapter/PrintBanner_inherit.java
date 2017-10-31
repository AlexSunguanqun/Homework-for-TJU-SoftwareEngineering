package _02_Adapter;
/*图解设计模式第二章示例代码
 * 日期2017、09/20
 * 作者：宋宗垚
 * 
 * 使用继承的适配器的实现
 * 适配者。这里连接提供方法的banner和提供要求（或者说调用形式的）print连接起来
 * 达到使用Print要求的方式，来执行banner中的方法
 */
public class PrintBanner_inherit extends Banner implements Print_inherit{

	public PrintBanner_inherit(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		showWithParen();
		
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		showWithAster();
	}

}
