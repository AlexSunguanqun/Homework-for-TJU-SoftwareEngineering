package _11_Composite;

/**
 * 图解设计模式第11章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《容器与内容的一致性》
 */

public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }
    public FileTreatmentException(String msg) {
        super(msg);
    }
}
