package com.example.songzy.cantoolapp;

/**
 * Created by Song on 2017/10/18.
 * 本类代表数据库信息
 * 属性   为字符串id对应的表头和表头下属于他的操作指令字符串
 * 操作   为1.根据id去数据库中查找相应的字段
 *         2.将字段中需要取出的信息返回，
 *
 */

public class database_analysis {
    private  String id ;
    private String[] info = {"SG_HVAC_ACCfgSt:0|1@0+(1,0)[0|1]\"\"CDU",
                             "SG_HVAC_AirCirCfgSt:1|1@0+(1,0)[0|1]\"\"CDU",
                             "SG_HVAC_ComfortCfgSt:3|2@0+(1,0)[0|1]\"\"CDU"};
    //构造方法。根据id构造一个类
    public database_analysis(String id){
        this.id = id;
    }
    //根据id和数据库设置info数组，也就是对应id下的相应的操作
    public void setInfo(){

    }
    //根据message_table中的已经写入的信息，和数据库中的字符串，解出传入的物理数值
    public void analysis(char[][] message_table){
        //统计计算id对应的操作数目的个数
        int opera_num = this.info.length;
        //每个字符串处理一下
        for(int i = 0; i< opera_num ; i++ ){

        }
    }


}
