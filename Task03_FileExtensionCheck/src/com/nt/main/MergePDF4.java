package com.nt.main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
public class MergePDF4 {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws FileNotFoundException, Exception {	

		String sourceFile1Path = "C:\\Users\\Administrator\\Downloads\\Eidiko\\New folder";
		String sourceFile2Path = "C:\\Users\\Administrator\\Downloads\\Eidiko\\New folder (2)";
 
		String mergedFilePath = "C:\\Users\\Administrator\\Downloads\\Eidiko\\Merge\\ok.pdf";
 
		File[] files = new File[2];
		files[0] = new File(sourceFile1Path);
		files[1] = new File(sourceFile2Path);
 
		File mergedFile = new File(mergedFilePath);
 
		mergeFiles(files, mergedFile);
	}
 
	public static void mergeFiles(File[] files, File mergedFile) {
 
		FileWriter fstream = null;
		BufferedWriter out = null;
		try {
			fstream = new FileWriter(mergedFile, true);
			 out = new BufferedWriter(fstream);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
 
		for (File f : files) {
			System.out.println("merging: " + f.getName());
			FileInputStream fis;
			try {
				fis = new FileInputStream(f);
				BufferedReader in = new BufferedReader(new InputStreamReader(fis));
 
				String aLine;
				while ((aLine = in.readLine()) != null) {
					out.write(aLine);
					out.newLine();
				}
 
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
 
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	}
}

