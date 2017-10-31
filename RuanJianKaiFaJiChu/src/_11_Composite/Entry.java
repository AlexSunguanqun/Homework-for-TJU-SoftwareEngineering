package _11_Composite;

/**
 * 图解设计模式第11章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《容器与内容的一致性》
 */


public abstract class Entry {
    public abstract String getName();                               
    public abstract int getSize();                                  
    public Entry add(Entry entry) throws FileTreatmentException {   
        throw new FileTreatmentException();
    }
    public void printList() {                                       
        printList("");
    }
    protected abstract void printList(String prefix);               
    public String toString() {                                    
        return getName() + " (" + getSize() + ")";
    }
}
