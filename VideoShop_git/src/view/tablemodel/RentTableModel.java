package view.tablemodel;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class RentTableModel extends AbstractTableModel{
	
	public ArrayList data = new ArrayList();	// 담을 데이터의 양을 알 수 없으므로 한번에 ArrayList에 담아준다.
	String [] columnNames = {"비디오번호","제목","고객명","전화번호", "반납예정일", "반납여부"};

	    public int getColumnCount() { 
	        return columnNames.length; 
	    } 
	     
	    public int getRowCount() { 
	        return data.size(); 
	    } 

	    public Object getValueAt(int row, int col) { 
			ArrayList temp = (ArrayList)data.get( row );
	        return temp.get( col ); 
	    }
	    
	    public String getColumnName(int col){
	    	return columnNames[col];
	    }
	    
	  
}
