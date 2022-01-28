package com.eidiko.niranjana.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;
@Component("courseReader")
public class CourseDetailsReader implements ItemReader<String> {

	String course[] = new String[] {"CRT","CJ", "AJ","spring","springBoot"};//source 
	int count =0;
	public CourseDetailsReader() {
	System.out.println("CourseDetailsReader::0-param constructor");
	}
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
	if(count<course.length)
	{
		return course[count++];
	}
	else
	{
		return null;
	}
		
	}

	

}
