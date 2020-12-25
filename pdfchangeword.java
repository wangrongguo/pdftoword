package pdftoword;

import java.util.Scanner;

import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;

public class pdfchangeword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---");
		System.out.println("-----------------正在使用PDF转Word--------------------");
		System.out.println("---");
		Scanner s = new Scanner(System.in);// 声明Scanner的一个对象

	    System.out.print("请输入当前目录下的文件名（如“hello.pdf”）：");
	    String name = s.nextLine();
//	    System.out.println(name);
//	    System.out.println("--"+name);
	    if(name != null){
	    	System.out.println("转换中......");
	    	PdfDocument pdf = new PdfDocument();
	    	pdf.loadFromFile("./"+name);
	    	pdf.saveToFile("./"+name+".docx", FileFormat.DOCX);
	    }
		s.close();
		System.out.println("转换完成！");
	}

}
