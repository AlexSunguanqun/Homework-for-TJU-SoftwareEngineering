package _21_Proxy;
/**
 * ͼ�����ģʽ��21��ʾ������
 * @author songzy
 * ����2017/10/25
 * ��ֻ�ڱ�Ҫʱ����ʵ����
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
