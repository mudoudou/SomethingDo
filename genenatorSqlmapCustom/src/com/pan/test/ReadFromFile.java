package com.pan.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//1、按字节读取文件内容  
//2、按字符读取文件内容  
//3、按行读取文件内容  
//4、随机读取文件内容  
public class ReadFromFile {

	/** 
     * 以字节为单位读取文件，常用于读二进制文件，如图片、声音、影像等文件。 
     *  
     * @param fileName 
     *            文件的名 
     */  
	public static void readFileByBytes(String fileName){
		
		File file = new File(fileName);
		InputStream in = null;
		try {
			System.out.println("以字节为单位读取文件内容，一次读一个字节：");  
            // 一次读一个字节 
			in = new FileInputStream(file);
			int tempbyte;
			int n =0;
			while((tempbyte = in.read())!=-1){
				n++;
				System.out.println(tempbyte);
			}
			System.out.println("有："+n);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("以字节为单位读取文件内容，一次读多个字节：");  
	        // 一次读多个字节 
			in = new FileInputStream(fileName);
			byte[] tempbytes = new byte[6];
			int temptype2;
			while((temptype2 = in.read(tempbytes))!=-1){
				System.out.write(tempbytes,0,temptype2);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		readFileByBytes("f:addfile.txt");
	}

}
