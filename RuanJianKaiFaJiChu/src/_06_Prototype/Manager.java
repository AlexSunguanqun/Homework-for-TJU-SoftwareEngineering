package _06_Prototype;
/*
 * 2017/10/18
 * ¸´ÖÆÄ£Ê½
 */
import java.util.*;

public class Manager {
	private HashMap showcase = new HashMap();
	public void register(String name,Product proto){
		showcase.put(name, proto);
	}
	public Product creat(String protoname){
		Product p = (Product)showcase.get(protoname);
		return p.creatClone();
	}
}
