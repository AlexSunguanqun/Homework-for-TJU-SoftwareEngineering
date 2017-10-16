package com.example.songzy.cantoolapp;

/**
 * Created by Song on 2017/10/12.
 * 传入数据的解码部分
 *
 * 传入一个String字符串数据
 * 根据数据格式将数据分解为四部分
 * 建立一个数据表格，将string的数据部分写入表格中
 * 然后根据id查找数据库中需要进行的操作，从表格中获取数据
 * 得到传入数据的信息
 */

/**
 * str_in为传入字符串数据
 * str_arr为分割之后的字符串数组
 */

public class info_analysis {
    String sample_str1 = "t12380011121314151617\r";
    String sample_str2 = "t3FF400111213\r";
    String sample_str3 = "T123FABCD80011121314151617\r";
    String sample_str4 = "T1234567F81122334455667788\r";



    //总的操作流程方法，调用各个方法执行操作，进行字符串解析
    public String operate(String x){
        String str_out = null;
        return str_out;
    }


    //传入数据的解析，从蓝牙部分传进来字符串，根据编码规则，将字符串分解
    //并且返回一个字符串数组
    //测试正确，完成
    public static String[] str_split(String str_in){
        String[] str_arr = new String[4];
        //如果数据是以  t  开头的则以一下规则拆分
        if(str_in.startsWith("t")){
            str_arr[0] = "t";
            str_arr[1] = str_in.substring(1,4);
            str_arr[2] = str_in.substring(4,5);
            str_arr[3] = str_in.substring(5,str_in.length()-1);
        }
        //如果数据是以  T  开头的则以以下规则拆分
        else{
            str_arr[0] = "T";
            str_arr[1] = str_in.substring(1,9);
            str_arr[2] = str_in.substring(9,10);
            str_arr[3] = str_in.substring(10,str_in.length()-1);
        }
        return str_arr;
    }


    /*
    判断传入的字符串是否合法。
    一、以   t   开头的时候,即str_in[0] == "t"
        1.str_in[1]是长度为3的十六进制的CAN标准ID值范围
        2.str_in[2]属于【0,8】，
        3.DD部分的长度为双数，每对为一个十六进制数，数对的个数为str_in[2]的数字
        TODO
     */
    private static boolean judge(String str_in){
        boolean bool = false;
        //表示是否以t或者T开头的boolen值
        boolean Tort_started = str_in.startsWith("T")||str_in.startsWith("t");
        //当字符串以


        return bool;
    }


    //建立表格，将data中的16进制数据转化为八位的二进制数据，然后写入表格中，测试正确
    //完成
    public static char[][] write_in(String[] str_arr){
        //建立表格，
        char[][] table = new char[8][8];
        int[] value = new int[8];
        for(int i = 0;i<Integer.parseInt(str_arr[2]);i++){
            //将每对DD转化为int型，并且转化为二进制，填入每一行中
            //先切成一对一对的，将每对转化为一个字符串给v,测试得正确
            String v = str_arr[3].substring(i*2,i*2+2);

//            System.out.println();
            //然后把v转化为十进制数字，测试得正确
            int ten_value = Integer.parseInt(v,16);
//            System.out.println(ten_value);
            //将十进制数字转化为二进制的字符串,测试得正确
            String s = Integer.toBinaryString(ten_value);
            //将二进制的字符串，左侧补0，总长度为8补全结果为result,测试得正确
            String result = s;
            for(int j=0;j<(8-s.length());j++){
                result = "0"+result;
            }
            char[] char_arr = result.toCharArray();
            //将转化好的八位二进制数字写入table表格中
            for(int j = 0;j<8;j++){
                table[i][j] = char_arr[j];
//                System.out.print(table[i][j]);
            }

        }
        return table;
    }





}