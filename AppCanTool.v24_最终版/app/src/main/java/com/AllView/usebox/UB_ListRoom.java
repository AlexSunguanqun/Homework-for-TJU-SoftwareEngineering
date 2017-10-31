package com.AllView.usebox;

import java.util.ArrayList;

import android.util.Log;

public class UB_ListRoom {
	private static UB_ListRoom mtListRoom=new UB_ListRoom();
	private ArrayList<String> datas;
	
	public UB_ListRoom() {
		Log.i("MyLog", "生成一个实例");
	}

	public static UB_ListRoom getInstatnce() {
		return mtListRoom;
	}

	public static void setMtListRoom(UB_ListRoom mtListRoom) {
		UB_ListRoom.mtListRoom = mtListRoom;
	}

	public ArrayList<String> getDatas() {
		return datas;
	}

	public void addDatas(String str){
		datas.add(str);
	}
	public void setDatas(ArrayList<String> datas) {
		this.datas = datas;
	}
	
}
