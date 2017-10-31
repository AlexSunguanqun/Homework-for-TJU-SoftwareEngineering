package _12_Decratror;

/**
 * 图解设计模式第12章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《装饰边框与被装饰物的一致性》
 */

public class StringDisplay extends Display {
    private String string;                          
    public StringDisplay(String string) {           
        this.string = string;
    }
    public int getColumns() {                      
        return string.getBytes().length;
    }
    public int getRows() {                         
        return 1;
    }
    public String getRowText(int row) {            
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
