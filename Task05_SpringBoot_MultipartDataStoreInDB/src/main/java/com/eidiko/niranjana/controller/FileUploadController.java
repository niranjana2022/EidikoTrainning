package com.eidiko.niranjana.controller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.eidiko.niranjana.entity.FileUploadEntity;
import com.eidiko.niranjana.service.FileUploadService;

@RestController
public class FileUploadController {

	@Autowired
	private FileUploadService service;
	
	@PostMapping("/upload")
	public String uploadForm(@RequestParam("files") List<MultipartFile> file,
			@RequestParam("accountNumber") String accountNumber) throws IOException
	{
	    
		 //read Content which is coming from POSTMAN
			System.out.println(accountNumber);	
			for(MultipartFile fileList : file)
			{
				System.out.println("All files are :"+fileList.getOriginalFilename());    //we get all the files here
				
						  if( FilenameUtils.getExtension(fileList.getOriginalFilename()).equals("pdf"))
				        	{
							  System.out.println("Total PDF files are :"+fileList.getOriginalFilename());  //we get all the pdf files are here
							  String totalPdfFiles = fileList.getOriginalFilename();
								System.out.println("totalPdfFiles is :"+totalPdfFiles);			//only pdf files are
							//=============================================================
								BufferedReader br;
								List<InputStream> result = new ArrayList<>();
								
								     String line;
								     InputStream is = fileList.getInputStream();
								     br = new BufferedReader(new InputStreamReader(is));
								     while ((line = br.readLine()) != null) 
								     {
								          result.add(is);
								          System.out.println("hhhhhhhhhhhhh"+result);
								         // is.close();
								     }
								     
								//Merge pdf
								 PDFMergerUtility mergePdf = new PDFMergerUtility();
									
							    	//InputStream   stream=result.add(e);	//To get all the content of the file
									System.out.println("stream files"+fileList.getOriginalFilename());            //Here we get two PDF files
									mergePdf.addSources( result);
								    mergePdf.setDestinationFileName("C:\\Users\\Administrator\\Downloads\\Eidiko\\Merge\\merged.pdf");
								    mergePdf.mergeDocuments();
								    //is.close();
								    
///=============================================================================================								    
//								    PDDocument document = new PDDocument();
//									for (File pdfFile: fileList) {
//									    PDDocument part = PDDocument.load(pdfFile);
//									    List<PDPage> list = (List<PDPage>) part.getDocumentCatalog().getPages();
//									    for (PDPage page: list) {
//									        document.addPage(page);
//									    }
//									    part.close();
//									}
//									document.save("merged.pdf");
//									document.close();
//===================================================================================================
						    						
//			
//								Path filepath = Paths.get(fileList.getOriginalFilename());
//							    try (OutputStream os = Files.newOutputStream(filepath)) 
//							    {
//							        os.write(fileList.getBytes());
//							      //Merge pdf
//									 PDFMergerUtility mergePdf = new PDFMergerUtility();
//					
//								    	InputStream   stream=fileList.getInputStream();	//To get all the content of the file
//										System.out.println("stream files"+fileList.getOriginalFilename());            //Here we get two PDF files
//										mergePdf.addSource( stream);
//									    mergePdf.setDestinationFileName("C:\\Users\\Administrator\\Downloads\\Eidiko\\Merge\\merged.pdf");
//									    mergePdf.mergeDocuments();
//							    }
							    
//==========================================Add all files next by next============================================
								/*
								LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
							    List<String> tempFileNames = new ArrayList<>();
							    String tempFileName;
							    FileOutputStream fo;
							        for (MultipartFile file1 : file) 
							        {
							            tempFileName =file1.getOriginalFilename();
							            tempFileNames.add(tempFileName);
							            fo = new FileOutputStream(tempFileName);
							            fo.write(file1.getBytes());
							            fo.close();
							            map.add("files", new FileSystemResource(tempFileName));
							            System.out.println("nnnnnnnnn"+tempFileNames);
							        }
							        */
	//===========================================================
//								PDDocument document = new PDDocument();
//								for (String pdfFile: fileList) {
//								    PDDocument part = PDDocument.load(pdfFile);
//								    List<PDPage> list = part.getDocumentCatalog().getAllPages();
//								    for (PDPage page: list) {
//								        document.addPage(page);
//								    }
//								    part.close();
//								}
//								document.save("merged.pdf");
//								document.close();
								
//							      //Merge pdf
//									 PDFMergerUtility mergePdf = new PDFMergerUtility();
//					
//								    	InputStream   stream=fileList.getInputStream();	//To get all the content of the file
//										System.out.println("stream files"+fileList.getOriginalFilename());            //Here we get two PDF files
//										mergePdf.addSource( stream);
//									    mergePdf.setDestinationFileName("C:\\Users\\Administrator\\Downloads\\Eidiko\\Merge\\merged.pdf");
//									    mergePdf.mergeDocuments();
//							    }
//							    
//=====================================================================================
//								MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
//							    List<Object> files = new ArrayList<>();
//							    for(MultipartFile file1 : file) {
//							        files.add(new ByteArrayResource(file1.getBytes()));
//							    }
//							    map.put("files", files);
						
							    
//							for(int i=0; i<fileList.getSize();i++)
//							{
//								System.out.println(fileList.getSize());
//							}
//							            mergePdf.addSources(List<InputStream> stream); 

				        	}//if close
			File fileUploadLocation = new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\MultipartFile");
			fileUploadLocation.getAbsolutePath();		
			//Now prepare Entity class object
			 FileUploadEntity info1=new FileUploadEntity();
			 info1.setAccountNumber(accountNumber);
			 info1.setFilePath(fileUploadLocation.getAbsolutePath().replace('\\','/') +"/"  +fileList.getOriginalFilename());
		
			 service.FileUploadInDB(info1);
			 }//for-loop close
			
		 return "uploaded";
	}//method close
}//class clsoe