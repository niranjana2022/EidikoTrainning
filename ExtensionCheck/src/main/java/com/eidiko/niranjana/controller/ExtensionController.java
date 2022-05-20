package com.eidiko.niranjana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eidiko.niranjana.ext.FileUtils;
@Controller
public class ExtensionController {

	@PostMapping("/get")
	@ResponseBody
	public static void getExtensionController()
	{
		byte[] s1 = FileUtils.ExtensionGet(".png").getBytes();
		System.out.println("jk"+s1.toString());
//		byte[] arr = s1.getBytes();
//		System.out.println(arr.toString());
	}
}
