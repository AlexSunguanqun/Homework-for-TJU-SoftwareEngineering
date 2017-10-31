package _09_Bridge;
/**
 * ͼ�����ģʽ��9��ʾ������
 * @author songzy
 * ����2017/10/05
 * ������Ĺ��ܲ�νṹ����ʵ��νṹ���롷
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
