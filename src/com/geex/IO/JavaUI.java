package com.geex.IO;

import java.awt.Component;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;

public class JavaUI {
		
		 //获得文件路劲
		  public static String getFile(){
			    JFileChooser fc = new JFileChooser();
			    //选择对话框类型
				fc.setDialogType(JFileChooser.FILES_AND_DIRECTORIES);
				fc.setDialogTitle("选择文件");
				//是否可以选择多个文件
				fc.setMultiSelectionEnabled(false);
				//显示对话框
				fc.showSaveDialog(fc);
				//判断是否选中文件
				if (fc.getSelectedFile()==null) {
					return null;
				}
				return fc.getSelectedFile().getPath();
         }
		  
		  //获取文件目录
		  public static String getFolderPath(){
			     JFileChooser chooser = new JFileChooser();
			    // 规定可以选择的文件类型
				 chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);//设置只能选择目录
				 Component parent = null;
				 int returnVal = chooser.showOpenDialog(parent);
				 if(returnVal == JFileChooser.APPROVE_OPTION) {
				 String selectPath = chooser.getSelectedFile().getPath() ;
				 return  selectPath;
				 }else{
					 return null;
				 }
			  
			  
		  }
		  
		  
		  
		  
		  
}