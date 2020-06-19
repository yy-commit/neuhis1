package com.neuedu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetFormServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求对象的字符集为utf-8
		req.setCharacterEncoding("utf-8"); 
		//设置响应对象的字符集为utf-8
		resp.setCharacterEncoding("utf-8");
		//编写代码
		System.out.println("调用了GetForm的doGet方法");
		//接收表单中name是t1的控件的值，将其赋值给变量x
		String x = req.getParameter("t1"); 
		//接收表单中name是p1的控件的值，将其赋值给变量y
		String y = req.getParameter("p1"); 
		//接收表单中name是d1的控件的值，将其赋值给变量z
		String z = req.getParameter("d1"); 
		//接收表单中name是r1的控件的值，将其赋值给变量m
		//r1是一组单选按钮：只提交了选中项的value
		String m = req.getParameter("r1"); 
		//接收表单中name是s1的控件的值，将其赋值给变量n
		//s1是一个下拉列表：只提交了选中项option的value
		String n = req.getParameter("s1");
		//接收表单中name是tx1的控件的值，将其赋值给变量o
		//tx1是文本区域，可以理解为是一个文本框
		String o = req.getParameter("tx1"); 
		//接收表单中name是c1的控件的值，将其赋值给变量p
		//c1是一组多选按钮组，有可能出现多个选项同时被选中提交，
		//提交的值可能是多个，需要利用数组接收
		String[] p = req.getParameterValues("c1");
			
		System.out.println("接收到文本框的值是："+x);
		System.out.println("接收到密码框的值是："+y);
		System.out.println("接收到日期框的值是："+z);
		System.out.println("接收到单选按钮组的值是："+m);
		System.out.println("接收到下拉列表的值是："+n);
		System.out.println("接收到文本区域的值是："+o);
		System.out.print("接收到多选按钮组的值是：");
		for(String a : p) {
			System.out.print(a+",");
		}
		System.out.println();
		
		//响应给浏览器一个动态页面，显示的是，您本次输入的文本信息是：xxxx，密码信息是：xxxx
		//字符输出流，将源代码输出给浏览器
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>"); //输出源码
		out.println("<html>"); //输出源码
		out.println("<head>"); //输出源码
		out.println("<meta charset=\"UTF-8\">"); //输出源码
		out.println("<title>提交结果</title>"); //输出源码
		out.println("</head>"); //输出源码
		out.println("<body>"); //输出源码
		out.println("您本次输入的文本信息是："+x+"，密码信息是："+y); //输出源码
		out.println("</body>"); //输出源码
		out.println("</html>"); //输出源码
		out.flush();
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("调用了GetForm的doPost方法");
		doGet(req,resp);
	}
	
	

}
