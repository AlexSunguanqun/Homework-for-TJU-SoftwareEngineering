package _12_Decratror;

/**
 * ͼ�����ģʽ��12��ʾ������
 * @author songzy
 * ����2017/10/05
 * ��װ�α߿��뱻װ�����һ���ԡ�
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
