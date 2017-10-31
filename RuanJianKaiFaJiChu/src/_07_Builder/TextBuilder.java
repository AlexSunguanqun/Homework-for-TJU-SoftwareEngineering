package _07_Builder;
/**
 * 图解设计模式第7章示例代码
 * @author songzy
 * 日期2017/09/28
 * 《组装复杂的实例》
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();           
    public void makeTitle(String title) {                       
        buffer.append("==============================\n");     
        buffer.append("" + title + "n");                  
        buffer.append("\n");                                    
    }
    public void makeString(String str) {                        
        buffer.append(' ' + str + "\n");                       
        buffer.append("\n");                                  
    }
    public void makeItems(String[] items) {                    
        for (int i = 0; i < items.length; i++) {
            buffer.append("" + items[i] + "\n");           
        }
        buffer.append("\n");                                   
    }
    public void close() {                                      
        buffer.append("==============================\n");      
    }
    public String getResult() {                                 
        return buffer.toString();                               
    }
}
