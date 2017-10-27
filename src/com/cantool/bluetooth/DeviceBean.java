package com.android.bluetooth;

/**
 * Created by weikun on 2017/10/20.
 */
public class DeviceBean {
	protected String message;
	protected boolean isReceive;

	public DeviceBean(String msg, boolean isReceive) {
		this.message = msg;
		this.isReceive = isReceive;
	}
}