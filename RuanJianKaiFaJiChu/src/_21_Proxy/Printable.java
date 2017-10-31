/**
 * 图解设计模式第21章示例代码
 * @author songzy
 * 日期2017/10/25
 * 《只在必要时生成实例》
 */
package _21_Proxy;
public interface Printable {
    public abstract void setPrinterName(String name);   
    public abstract String getPrinterName();            
    public abstract void print(String string);          
}
