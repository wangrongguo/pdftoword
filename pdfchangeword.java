package pdftoword;

import java.util.Scanner;

import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;

public class pdfchangeword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---");
		System.out.println("-----------------����ʹ��PDFתWord--------------------");
		System.out.println("---");
		Scanner s = new Scanner(System.in);// ����Scanner��һ������

	    System.out.print("�����뵱ǰĿ¼�µ��ļ������硰hello.pdf������");
	    String name = s.nextLine();
//	    System.out.println(name);
//	    System.out.println("--"+name);
	    if(name != null){
	    	System.out.println("ת����......");
	    	PdfDocument pdf = new PdfDocument();
	    	pdf.loadFromFile("./"+name);
	    	pdf.saveToFile("./"+name+".docx", FileFormat.DOCX);
	    }
		s.close();
		System.out.println("ת����ɣ�");
	}

}
