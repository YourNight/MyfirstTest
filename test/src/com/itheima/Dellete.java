package com.itheima;

import java.io.File;

public class Dellete {
	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		// Ҫɾ�����ļ�Ŀ¼
		String s = "E:\\111111111111111111111111111111111111111";
		File file = new File(s);
		del(file);
		long b = System.currentTimeMillis();
		System.out.println("ɾ���ɹ�����ʱ:"+ ( b - a )+"����");
	}
//	ɾ���ļ��з���
	private static void del(File file) {
		// TODO Auto-generated method stub
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			if (file2.isFile()) {
				file2.delete();
			} else {
				del(file2);
				//file2.delete();
			}
		}
		file.delete();
	}
}
