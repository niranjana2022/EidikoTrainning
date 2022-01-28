package com.eidiko.niranjana.dao;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO 
{
	
@Value("${user.auth}")
	private String auth;

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
		System.out.println("Auth data: "+auth);
			int count=0;
			count = jt.queryForObject(GET_EMPS_COUNT, Integer.class);
			return count;
	}
//====================Insert Employees =====================

	@Override
	public int insertEmp(Integer eId,String eName, String eAddrs) {
		int count=0;
		count = jt.update(INSERT_EMPS, eId,eName, eAddrs);
		return count;
	}
//====================update Employee=====================

	@Override
	public int updateEmpDAO(Integer eId, String eName, String eAddrs) {
		int count=0;
		count = jt.update(UPDATE_EMPS, eName, eAddrs,eId);
		return 0;
	}
	//===================delete Employee=====================
	@Override
	public int deleteEmpDAO(Integer eId) {
		int count=0;
		count = jt.update(DELETE_EMPS, eId);
		return count;
	}
	//=======================Select Operation =========================
	@Override
	public Map<String, Object>getEmpDetailsDAO(int no) {
		Map<String,Object>  map=null;
		map=jt.queryForMap(GET_EMPDETAILS_BY_EID,no);
		System.out.println("Auth data: "+auth);
		return map;
	}
	//=======================Select Operation =========================
	@Override
	public List<Map<String, Object>> getEmpDetailsByUsingName(String eName) {
		return jt.queryForList(GET_EMPDETAILS_BY_ENAME, eName);
	}
}


