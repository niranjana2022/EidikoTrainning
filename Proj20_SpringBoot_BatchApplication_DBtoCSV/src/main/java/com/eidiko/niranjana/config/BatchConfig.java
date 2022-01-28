package com.eidiko.niranjana.config;
import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.eidiko.niranjana.listener.MyJobListener;
import com.eidiko.niranjana.mapper.ProductRowMapper;
import com.eidiko.niranjana.model.Product;
import com.eidiko.niranjana.processor.ProductProcessor;


@Configuration
@EnableBatchProcessing
public class BatchConfig {

	@Autowired
	private  DataSource ds;
	@Autowired
	private  JobBuilderFactory jobFactory;
	@Autowired
	private StepBuilderFactory stepFactory;
	
	//processor
		@Bean
		public    ItemProcessor<Product,Product>  createProcessor(){
			return  new  ProductProcessor();
		}
		//listener
		@Bean
		public   JobExecutionListener createListener() {
			return new MyJobListener();
		}
		//reader
		@Bean
		public   JdbcCursorItemReader<Product>  MyowncreateReader(){
			//create object
			    JdbcCursorItemReader<Product> reader=new JdbcCursorItemReader<>();
			 // specify DataSoruce
			    reader.setDataSource(ds);
			// specify SQL Query
			    reader.setSql("SELECT PID,PCODE,PCOST,PDISC,PGST FROM PRODUCTS");
			 //specify RowMapper
			    reader.setRowMapper(new ProductRowMapper());
			    /*
			    reader.setRowMapper((rs,rowNumber)->new Product(rs.getInt(1),
			    		rs.getString(2), rs.getDouble(3),rs.getDouble(4),rs.getDouble(5)));
			    		*/
			return reader;
		}
		/*
		//reader by using pre-defined ItemReaderBuilder
		@Bean
		public   JdbcCursorItemReader<Product>  createReader(){
			//create and return object
			return  new JdbcCursorItemReaderBuilder<Product>()
					               .name("jdbc-reader")//if i use pre-define then we must use one Logical name ...else we get error 
					              .dataSource(ds)
					              .sql("("SELECT PID,PCODE,PCOST,PDISC,PGST FROM PRODUCTS");
					              .beanRowMapper(Product.class)  // Internally use BeanPropertyRowMapper
					                                                                                         // to covert the record of RS to given Model class obj
					                                                                                        // but  db table col names  and  model class properties
					              .build();
		}	
	*/
		//writer 
		 @Bean
		public    FlatFileItemWriter<Product> MyowncreateWriter(){
			 FlatFileItemWriter<Product> writer=new FlatFileItemWriter<>();
			 //specify the destination csv file location
			 //writer.setResource(new ClassPathResource("classpath:topbrains.csv"));
			 writer.setResource(new FileSystemResource("C:\\csvs\\productDetails.csv"));
			 // specify  LineAggregator by  supplying  delimeter and FieldExtractor
			 writer.setLineAggregator(new DelimitedLineAggregator<>() {{
				 //delimeter
				   setDelimiter(",");
				   //field extractor
				   setFieldExtractor(new BeanWrapperFieldExtractor<>() {{
					      //specify  names to extracted field values.
					   setNames(new String[] {"prodId","prodCode","prodCost","prodGst","prodDisc"});
				   }});
			 }});
			return writer;
		}
		
		/*@Bean  ////reader by using pre-defined ItemWriterBuilder
		public    FlatFileItemWriter<Product> createWriter(){
			   return  new  FlatFileItemWriterBuilder<Product>()
					                     .name("line123")
					                     .resource(new ClassPathResource("productDetails.csv"))
					                     .lineSeparator("\r\n")
					                     .delimited().delimiter(",")
					                     .names("id","dob","percentage","semester")
					                     .build();
		}*/
		//step
		 
		 @Bean(name="step1")
		 public  Step  createStep1() {
			 return stepFactory.get("step1")
					       .<Product,Product>chunk(3)
					       .reader(MyowncreateReader())
					       .writer(MyowncreateWriter())
					       .processor(createProcessor())
					       .build();
		 }
		 
		 @Bean(name="job1")
		 public   Job createJob1() {
			   return  jobFactory.get("job1")
					          .incrementer(new RunIdIncrementer())
					          .listener(createListener())
					          .start(createStep1())
					          .build();
		 }

}