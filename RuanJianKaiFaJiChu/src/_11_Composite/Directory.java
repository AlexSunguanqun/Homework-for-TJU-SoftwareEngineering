package _11_Composite;

/**
 * 图解设计模式第11章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《容器与内容的一致性》
 */




import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
    private String name;                   
    private ArrayList directory = new ArrayList();      
    public Directory(String name) {         
        this.name = name;
    }
    public String getName() {              
        return name;
    }
    public int getSize() {                 
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    public Entry add(Entry entry) {        
        directory.add(entry);
        return this;
    }
    protected void printList(String prefix) {       
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
