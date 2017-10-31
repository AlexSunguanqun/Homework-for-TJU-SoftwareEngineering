package _12_Decratror;

/**
 * 图解设计模式第12章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《装饰边框与被装饰物的一致性》
 */


public abstract class Border extends Display {
    protected Display display;         
    protected Border(Display display) { 
        this.display = display;
    }
}
