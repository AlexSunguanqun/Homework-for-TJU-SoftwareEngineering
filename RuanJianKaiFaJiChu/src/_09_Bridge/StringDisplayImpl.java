package _09_Bridge;
/**
 * 图解设计模式第9章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《将类的功能层次结构与现实层次结构分离》
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;                              
    private int width;                                  
    public StringDisplayImpl(String string) {          
        this.string = string;                           
        this.width = string.getBytes().length;          
    }
    public void rawOpen() {
        printLine();
    }
    public void rawPrint() {
        System.out.println("|" + string + "|");        
    }
    public void rawClose() {
        printLine();
    }
    private void printLine() {
        System.out.print("+");                         
        for (int i = 0; i < width; i++) {               
            System.out.print("-");                     
        }
        System.out.println("+");                        
    }
}
