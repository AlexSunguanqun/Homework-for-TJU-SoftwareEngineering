package _23_Interpreter;
import java.util.*;

import java.io.*;

/**
 * 图解设计模式第23章示例代码
 * @author songzy
 * 日期2017/10/25
 * 《语法规则也是类》
 */

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("program.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
