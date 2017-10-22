package com.weikun.cantool.SQLUtils;

import java.io.File;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by weikun on 2017/10/22.
 */

public class DatabaseHelper {


    private SQLiteDatabase 	database;		//  数据库件;
    private SQLHelper helper;	//  辅助控件;
    public static final int DB_VERSION=3;
    public static final String DB_NAME	  	 =	"myDB.db";
    public SQLiteDatabase getDatabase() {
        return database;
    }

    public void setmDB(SQLiteDatabase database) {
        this.database = database;
    }

    public DatabaseHelper(Context mContext) {
        File file =	mContext.getFilesDir();
        String path = file.getAbsolutePath()+"/"+DB_NAME;
        helper = new SQLHelper(mContext, path, DB_VERSION);
        database = helper.getReadableDatabase();
    }

    public void close(){
        if(database!=null){
            database.close();
        }
        if(helper!=null){
            helper.close();
        }
    }


}
