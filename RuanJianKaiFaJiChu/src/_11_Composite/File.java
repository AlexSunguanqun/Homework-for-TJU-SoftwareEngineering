package _11_Composite;

/**
 * 图解设计模式第11章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《容器与内容的一致性》
 */



public class File extends Entry {
    private String name;
    private int size;
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
