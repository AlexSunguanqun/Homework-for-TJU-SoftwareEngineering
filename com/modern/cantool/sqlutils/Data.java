package com.modern.cantool.sqlutils;

import java.util.*;

public class Data {
	public String iData;
	public char[] datas;
	public int    size;
	public int    index;
	//	属性参数;
	public char   FLAG;
	public String ID;
	public int	   DLC;
	public ArrayList<char[]> DATA;
	
	
	//	数据分解;
	public MData() {
		
	}
		
	public char[] getDatas() {
		if(){
			datas=iData.toCharArray();
			size=datas.length-1;
			return datas;
		}else{
			size=0;
			return null;
		}
	}

	//	是否有下一项;
	public boolean hasNext(){
		if(index<size){
			return true;
		}else{ 
			return false;
		}
	}
	//	下一个数;
	public char next(){
		if(index<=datas.lenth-1){
			char data=datas[index];
			index++;
			return data;
		}else{
			return null;
		}
	}

	
}
