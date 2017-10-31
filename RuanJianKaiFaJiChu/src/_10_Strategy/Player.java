package _10_Strategy;



/**
 * 图解设计模式第10章示例代码
 * @author songzy
 * 日期2017/10/05
 * 《整体的替换算法》
 */

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;
    public Player(String name, Strategy strategy) {         
        this.name = name;
        this.strategy = strategy;
    }
    public Hand nextHand() {                               
        return strategy.nextHand();
    }
    public void win() {                 
        strategy.study(true);
        wincount++;
        gamecount++;
    }
    public void lose() {                
        strategy.study(false);
        losecount++;
        gamecount++;
    }
    public void even() {               
        gamecount++;
    }
    public String toString() {
        return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}
