package _10_Strategy;
/**
 * 图解设计模式第10章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《整体的替换算法》
 */

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
