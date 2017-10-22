package com.weikun.cantool.bluetooth;

/**
 * Created by weikun on 2017/10/22.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

public class Tooth {


    private BluetoothAdapter adapter;
    private ArrayList<HashMap<String, String>> devices;
    private ArrayList<String> listInfos;

    public Tooth() {
        //	蓝牙适配器的初始化;
        this.adapter = BluetoothAdapter.getDefaultAdapter();
        //	数据列表信息初始化;
        this.listInfos=new ArrayList<String>();
    }
    public BluetoothAdapter getAdapter() {
        return adapter;
    }

    //	具备蓝牙设备;
    public boolean hasBlueToothDevice(){
        return adapter==null;
    }
    //	蓝牙设备开关;
    public boolean isBlueToothOpen(){
        return adapter.isEnabled();
    }
    //	使蓝牙设备关闭;
    public void setBlueToothClose(){
        adapter.disable();
    }
    //	获取设备信息列表;
    public ArrayList<HashMap<String, String>> getDevices() {
        devices = new ArrayList<HashMap<String,String>>();
        // 获取所有已经绑定的蓝牙设备
        Set<BluetoothDevice> devicesList = adapter.getBondedDevices();
        if (devices.size() > 0) {
            for (BluetoothDevice device : devicesList) {
                HashMap<String, String> map=new HashMap<String, String>();
                map.put("name", device.getName());
                map.put("address", device.getAddress());
                devices.add(map);
            }
        }
        return devices;
    }
    public ArrayList<HashMap<String, String>> clearDevices() {
        devices.clear();
        return devices;
    }
    //	获取设备接收信息列表;
    public ArrayList<String> getListInfos(){
        return listInfos;
    }
    public ArrayList<String> clearListInfos(){
        listInfos.clear();
        return listInfos;
    }


}
