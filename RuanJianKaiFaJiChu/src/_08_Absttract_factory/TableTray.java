package _08_Absttract_factory;


/**
 * 图解设计模式第8章示例代码
 * @author songzy
 * 日期2017/09/28
 * 《将关联的零件组装成产品》
 */



import java.util.Iterator;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);               
    }
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table width=\"100%\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\""+ tray.size() + "\"><b>" + caption + "</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</tr></table>");
        buffer.append("</td>");
        return buffer.toString();
    }
}
