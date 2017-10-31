package _22_Command;
/**
 * 图解设计模式第22章示例代码
 * @author songzy
 * 日期2017/10/25
 * 《命令也是类》
 */


import java.awt.Point;

public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
