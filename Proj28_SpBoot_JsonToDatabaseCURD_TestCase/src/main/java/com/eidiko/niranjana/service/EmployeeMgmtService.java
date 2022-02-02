package com.eidiko.niranjana.service;
import java.util.Map;

public interface EmployeeMgmtService {

		public int fetchEmpsCount();
		public String registerEmp(Integer eId,String eName, String eAddrs);
		public String updateEmpService(Integer eId,String eName, String eAddrs);
		public String deleteEmpService(Integer eId);
		public   Map<String,Object> fetchEmpDetailsByService(int no);
}
