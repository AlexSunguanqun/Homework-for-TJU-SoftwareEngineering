package _02_Adapter;

/*图解设计模式第二章示例代码
 * 日期2017、09/20
 * 作者：宋宗垚
 * 
 * banner作为被适配者，就是说需要调用banner的方法，但是需要给banner换个皮肤，换个调用方式
 */
public class Banner {
	private String string;

	public Banner(String string) {
		this.string = string;
	}

	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
