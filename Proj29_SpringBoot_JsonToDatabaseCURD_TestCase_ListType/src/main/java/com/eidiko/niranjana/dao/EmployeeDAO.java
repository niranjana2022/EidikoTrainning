package com.eidiko.niranjana.dao;
import java.util.List;
public interface EmployeeDAO {
       //Count Total no. of Employee 
		public int getEmpsCount();
		
		//Insert Employee
		public List<Object> insertEmp(Integer eId,String eName, String eAddrs );
		
		//Update Employee
		public List<Object> updateEmpDAO(Integer eId,   String eName, String eAddrs);
		
		//delete the Employee
		public  List<Object> deleteEmpDAO(Integer eId);
		
}
