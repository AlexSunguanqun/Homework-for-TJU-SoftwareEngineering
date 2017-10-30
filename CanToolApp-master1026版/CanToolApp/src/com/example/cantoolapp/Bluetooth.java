package com.example.cantoolapp;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.TabHost.OnTabChangeListener;

@SuppressWarnings("deprecation")
public class Bluetooth extends TabActivity {
    /** Called when the activity is first created. */

	enum ServerOrCilent{
		NONE,
		SERVICE,
		CILENT
	};
    private Context mContext;
    static AnimationTabHost mTabHost;
    static String BlueToothAddress = "null";
    static ServerOrCilent serviceOrCilent = ServerOrCilent.NONE;
    static boolean isOpen = false;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        
        mContext = this;        
    	setContentView(R.layout.main);
        //实例化
    	mTabHost = (AnimationTabHost) getTabHost();         
        mTabHost.addTab(mTabHost.newTabSpec("Tab1")
        		.setIndicator("设备列表",getResources().getDrawable(android.R.drawable.ic_menu_add))
        		.setContent(new Intent(mContext, deviceActivity.class)));      
        mTabHost.addTab(mTabHost.newTabSpec("Tab2").
        		setIndicator("对话列表",getResources().getDrawable(android.R.drawable.ic_menu_add))
        		.setContent(new Intent(mContext, chatActivity.class)));            
        mTabHost.setOnTabChangedListener(new OnTabChangeListener(){
        	public void onTabChanged(String tabId) {
        		// TODO Auto-generated method stub    
        		if(tabId.equals("Tab1"))
        		{        			
        		}
        	}         
        });
        //默认在0界面
        mTabHost.setCurrentTab(0); 
    }
	  public void onActivityResult(int requestCode, int resultCode, Intent data) {
		  
		  Toast.makeText(mContext, "address:", Toast.LENGTH_SHORT).show();

	    }
    @Override
    protected void onDestroy() {
        
    	    	    
        super.onDestroy();
    }   
    //消息类型
	public class SiriListItem {
		String message;
		boolean isSiri;//参数=0为发送的数据，=1为接受的数据
		
		//构造函数
		public SiriListItem(String msg, boolean siri) {
			message = msg;
			isSiri = siri;
		}
	}   
}