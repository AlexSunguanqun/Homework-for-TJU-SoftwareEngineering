package _12_Decratror;

/**
 * 图解设计模式第12章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《装饰边框与被装饰物的一致性》
 */


public abstract class Display {
    public abstract int getColumns();               
    public abstract int getRows();                  
    public abstract String getRowText(int row);     
    public void show() {                           
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
