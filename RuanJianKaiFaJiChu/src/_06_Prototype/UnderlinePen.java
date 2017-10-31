package _06_Prototype;

public class UnderlinePen implements Product {
	private char underline;
	public UnderlinePen(char underline) {
		this.underline = underline;
	}
	@Override
	public void ues(String s) {
		int length = s.getBytes().length;
		System.out.println("\""+s+"\"");
		for(int i = 0; i<length+4;i++){
			System.out.print(underline);
		}
		System.out.println();
	}

	@Override
	public Product creatClone() {
		Product p = null;
		try{
			p = (Product)clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return p;
	}

}
