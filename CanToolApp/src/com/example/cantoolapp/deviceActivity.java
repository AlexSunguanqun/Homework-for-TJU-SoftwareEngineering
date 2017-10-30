package com.example.cantoolapp;

import com.example.cantoolapp.ChatListAdapter;
import com.example.cantoolapp.R;
import com.example.cantoolapp.Bluetooth.ServerOrCilent;

import java.util.ArrayList;
import java.util.Set;
import android.app.Activity;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class deviceActivity extends Activity {
    /** Called when the activity is first created. */
	
	private ListView mListView;
	private ArrayList<SiriListItem> list;
	private Button seachButton, serviceButton;
	ChatListAdapter mAdapter;
	Context mContext;
	
	/* ȡ��Ĭ�ϵ����������� */
	private BluetoothAdapter mBtAdapter = BluetoothAdapter.getDefaultAdapter();
	
    @Override
    public void onStart() {
        super.onStart();
        
        if (!mBtAdapter.isEnabled()) {
            Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableIntent, 3);
        }
    }	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.devices);
        mContext = this;
        init();
    }    

	private void init() {		   
		list = new ArrayList<SiriListItem>();
		mAdapter = new ChatListAdapter(this,list);
		mListView = (ListView) findViewById(R.id.list);
		mListView.setAdapter(mAdapter);
		mListView.setFastScrollEnabled(true);
		mListView.setOnItemClickListener(mDeviceClickListener);	
		
        
		 //�㲥�豸
        IntentFilter discoveryFilter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        this.registerReceiver(mReceiver, discoveryFilter);

        //�����豸����
        IntentFilter foundFilter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        this.registerReceiver(mReceiver, foundFilter);
        
        // �õ���ǰ����豸
        Set<BluetoothDevice> pairedDevices = mBtAdapter.getBondedDevices();

        //û����Ե��豸�������б�
        if (pairedDevices.size() > 0) {
            for (BluetoothDevice device : pairedDevices) {
            	list.add(new SiriListItem(device.getName() + "\n" + device.getAddress(), true));
            	mAdapter.notifyDataSetChanged();
        		mListView.setSelection(list.size() - 1);
            }
        } else {
        	list.add(new SiriListItem("û���豸�Ѿ����", true));
        	mAdapter.notifyDataSetChanged();
    		mListView.setSelection(list.size() - 1);
        }
		
		seachButton = (Button)findViewById(R.id.start_seach);
		seachButton.setOnClickListener(seachButtonClickListener);
		
		serviceButton = (Button)findViewById(R.id.start_service);
		serviceButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Bluetooth.serviceOrCilent=ServerOrCilent.SERVICE;
				Bluetooth.mTabHost.setCurrentTab(1);  
			}
		});
		
	}    
	 private OnClickListener seachButtonClickListener = new OnClickListener() {
		 @Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			 	if(mBtAdapter.isDiscovering()) 
			 	{
			 		mBtAdapter.cancelDiscovery();
			 		seachButton.setText("��������");
			 	}
			 	else
			 	{
			 		list.clear();
					mAdapter.notifyDataSetChanged();
					
					Set<BluetoothDevice> pairedDevices = mBtAdapter.getBondedDevices();
					if (pairedDevices.size() > 0) {
				            for (BluetoothDevice device : pairedDevices) {
				            	list.add(new SiriListItem(device.getName() + "\n" + device.getAddress(), true));
				            	mAdapter.notifyDataSetChanged();
				        		mListView.setSelection(list.size() - 1);
				            }
				    } else {
				        	list.add(new SiriListItem("No devices have been paired", true));
				        	mAdapter.notifyDataSetChanged();
				    		mListView.setSelection(list.size() - 1);
				     }					
			        /* ��ʼ���� */
					mBtAdapter.startDiscovery();
					seachButton.setText("ֹͣ����");
			 	}				 
			}
		};
		
    
    private OnItemClickListener mDeviceClickListener = new OnItemClickListener() {
        public void onItemClick(AdapterView<?> av, View v, int arg2, long arg3) {
                 
        	
        	SiriListItem item = list.get(arg2);
            String info = item.message;
            String address = info.substring(info.length() - 17);                 
            Bluetooth.BlueToothAddress = address;
            
        	 AlertDialog.Builder StopDialog =new AlertDialog.Builder(mContext);//����һ�����������
             StopDialog.setTitle("����");//����          
             StopDialog.setMessage(item.message);
             StopDialog.setPositiveButton("����", new DialogInterface.OnClickListener() {  
             public void onClick(DialogInterface dialog, int which) {  
                 // TODO Auto-generated method stub   
            	 mBtAdapter.cancelDiscovery();
            	 seachButton.setText("��������");     
                 
            	 Bluetooth.serviceOrCilent=ServerOrCilent.CILENT;
                 Bluetooth.mTabHost.setCurrentTab(1);   
             }  
             });
             StopDialog.setNegativeButton("ȡ��",new DialogInterface.OnClickListener() {                       
                 public void onClick(DialogInterface dialog, int which) {  
                	 Bluetooth.BlueToothAddress = null;
                 }
             });
             StopDialog.show();                            
        }
    };	
    //BroadcastReceiver�������ֵ��豸
    
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();

            // �����豸
            if (BluetoothDevice.ACTION_FOUND.equals(action)) 
            {
                
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                // �Ѿ���ԣ�����
                if (device.getBondState() != BluetoothDevice.BOND_BONDED) 
                {
                	list.add(new SiriListItem(device.getName() + "\n" + device.getAddress(), false));
                	mAdapter.notifyDataSetChanged();
            		mListView.setSelection(list.size() - 1);
                }
            
            } 
            else if (BluetoothAdapter.ACTION_DISCOVERY_FINISHED.equals(action)) 
            {
                setProgressBarIndeterminateVisibility(false);
                if (mListView.getCount() == 0) 
                {
                	list.add(new SiriListItem("û�з��������豸", false));
                	mAdapter.notifyDataSetChanged();
            		mListView.setSelection(list.size() - 1);
                }
                seachButton.setText("��������");
            }
        }
    };	
	
	public class SiriListItem {
		String message;
		boolean isSiri;
		public SiriListItem(String msg, boolean siri) {
			message = msg;
			isSiri = siri;
		}
	}
    @Override
    protected void onDestroy() {
        super.onDestroy();

        //û�������豸
        if (mBtAdapter != null) {
            mBtAdapter.cancelDiscovery();
        }
        // ע���㲥
        this.unregisterReceiver(mReceiver);
    }
}