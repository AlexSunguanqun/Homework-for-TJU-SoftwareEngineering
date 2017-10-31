package _02_Adapter;
/*图解设计模式第二章示例代码
 * 日期2017、09/20
 * 作者：宋宗垚
 * 
 * 使用委托的适配器的实现
 * 将print类作为父类，将banner类作为自己的一个内部成员，来调用他的方法
 *  * 适配者。这里连接提供方法的banner和提供要求（或者说调用形式的）print连接起来
 * 达到使用Print要求的方式，来执行banner中的方法
 */
public class PrintBanner extends Print{
	private Banner banner ;
	
	public PrintBanner(String string){
		this.banner = new Banner(string);
	}
	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		banner.showWithAster();
	}

}
