package com.eidiko.niranjana.service;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.dao.EmployeeDAO;
@Service
public class EmployeeMgmtServiceImpl implements EmployeeMgmtService{
	private static Logger logger = Logger.getLogger(EmployeeMgmtServiceImpl.class);
	//logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class is start");
	static 
	{
		try 
		{
			PropertyConfigurator.configure("src/main/java/com/eidiko/niranjana/commons/log4j.properties");
			logger.info("com.eidiko.niranjana.service.Impl::Log4J Setup ready");
			logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class is start");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class Problem while setting up Log4J");;
		}
	}
	@Autowired
		private EmployeeDAO dao;
//======================Employees Count==========================
	@Override
	public int fetchEmpsCount() 
	{
		logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class fetchEmpsCount() method is start");
		int count=0;
		try 
		{
		//logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class fetchEmpsCount() method is start");
		//use dao
		count= dao.getEmpsCount();
		logger.info("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class Autowired getEmpsCount() method is executed successfully");
	    }
		catch(Exception e) 
		{
			e.printStackTrace();	
			logger.error("com.eidiko.niranjana.controller.service.Impl::EmployeeMgmtServiceImpl known DB exception is raised in fetchEmpsCount() method"+e.getMessage());
		}
		logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class fetchEmpsCount() method is end");
		return count;
	}
//=======================Insert Employees =========================
	@Override
	public int registerEmp(Integer eId,String eName, String eAddrs) 
	{
		logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class registerEmp() method is start");
		int count =0;
		try
		{
		//use dao 
		count =dao.insertEmpDAO(eId,eName, eAddrs);
		logger.info("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class Autowired insertEmpDAO() is executed successfully");
		}
		catch(Exception e) 
		{
			e.printStackTrace();	
			logger.error("com.eidiko.niranjana.controller.service.Impl::EmployeeMgmtServiceImpl known DB exception is raised in Autowired insertEmpDAO() method"+e.getMessage());
		}
		logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class registerEmp() method is end");
		return count;
	}
	//=======================Update Employees =========================
	@Override
	public int updateEmpService(Integer eId, String eName, String eAddrs) 
	{
		logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class updateEmpService() method is start");
		int count =0;
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
		try
		{
			//using  dao class method
			count =dao.updateEmpDAO(eId, eName, eAddrs);
			System.out.println("updated Emp id is:"+eId);
			logger.info("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class Autowired updateEmpDAO() is executed successfully");
		}
		catch(Exception e) 
		{
			e.printStackTrace();	
			logger.error("com.eidiko.niranjana.controller.service.Impl::EmployeeMgmtServiceImpl known DB exception is raised in updateEmpDAO() method"+e.getMessage());
		}
		logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class updateEmpService() method is end");
		return count;
		
	}
	
//=======================Delete Employees =========================
	
	@Override
	public int deleteEmpService(Integer eId) 
	{
		logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class deleteEmpService() method is start");
		int count=0;
		try
		{
			//using  dao class method
			count=dao.deleteEmpDAO(eId);
			System.out.println("delete Emp id is:"+eId);
			logger.info("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class Autowired deleteEmpService() is executed successfully");
		}
		catch(Exception e) 
		{
			e.printStackTrace();	
			logger.error("com.eidiko.niranjana.controller.service.Impl::EmployeeMgmtServiceImpl known DB exception is raised in deleteEmpService() method"+e.getMessage());
		}
		logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class deleteEmpService() method is end");
		return count;
	}
	
	//=======================Select Operation =========================
	@Override
	public Map<String, Object> fetchEmpDetailsByService(int no) 
	{
		logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class fetchEmpDetailsByService() method is start");
		Map<String,Object>  map=null;
		try
		{
			//using  dao class method
			map= dao.getEmpDetailsDAO(no);
			System.out.println("selected  Emp id is:"+no);
			logger.info("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class getEmpDetailsDAO() is executed successfully");
		}
		catch(Exception e) 
		{
			e.printStackTrace();	
			logger.error("com.eidiko.niranjana.controller.service.Impl::EmployeeMgmtServiceImpl known DB exception is raised in getEmpDetailsDAO() method"+e.getMessage());
		}
		logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class fetchEmpDetailsByService() method is end");
		return map;
	}
	//=======================Select Operation =========================
	@Override
	public List<Map<String, Object>> fetchEmpDetailsByName(String eName) 
	{
		logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class fetchEmpDetailsByName() method is start");
		List<Map<String, Object>> list=null;
		try
		{
			//using  dao class method
			System.out.println("selected  Emp name is:"+eName);
			list= dao.getEmpDetailsByUsingName(eName);
			logger.info("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class getEmpDetailsByUsingName() is executed successfully");
		}
		catch(Exception e) 
		{
			e.printStackTrace();	
			logger.error("com.eidiko.niranjana.controller.service.Impl::EmployeeMgmtServiceImpl known DB exception is raised in fetchEmpDetailsByName() method"+e.getMessage());
		}
		logger.debug("com.eidiko.niranjana.service.Impl::EmployeeMgmtServiceImpl class fetchEmpDetailsByName() method is end");
		return list;	
	}
}
