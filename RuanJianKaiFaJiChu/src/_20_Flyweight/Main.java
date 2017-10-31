package _20_Flyweight;
/**
 * 图解设计模式第21章示例代码
 * @author songzy
 * 日期2017/10/25
 * 《只在必要时生成实例》
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }
        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
