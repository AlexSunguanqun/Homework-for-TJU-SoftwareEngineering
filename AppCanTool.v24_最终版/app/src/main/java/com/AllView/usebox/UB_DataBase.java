package com.AllView.usebox;

import java.util.ArrayList;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class UB_DataBase extends SQLiteOpenHelper{

	private ArrayList<String> list;
	private UB_Config mConfig;
	
	public UB_DataBase(Context context, String name, CursorFactory factory,
					   int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}
	//	数据库管理类的构造函数;
	public UB_DataBase(Context context, String name, int version) {
		super(context, name, null, version);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		mConfig=new UB_Config();
		list=mConfig.getListSQlInit();
		for(String query:list){
			db.execSQL(query);
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
