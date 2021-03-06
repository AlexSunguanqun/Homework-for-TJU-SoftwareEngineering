package com.AllView.usebox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;


//	首选项的相应内容操作
@SuppressLint("CommitPrefEdits")
public class UB_Preference {
	private SharedPreferences sPreferences;
	private SharedPreferences.Editor editor;
	private Context mContext;
	public UB_Preference(Context context, String fName, int nMode){
		mContext     = context;
		sPreferences = mContext.getSharedPreferences(fName, nMode);
		editor = sPreferences.edit();
	}
	//	赋值-String值;
	public void putValue(String key, String value){
		editor.putString(key, value);
		editor.commit();
	}
	//	取值-String值;
	public String getValue(String key){
		return sPreferences.getString(key, null);
	}
	//	赋值-boolean型;
	public void putValueBoolean(String key, boolean value){
		editor.putBoolean(key, value);
		editor.commit();
	}
	//	取值-boolean型;
	public boolean getValueBoolean(String key){
		return sPreferences.getBoolean(key, false);
	}
	
}
