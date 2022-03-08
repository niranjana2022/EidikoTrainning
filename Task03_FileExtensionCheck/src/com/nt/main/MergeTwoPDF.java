package com.nt.main;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;

public class MergeTwoPDF {

	public static void main(String[] args)throws IOException {
		File oldFile1 = new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\dummy.pdf");
		File oldFile2 = new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\file-sample_150kB.pdf");
		
			PDDocument oldDocument1 =  PDDocument.load(oldFile1);
			PDDocument oldDocument2 = PDDocument.load(oldFile2);

		for(int i=0;i<oldDocument2.getNumberOfPages();i++)
		{
			oldDocument1.addPage(oldDocument2.getPage(i));
		}
		File createDirectory=new File("C:\\Users\\Administrator\\Downloads\\Eidiko\\Merge");
		createDirectory.mkdir();
		oldDocument1.save("C:\\Users\\Administrator\\Downloads\\Eidiko\\Merge\\mergeTwoPDF.pdf");
		System.out.println("Two PDF merged Successfully");
	
	}
}
