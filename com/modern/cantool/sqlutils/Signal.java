package com.model;

public class Signal {
	public int _id;
	public String sg_;
	public String name;
	public String way;
	public String judge;
	public String rank;
	public String unit;
	public String node_name;
	public int id;
	//	获取其中的Way的方式;
	public int startIndex;	  //01.起始位置;
	public int bitCount;	  //02.位数总和;
	public int direction;//03.方向;
	
	
	
	public MSignal(int _id, String sg_, String name, String way,
			String judge, String rank, String unit, String node_name, int id) {
		super();
		this._id = _id;
		this.sg_flag = sg_;
		this.signal_name = name;
		this.way = way;
		this.judge = judge;
		this.rank = rank;
		this.unit = unit;
		this.node_name = node_name;
		this.id = id;
		dealwithway();
	}
	private void dealwithway(){
		//	拆解路径方式;
		//	起始位置;
		startIndex	  =Integer.parseInt(way.substring(0, way.indexOf("|")));
		//	偏移量;
		bitCount	  =Integer.parseInt(way.substring(way.indexOf("|")+1,way.indexOf("@")));
		//	方向;
		String dir=way.substring(way.indexOf("@")+1, way.length());
		if(dir.equals("0+"))
			direction=0;
		else direction=1;
	}
	
}
