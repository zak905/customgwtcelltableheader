package com.opencode.client;

import com.google.gwt.dom.builder.shared.DivBuilder;
import com.google.gwt.dom.builder.shared.TableCellBuilder;
import com.google.gwt.dom.builder.shared.TableRowBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.cellview.client.AbstractCellTable;
import com.google.gwt.user.cellview.client.AbstractHeaderOrFooterBuilder;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;

public class MyCustomHeaderBuilder extends AbstractHeaderOrFooterBuilder<Period> {

    public MyCustomHeaderBuilder(AbstractCellTable<Period> table,
			boolean isFooter) {
		super(table, isFooter);
		// TODO Auto-generated constructor stub
	}


    @Override
    public boolean buildHeaderOrFooterImpl() {

    	
		TableRowBuilder row = startRow();
		TableCellBuilder th = row.startTH().colSpan(2);
		DivBuilder div = th.startDiv();
		
		Button button = new Button("Option");
		TextBox field = new TextBox();
		ListBox list = new ListBox();
		list.addItem("item 1");
		list.addItem("item 2");
		list.addItem("item 3");
		 
		button.getElement().setId("headerButton");
		 div.html(SafeHtmlUtils.fromTrustedString("Period "+ button.getElement()));
		 
		 div.end();
		 th.endTH();
		 row.endTR();
		 
		 row.startTR();
		 th = row.startTH();
			div = th.startDiv();
			 
			 div.html(SafeHtmlUtils.fromTrustedString("Comment" + field.getElement()));
			 
			 div.end();
			 th.endTH();
		 
		 th = row.startTH();
			div = th.startDiv();
			
			 div.html(SafeHtmlUtils.fromTrustedString("Date " + list.getElement()));
			 
			 div.end();
			 th.endTH();
		 row.endTR();
		
      return true;
    }

   
   
  }
