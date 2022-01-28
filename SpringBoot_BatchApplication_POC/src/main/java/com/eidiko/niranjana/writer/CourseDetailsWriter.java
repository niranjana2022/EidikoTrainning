package com.eidiko.niranjana.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;
@Component("courseWriter")
public class CourseDetailsWriter implements ItemWriter<String> { //ItemWriter String (type) is must match with output (type) of ItemProcessor 

	
	public CourseDetailsWriter() {
	System.out.println("CourseDetailsWriter::0-param constructor");
	}
	
		
	
	@Override
	public void write(List<? extends String>items) throws Exception {
	System.out.println("CourseDetailsWriter::writer()");
	items.forEach(System.out::println);
	}

	

}
