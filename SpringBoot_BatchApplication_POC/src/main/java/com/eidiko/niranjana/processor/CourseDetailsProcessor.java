package com.eidiko.niranjana.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
@Component("courseProcessor")
public class CourseDetailsProcessor implements ItemProcessor <String,String>{ //one is "input" and other is "output"

	public CourseDetailsProcessor() {
	System.out.println("CourseDetailsProcessor::0-param constructor");
	}

	@Override
	public String process(String item) throws Exception {
		String faculty = null;
		if(item.equalsIgnoreCase("CRT"))
			faculty=item+" By RamaRaju sir";
		else if(item.equalsIgnoreCase("CJ"))
			faculty=item+" By HariKrishna sir";
		else if(item.equalsIgnoreCase("AJ"))
			faculty=item+" By Natraj sir";
		else if(item.equalsIgnoreCase("spring"))
			faculty=item+" By Nataraj sir";
		else if(item.equalsIgnoreCase("springBoot"))
			faculty=item+" By Natraj sir";
		return faculty;
	}

	

}
