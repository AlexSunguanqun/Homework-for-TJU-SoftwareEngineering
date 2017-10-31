package _07_Builder;
/**
 * 图解设计模式第7章示例代码
 * @author songzy
 * 日期2017/09/28
 * 《组装复杂的实例》
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {              
        this.builder = builder;                   
    }
    public void construct() {                       
        builder.makeTitle("Greeting");             
        builder.makeString("");        
        builder.makeItems(new String[]{            
            "",
            "",
        });
        builder.makeString("");                
        builder.makeItems(new String[]{            
            "",
            "",
            "",
        });
        builder.close();                           }
}
