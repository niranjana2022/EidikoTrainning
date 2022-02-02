package com.eidiko.niranjana.dao;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO 
{
		private static final String GET_EMPS_COUNT= "SELECT COUNT(*) FROM EMPTABDATA";
		private static final String INSERT_EMPS= "INSERT INTO EMPTABDATA(EID,ENAME,EADDRS)VALUES(?,?,?)";
		private static final String UPDATE_EMPS= "UPDATE EMPTABDATA SET ENAME=?, EADDRS=? WHERE EID=?";
		private static final String  DELETE_EMPS= "DELETE FROM EMPTABDATA WHERE EID=?";
		private  static final String  GET_EMPDETAILS_BY_EID="SELECT EID,ENAME,EADDRS FROM EMPTABDATA WHERE EID=?";
	//inject JDBC template 
		@Autowired
	private JdbcTemplate jt;
//====================Employees Count=====================
                  
	@Override
	public int getEmpsCount() 
	{
			int count=0;
			count = jt.queryForObject(GET_EMPS_COUNT, Integer.class);
			return count;
	}
//====================Insert Employees =====================

	@Override
	public String insertEmp(Integer eId,String eName, String eAddrs) {
		int count=0;
		count = jt.update(INSERT_EMPS, eId,eName, eAddrs);
		return "data inserted";
	}
//====================update Employee=====================

	@Override
	public String updateEmpDAO(Integer eId, String eName, String eAddrs) {
		int count=0;
		count = jt.update(UPDATE_EMPS, eName, eAddrs,eId);
		return "data updated";
	}
	//===================delete Employee=====================
	@Override
	public String deleteEmpDAO(Integer eId) {
		int count=0;
		count = jt.update(DELETE_EMPS, eId);
		return "data deleted Successfully";
	}
	//=======================Select Operation =========================
	@Override
	public Map<String, Object>getEmpDetailsDAO(int no) {
		Map<String,Object>  map=null;
		map=jt.queryForMap(GET_EMPDETAILS_BY_EID,no);
		return map;
	}
}


