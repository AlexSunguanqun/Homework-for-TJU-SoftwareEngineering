package _21_Proxy;

/**
 * 图解设计模式第21章示例代码
 * @author songzy
 * 日期2017/10/25
 * 《只在必要时生成实例》
 */
public class Printer implements Printable {
    private String name;
    public Printer() {
        heavyJob("");
    }
    public Printer(String name) {                   
        this.name = name;
        heavyJob("(" + name + ")");
    }
    public void setPrinterName(String name) {       
        this.name = name;
    }
    public String getPrinterName() {                
        return name;
    }
    public void print(String string) {              
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }
    private void heavyJob(String msg) {            
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("");
    }
}
