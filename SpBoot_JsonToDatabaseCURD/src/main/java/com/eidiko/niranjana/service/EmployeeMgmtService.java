package com.eidiko.niranjana.service;
import java.util.List;
import java.util.Map;

public interface EmployeeMgmtService {

		public int fetchEmpsCount();
		public int registerEmp(Integer eId,String eName, String eAddrs);
		public int updateEmpService(Integer eId,String eName, String eAddrs);
		public int deleteEmpService(Integer eId);
		public   Map<String,Object> fetchEmpDetailsByService(int no);
		public List<Map<String,Object>> fetchEmpDetailsByName(String eName);
}
