package _08_Absttract_factory;

/**
 * 图解设计模式第8章示例代码
 * @author songzy
 * 日期2017/09/28
 * 《将关联的零件组装成产品》
 */

public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
