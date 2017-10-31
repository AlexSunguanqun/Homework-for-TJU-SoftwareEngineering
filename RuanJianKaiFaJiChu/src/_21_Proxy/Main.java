package _21_Proxy;
/**
 * 图解设计模式第21章示例代码
 * @author songzy
 * 日期2017/10/25
 * 《只在必要时生成实例》
 */

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("" + p.getPrinterName() + "");
        p.setPrinterName("Bob");
        System.out.println("" + p.getPrinterName() + "");
        p.print("Hello, world.");
    }
}
