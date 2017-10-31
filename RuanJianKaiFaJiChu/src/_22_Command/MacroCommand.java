package _22_Command;

/**
 * 图解设计模式第22章示例代码
 * @author songzy
 * 日期2017/10/25
 * 《命令也是类》
 */


import java.util.Stack;
import java.util.Iterator;

public class MacroCommand implements Command {
    private Stack commands = new Stack();
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command)it.next()).execute();
        }
    }
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }
    public void clear() {
        commands.clear();
    }
}
