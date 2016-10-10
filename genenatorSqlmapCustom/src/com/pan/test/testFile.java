package com.pan.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class testFile {

	public static void main(String[] args) {
	
		File file = new File("f:","addfile.txt");
		try {
			if (file.exists()) {
				System.out.println("文件已经存在！");
			}else {
				System.out.println("文件创建成功！");
				file.createNewFile();//创建文件
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//向文件中写入内容(输出流)
		String str = "亲爱的情报777";
		byte bt[] = new byte[1024];
		bt = str.getBytes();
		try {
			FileOutputStream out = new FileOutputStream(file,true);
			try {
				out.write(bt,0,bt.length);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		//读取文件内容
		try {
			FileInputStream in = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(in,"utf-8");
			int ch =0 ;
			while((ch = isr.read())!=-1){
				System.out.println((char)ch);
			}
			in.close();
			isr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
