package _07_Builder;
/**
 * ͼ�����ģʽ��7��ʾ������
 * @author songzy
 * ����2017/09/28
 * ����װ���ӵ�ʵ����
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
