package com.eidiko.niranjana.runner;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyJobRunner implements CommandLineRunner {
	
	@Autowired
	private Job job;
	
	@Autowired
	private JobLauncher  jobLauncher;

	public void run(String... args) throws Exception {
		//Prepare JobParamters
		JobParameters jobParameters = new JobParametersBuilder()
				.addLong("time", System.currentTimeMillis())
				.toJobParameters();
		//run the job
		try {
			JobExecution execution=jobLauncher.run(job, jobParameters);
			System.out.println("Job completeion status:"+execution.getStatus());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("EXECUTION IS DONE");
	}

}

