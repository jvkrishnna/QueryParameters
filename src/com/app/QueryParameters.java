package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class QueryParameters extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String s1=req.getParameter("name");
		String s2=req.getParameter("rollno");
		int rollNo=Integer.parseInt(s2);
		PrintWriter out=resp.getWriter();
		out.println("Student Name="+s1);
		out.println("Student RollNO="+rollNo);
	}

}
