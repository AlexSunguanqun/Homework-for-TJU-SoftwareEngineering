package com.example.songzy.cantoolapp;

/**
 * Created by Song on 2017/10/12.
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
    private static String[] str_split(String str_in){
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
            str_arr[2] = str_in.substring(4,5);
            str_arr[3] = str_in.substring(5,str_in.length()-1);
        }
        return str_arr;
    }
    /*
    判断传入的字符串是否合法。
    一、以   t   开头的时候,即str_in[0] == "t"
        1.str_in[1]是长度为3的十六进制的CAN标准ID值范围
        2.str_in[2]属于【0,8】，
        3.DD部分的长度为双数，每对为一个十六进制数，数对的个数为str_in[2]的数字
     */
    private static boolean judge(String str_in){
        boolean bool = false;
        //表示是否以t或者T开头的boolen值
        boolean Tort_started = str_in.startsWith("T")||str_in.startsWith("t");
        //当字符串以


        return bool;
    }

    //建立表格，?

}