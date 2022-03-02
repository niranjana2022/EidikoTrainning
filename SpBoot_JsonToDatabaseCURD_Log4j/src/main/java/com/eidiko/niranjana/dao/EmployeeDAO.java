package com.eidiko.niranjana.dao;
import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
       //Count Total no. of Employee 
		public int getEmpsCount();
		
		//Insert Employee
		public int insertEmpDAO(Integer eId,String eName, String eAddrs );
		
		//Update Employee
		public int updateEmpDAO(Integer eId,   String eName, String eAddrs);
		
		//delete the Employee
		public int deleteEmpDAO(Integer eId);
		
		//Get the employee details by using his EID
		public   Map<String,Object> getEmpDetailsDAO(int no);
		
		//Get the employee details by using his ENAME
		public  List<Map<String,Object>> getEmpDetailsByUsingName(String eName);	
}
