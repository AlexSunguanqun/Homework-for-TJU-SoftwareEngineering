package _12_Decratror;

/**
 * 图解设计模式第12章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《装饰边框与被装饰物的一致性》
 */



public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }
    public int getColumns() {                   
        return 1 + display.getColumns() + 1;
    }
    public int getRows() {                     
        return 1 + display.getRows() + 1;
    }
    public String getRowText(int row) {         
        if (row == 0) {                                                
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {                      
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {                                                        
            return "|" + display.getRowText(row - 1) + "|";
        }
    }
    private String makeLine(char ch, int count) {        
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
