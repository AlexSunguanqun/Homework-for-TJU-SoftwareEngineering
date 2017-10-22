package com.weikun.cantool.dataresolver;

/**
 * Created by weikun on 2017/10/22.
 */

import java.util.ArrayList;

public class MetaData {

    private String data;
    private char[] datas;
    private int size;
    private int index;
    //	属性参数;
    private char FLAG;
    private String ID;
    private int	DLC;
    private ArrayList<char[]> DATA;


    //	数据分解;
    public MetaData() {

    }

    //	进行数据的加载;
    public String getData() {
        return data;
    }

    //	设置数据的容器;
    public void setiData(String data) {
        this.data = data;
    }

    public char[] getDatas() {
        if(data.length()<=0){
            this.datas=this.data.toCharArray();
            size=datas.length-1;
            return datas;
        }else{
            throw new RuntimeException("数据为空！");
        }
    }

    public void setDatas(char[] datas) {
        this.datas = datas;
    }
    //	取出长度;
    public int getSize() {
        return size;
    }
    //	是否有下一项;
    public boolean hasNext(){
        return this.index<this.size;
    }
    //	下一个数;
    public char next(){
        if(hasNext()){
            return datas[index++];//该写法可能引起错误
        }else{
           throw new RuntimeException("已没有更多信息！");
        }
//        char data=datas[index];
//        index++;
//        return data;
    }

    public char getFLAG() {
        return FLAG;
    }

    public void setFLAG(char fLAG) {
        this.FLAG = fLAG;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        this.ID = iD;
    }

    public int getDLC() {
        return DLC;
    }

    public void setDLC(int dLC) {
        this.DLC = dLC;
    }

    public ArrayList<char[]> getDATA() {
        return DATA;
    }

    public void setDATA(ArrayList<char[]> dATA) {
        this.DATA = dATA;
    }

}
