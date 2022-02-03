package com.eidiko.niranjana.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eidiko.niranjana.dao.EmployeeDAO;
@Service
public class EmployeeMgmtServiceImpl implements EmployeeMgmtService{
	@Autowired
		private EmployeeDAO dao;
//======================Employees Count==========================
	@Override
	public int fetchEmpsCount() {
		//use dao
		return dao.getEmpsCount();
	}
//=======================Insert Employees =========================
	@Override
	public String registerEmp(Integer eId,String eName, String eAddrs) {
		List<Object> data =null;
		//use dao 
		data =dao.insertEmp(eId,eName, eAddrs);
	//	return new ResponseEntity<String>(data.toString(),HttpStatus.OK);
		return "data isert";
	}
	//=======================Update Employees =========================
	@Override
	public String updateEmpService(Integer eId, String eName, String eAddrs) {
		List<Object> data =null;
		//use dao 
		/*
		count =dao.updateEmpDAO(eId, eName, eAddrs);
		if(count==eId)
		{
			   System.out.println("Employee data updated for ID " + eId);
		}
		else{
		      System.out.println("No Employee found with ID " +eId);
		}
		*/
		/*
		if((dao.updateEmpDAO(eId, eName, eAddrs)!=1)){
		    //  System.out.println("Employee data updated for ID " + eId);
			return eId;
		    }else{
		      System.out.println("No Employee found with ID " +eId);
		    	return eId;
		    }
		   */
		//using  dao class method
		data =dao.updateEmpDAO(eId, eName, eAddrs);
		System.out.println("updated Emp id is:"+eId);
		return "data updated";
	}
	
//=======================Delete Employees =========================
	
	@Override
	public String deleteEmpService(Integer eId) {
		List<Object> data =null;
		//using  dao class method
		data=dao.deleteEmpDAO(eId);
		System.out.println("delete Emp id is:"+eId);
		return "data deleted";
	}
}
