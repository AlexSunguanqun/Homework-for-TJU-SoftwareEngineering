package _03_TemplateMethod;

public class CharDisplay extends AbstractDisplay{
	char ch;
	public CharDisplay(char ch){
		this.ch = ch;
	}
	@Override
	public void open() {
		System.out.println("<<");
	}

	@Override
	public void print() {
		System.out.println(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");		
	}

}
