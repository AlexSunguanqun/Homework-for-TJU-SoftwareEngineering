package _12_Decratror;

/**
 * 图解设计模式第12章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《装饰边框与被装饰物的一致性》
 */

public class SideBorder extends Border {
    private char borderChar;                        
    public SideBorder(Display display, char ch) {   
        super(display);
        this.borderChar = ch;
    }
    public int getColumns() {                      
        return 1 + display.getColumns() + 1;
    }
    public int getRows() {                         
        return display.getRows();
    }
    public String getRowText(int row) {            
        return borderChar + display.getRowText(row) + borderChar;
    }
}
