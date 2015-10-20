package com.opencode.client;

public class Period {
	
	private String date;
	
	private String remarks;
	
	
	public Period(String date, String remarks){
		this.setDate(date);
		this.setRemarks(remarks);
	}


	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}


	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}


	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
