package com.org.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.org.model.Admin;
import com.org.model.AdminDAO;
import com.org.model.UploadFileDAO;

@WebServlet("/UploadFileController")
public class UploadFileController extends HttpServlet {
	String name;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int count=0;
		if(ServletFileUpload.isMultipartContent(request)){
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                                         new DiskFileItemFactory()).parseRequest(request);
               
                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                         name = new File(item.getName()).getName();
                        item.write( new File("F:\\online exam system\\StudentOnlineExam\\question" + File.separator + name));
                        System.out.println(name);
                    }
                }
                System.out.println("successfully store in file");
               //File uploaded successfully
             
            } catch (Exception ex) {
               request.setAttribute("message", "File Upload Failed due to " + ex);
            }          
          
        }else{
           System.out.println("some thing went wrong");
        }
	
		
		File excel=new File("F:\\online exam system\\StudentOnlineExam\\question\\"+name);
		FileInputStream fis=new FileInputStream(excel);
		XSSFWorkbook book= new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheetAt(0);
		Iterator<Row>row=sheet.iterator();
		Admin ad=new Admin();
		UploadFileDAO ufd=new UploadFileDAO();
		while(row.hasNext())
		{
			Row rowit=row.next();
			Iterator<Cell>celliterator=rowit.cellIterator();
			ad.setId(celliterator.next().toString());
			System.out.println(ad.getId());
			ad.setQuestion(celliterator.next().toString());
			System.out.println(ad.getQuestion());
			ad.setOption1(celliterator.next().toString());
			System.out.println(ad.getOption1());
			ad.setOption2(celliterator.next().toString());
			System.out.println(ad.getOption2());
			ad.setOption3(celliterator.next().toString());
			System.out.println(ad.getOption3());
			ad.setOption4(celliterator.next().toString());
			System.out.println(ad.getOption4());
			ad.setAnswer(celliterator.next().toString());
			System.out.println(ad.getAnswer());
			System.out.println("dao call");
			count=ufd.adminUser(ad);
		}
		if(count>=1)
		{
			request.getRequestDispatcher("excelsuccess.html").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("Afterdeletewrong.html").forward(request, response);
		}
		
	}
	}


