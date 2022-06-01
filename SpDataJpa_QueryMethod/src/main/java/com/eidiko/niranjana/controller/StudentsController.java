package com.eidiko.niranjana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.entity.Students;
import com.eidiko.niranjana.repo.IStudentsRepo;



@RestController
public class StudentsController {
	
	
	
	@Autowired
	private IStudentsRepo repo;

	@GetMapping("/fetchAllData")
	public List<Students> fetchAllStudentsData()
	{		
		List<Students> list = null;
		list = repo.fetchAllStudents();
		return list;
	}
	
	//fetch all students data by through ID, using "named param"
	@GetMapping("/fetchByIdNamedParam/{sno}")
	public Object fetchPartialStudentsDataById(@PathVariable Integer sno)
	{
		System.out.println("Fetch Students Data By ID");
		Object obj = repo.findStdPartialDetailsById(sno);
		 Object row[]=(Object[])obj;
		 System.out.println("details are::"+row[0]+"  "+row[1]+" "+row[2]+" "+row[3]);
		return row;
	}
	//fetch all students data by through NAME, using "named param"
	@GetMapping("/fetchByNameNamedParam/{sname}")
	public Object fetchPartialStudentsDataByName(@PathVariable String sname)
	{
		System.out.println("Fetch Students Data By Name");
		Object obj = repo.findStdPartialDetailsByName(sname);
		 Object row[]=(Object[])obj;
		 System.out.println("details are::"+row[0]+"  "+row[1]+" "+row[2]+" "+row[3]);
		return row;
	}
	
//============================================================================
	
	
	//fetch all students data by through NAME, using @Param annotation
		@GetMapping("/fetchByNamePositionalParam")
		public Object fetchAllStudentsDataByName(@RequestParam(name="sname") String sname)
		{
			System.out.println("Fetch Students Data By Name");
			Object obj =  repo.fetchStudentsAllDetailsByName(sname);
			 Object row[]=(Object[])obj;
			 System.out.println("details are::"+row[0]+"  "+row[1]+" "+row[2]+" "+row[3]);
			return row;
		}
		
	//fetch all students data by through NAME, using @Param annotation
	@GetMapping("/fetchByIdPositionalParam")
	public Object fetchAllStudentsDataById(@RequestParam(name="sno") Integer sno)
	{
		System.out.println("Fetch Students Data By No");
		Object obj =  repo.fetchStudentsAllDetailsById(sno);
		Object row[]=(Object[])obj;
		System.out.println("details are::"+row[0]+"  "+row[1]+" "+row[2]+" "+row[3]);
		return row;
	}
}
