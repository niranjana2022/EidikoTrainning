package com.eidiko.niranjana.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eidiko.niranjana.listener.JobMonitoringListener;
import com.eidiko.niranjana.processor.CourseDetailsProcessor;
import com.eidiko.niranjana.reader.CourseDetailsReader;
import com.eidiko.niranjana.writer.CourseDetailsWriter;
@Configuration
@EnableBatchProcessing //Gives batch related features through AutoConfiguration like InMemoryJobFactory,
public class BatchConfig {   //gives JobBuilderFactory, StepBuilderFactory..etc
	@Autowired
	private StepBuilderFactory stepFactory;
	@Autowired
	private JobBuilderFactory jobFactory;

	@Autowired
	private CourseDetailsReader  coursereader;
	@Autowired
	private CourseDetailsWriter  coursewriter;
	
	@Autowired
	private CourseDetailsProcessor  courseprocessor;
	
	@Autowired
	private JobMonitoringListener jobListener;
	
	//create step object using StepBuilderFactory
	@Bean(name="step")
	public Step createStep()  //while creation step object, we can pass 5 details like
	{
		System.out.println("BatchConfig.createStep()");
		return stepFactory.get("step")
				.<String,String>chunk(2)
				.reader(coursereader)
				.writer(coursewriter)
				.processor(courseprocessor)
				.build();
	}
	//create Job  using JobBuilderFactory
		@Bean(name="job1")
		public Job createJob() 
		{
			System.out.println("BatchConfig.createJob()");
			return  jobFactory.get("job1")
					.incrementer(new RunIdIncrementer())
					.listener(jobListener)
					.start(createStep())
					.build();
					
		}
	
	
	

}
