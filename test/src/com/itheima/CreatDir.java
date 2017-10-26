package com.itheima;

import java.io.File;

public class CreatDir {
	static int i = 0 ;
	public static void main(String[] args) {
		System.out.println("¿ªÊ¼");
		String s = "E:\\111111111111111111111111111111111111111";
		File file = new File(s);
		creatDir(file,i);
		System.out.println("½áÊø");
	}
	
	public static void creatDir(File file,int i){
		
		file.mkdir();
		creatDir(new File(file,String.valueOf(i)),i);
		i+=i;
	}
	
	
}
