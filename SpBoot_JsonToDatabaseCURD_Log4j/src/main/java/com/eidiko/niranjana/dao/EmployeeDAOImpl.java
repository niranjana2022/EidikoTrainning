package com.eidiko.niranjana.dao;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO 
{
	
	private static Logger logger = Logger.getLogger(EmployeeDAOImpl.class);
	static 
	{
		try 
		{
			PropertyConfigurator.configure("src/main/java/com/eidiko/niranjana/commons/log4j.properties");
			logger.info("com.eidiko.niranjana.dao.Impl::Log4J Setup ready");
			logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class is start");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class Problem while setting up Log4J");;
		}
	}
		private static final String GET_EMPS_COUNT= "SELECT COUNT(*) FROM EMPTABDATA";
		private static final String INSERT_EMPS= "INSERT INTO EMPTABDATA(EID,ENAME,EADDRS)VALUES(?,?,?)";
		private static final String UPDATE_EMPS= "UPDATE EMPTABDATA SET ENAME=?, EADDRS=? WHERE EID=?";
		private static final String  DELETE_EMPS= "DELETE FROM EMPTABDATA WHERE EID=?";
		private  static final String  GET_EMPDETAILS_BY_EID="SELECT EID,ENAME,EADDRS FROM EMPTABDATA WHERE EID=?";
		private  static final String  GET_EMPDETAILS_BY_ENAME="SELECT EID,ENAME,EADDRS FROM EMPTABDATA WHERE ENAME=?";
	//inject JDBC template 
		@Autowired
	private JdbcTemplate jt;
//====================Employees Count=====================

	@Override
	public int getEmpsCount() 
	{
		logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class getEmpsCount() method is start");
		int count=0;
		try
		{
			//logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class getEmpsCount() method is start");
			count = jt.queryForObject(GET_EMPS_COUNT, Integer.class);
			logger.info("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class getEmpsCount() method query is executed successfully");
			//return count;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("com.eidiko.niranjana.controller.dao.Impl::EmployeeDAOImpl class known DB exception is raised in getEmpsCount method"+e.getMessage());
		}
		logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class getEmpsCount() method is end");
		return count;
	}
//====================Insert Employees =====================

	@Override
	public int insertEmpDAO(Integer eId,String eName, String eAddrs) 
	{
		logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class insertEmpDAO() method is start");
		int count=0;
		try
		{
			count = jt.update(INSERT_EMPS, eId,eName, eAddrs);
			logger.info("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class insertEmpDAO() method query is executed successfully");
			//return count;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("com.eidiko.niranjana.controller.dao.Impl::EmployeeDAOImpl class known DB exception is raised in insertEmpDAO method"+e.getMessage());
		}
		logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class insertEmpDAO() method is end");
		return count;
	}
//====================update Employee=====================

	@Override
	public int updateEmpDAO(Integer eId, String eName, String eAddrs) 
	{
		logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class updateEmpDAO() method is start");
		int count=0;
		try
		{
			count = jt.update(UPDATE_EMPS, eName, eAddrs,eId);
			logger.info("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class updateEmpDAO() method query is executed successfully");
			//return count;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("com.eidiko.niranjana.controller.dao.Impl::EmployeeDAOImpl class known DB exception is raised in updateEmpDAO method"+e.getMessage());
		}
		logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class updateEmpDAO() method is end");
		return count;
	}
	//===================delete Employee=====================
	@Override
	public int deleteEmpDAO(Integer eId) 
	{
		logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class deleteEmpDAO() method is start");
		int count=0;
		try
		{
			count = jt.update(DELETE_EMPS, eId);
			logger.info("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class deleteEmpDAO() method query is executed successfully");
			//return count;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("com.eidiko.niranjana.controller.dao.Impl::EmployeeDAOImpl class known DB exception is raised in deleteEmpDAO method"+e.getMessage());
		}
		logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class deleteEmpDAO() method is end");
		return count;
	}
	//=======================Select Operation =========================
	@Override
	public Map<String, Object>getEmpDetailsDAO(int no) 
	{
		logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class getEmpDetailsDAO() method is start");
		Map<String,Object>  map=null;
		try
		{	
			map = jt.queryForMap(GET_EMPDETAILS_BY_EID,no);
			logger.info("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class getEmpDetailsDAO() method query is executed successfully");
			//return map;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("com.eidiko.niranjana.controller.dao.Impl::EmployeeDAOImpl class known DB exception is raised in getEmpDetailsDAO method"+e.getMessage());
		}
		logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class getEmpDetailsDAO() method is end");
		return map;
	}
	//=======================Select Operation =========================
	@Override
	public List<Map<String, Object>> getEmpDetailsByUsingName(String eName) 
	{
		logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class getEmpDetailsByUsingName() method is start");
		List<Map<String, Object>> list=null;
		try
		{	
			list = jt.queryForList(GET_EMPDETAILS_BY_ENAME, eName);
			logger.info("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class getEmpDetailsByUsingName() method query is executed successfully");
			//return map;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("com.eidiko.niranjana.controller.dao.Impl::EmployeeDAOImpl class known DB exception is raised in getEmpDetailsByUsingName method"+e.getMessage());
		}
		logger.debug("com.eidiko.niranjana.dao.Impl::EmployeeDAOImpl class getEmpDetailsByUsingName() method is end");
		return list;
	}
}


