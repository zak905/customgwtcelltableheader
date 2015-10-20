package com.opencode.client;


import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MainPage implements EntryPoint {
	

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		 final CellTable<Period> table = new CellTable<Period>();
		    
		    List<Period> periods = new ArrayList<Period>();
		    periods.add(new Period("2006 / 04 / 06 ", "Hiring 3 developpers"));
		    periods.add(new Period("2011 / 08 / 05", "Project Kick off"));
		    periods.add(new Period("2010 / 02 / 04",  "1st milestone due"));
		    periods.add(new Period("2014 / 11 / 17",  "Three test"));
		    periods.add(new Period("2015 / 12 / 26", "another test"));
		    
		    TextColumn<Period> commentsColumn = new TextColumn<Period>(){
				@Override
				public String getValue(Period object) {
					return object.getRemarks();
				}
		    };
		    
		    TextColumn<Period> datesColumn = new TextColumn<Period>(){
				@Override
				public String getValue(Period object) {
					return object.getDate().toString();
				}
		    };
		    
		    table.addColumn(commentsColumn, "Comments");
		    table.addColumn(datesColumn, "Dates");
		    
		    table.setRowData(periods);
		    table.setHeaderBuilder(new MyCustomHeaderBuilder(table, false));
		    
		    RootPanel.get("celltable").add(table);
	}

	
}
