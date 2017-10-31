package _22_Command;
/**
 * ͼ�����ģʽ��22��ʾ������
 * @author songzy
 * ����2017/10/25
 * ������Ҳ���ࡷ
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
