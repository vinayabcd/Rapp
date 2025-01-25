package com.pack1;

import java.io.Serializable;

public class OrderBean implements Serializable
{
	private String iname;
	private String qty;
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	
	

}
