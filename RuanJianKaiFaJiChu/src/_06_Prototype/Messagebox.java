package _06_Prototype;

public class Messagebox implements Product {
	private char decochar;
	public Messagebox(char decochar) {
		this.decochar = decochar;
	}
	@Override
	public void ues(String s) {
		int length = s.getBytes().length;
		for (int i = 0;i<length+4;i++){
			System.out.print(decochar);
		}
		System.out.println();
		System.out.println(decochar+" "+s+""+decochar);
		for (int i = 0;i<length+4;i++){
			System.out.print(decochar);
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
