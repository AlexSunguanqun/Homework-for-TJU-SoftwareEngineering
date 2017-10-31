package _07_Builder;
/**
 * 图解设计模式第7章示例代码
 * @author songzy
 * 日期2017/09/28
 * 《组装复杂的实例》
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
