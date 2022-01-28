
package com.eidiko.niranjana.listener;
import java.util.Date;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
//not required
public class MyJobListener implements JobExecutionListener {

	public void beforeJob(JobExecution je) {
		System.out.println("Job starts on => " + je.getStatus());
		System.out.println("Job starts date => " + new Date());
	}

	public void afterJob(JobExecution je) {
		System.out.println("Job starts end => " + je.getStatus());
		System.out.println("Job ends date => " + new Date());
	}

}
