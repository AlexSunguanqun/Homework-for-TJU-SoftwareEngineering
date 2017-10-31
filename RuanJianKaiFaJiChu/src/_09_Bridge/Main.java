package _09_Bridge;
/**
 * 图解设计模式第9章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《将类的功能层次结构与现实层次结构分离》
 */

public class Main {
    public static void main(String[] args) {
        Displayay d1 = new Displayay(new StringDisplayImpl("Hello, China."));
        Displayay d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
