package _23_Interpreter;
/**
 * 图解设计模式第23章示例代码
 * @author songzy
 * 日期2017/10/25
 * 《语法规则也是类》
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
