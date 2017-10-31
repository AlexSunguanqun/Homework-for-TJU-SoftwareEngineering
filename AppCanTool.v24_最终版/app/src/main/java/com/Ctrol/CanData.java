package com.Ctrol;

import java.util.ArrayList;

import com.AllView.device.D_Data;

public class CanData extends D_Data {
//	private char[] 	  datas;
	private ArrayList<char[]> list;
	private D_Data meData;
	private String    iData;
	
	//	控制类的构造方法;
	public CanData(String iData) {
		this.iData=iData;
//		setiData(iData);
		list=new ArrayList<char[]>();
		//	进行数据的截取;
//		computeData();	
	}

	
	public D_Data getmeData() {
		return meData;
	}


	public void setmData(D_Data meData) {
		this.meData = meData;
	}


	public void computeData(){
		meData.setiData(iData);
		char[] 	  datas=meData.getDatas();
		
		char FLAG=datas[0];
		//	设置ID编号
		meData.setFLAG(FLAG);
		String temp="";
		int    size=0;
		//	位数的选择;
		switch (FLAG) {
		//	标准位;
		case 't':
			for(int i=1;i<4;i++){
				temp+=""+datas[i];
			}
			meData.setDLC(Integer.parseInt(datas[4]+""));
			size=meData.getDLC();
			
			for(int i=0;i<size;i++){
				int index=0;
				char[] data=new char[2];
				for(int j=i*2+5;j<(i*2+5)+2;j++){
					data[index]=datas[j];
					index++;
				}
				list.add(data);
			}
			break;
		//	扩展位;
		case 'T':
			for(int i=1;i<9;i++){
				temp+=""+datas[i];
			}
			meData.setDLC(Integer.parseInt(datas[9]+""));
			size=meData.getDLC();
			for(int i=0;i<size;i++){
				int index=0;
				char[] data=new char[2];
				for(int j=i*2+9;j<(i*2+9)+2;j++){
					data[index]=datas[j];
					index++;
				}
				list.add(data);
			}
			break;
		default:
			break;
		}
		//	检测补位;
		int dis=8-size;
		while (dis>0) {
			char[] c={'0','0'};
			list.add(c);
			dis--;
		}
		meData.setDATA(list);
		meData.setID(temp);
	}
}
