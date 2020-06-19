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
		//�������������ַ���Ϊutf-8
		req.setCharacterEncoding("utf-8"); 
		//������Ӧ������ַ���Ϊutf-8
		resp.setCharacterEncoding("utf-8");
		//��д����
		System.out.println("������GetForm��doGet����");
		//���ձ���name��t1�Ŀؼ���ֵ�����丳ֵ������x
		String x = req.getParameter("t1"); 
		//���ձ���name��p1�Ŀؼ���ֵ�����丳ֵ������y
		String y = req.getParameter("p1"); 
		//���ձ���name��d1�Ŀؼ���ֵ�����丳ֵ������z
		String z = req.getParameter("d1"); 
		//���ձ���name��r1�Ŀؼ���ֵ�����丳ֵ������m
		//r1��һ�鵥ѡ��ť��ֻ�ύ��ѡ�����value
		String m = req.getParameter("r1"); 
		//���ձ���name��s1�Ŀؼ���ֵ�����丳ֵ������n
		//s1��һ�������б�ֻ�ύ��ѡ����option��value
		String n = req.getParameter("s1");
		//���ձ���name��tx1�Ŀؼ���ֵ�����丳ֵ������o
		//tx1���ı����򣬿������Ϊ��һ���ı���
		String o = req.getParameter("tx1"); 
		//���ձ���name��c1�Ŀؼ���ֵ�����丳ֵ������p
		//c1��һ���ѡ��ť�飬�п��ܳ��ֶ��ѡ��ͬʱ��ѡ���ύ��
		//�ύ��ֵ�����Ƕ������Ҫ�����������
		String[] p = req.getParameterValues("c1");
			
		System.out.println("���յ��ı����ֵ�ǣ�"+x);
		System.out.println("���յ�������ֵ�ǣ�"+y);
		System.out.println("���յ����ڿ��ֵ�ǣ�"+z);
		System.out.println("���յ���ѡ��ť���ֵ�ǣ�"+m);
		System.out.println("���յ������б��ֵ�ǣ�"+n);
		System.out.println("���յ��ı������ֵ�ǣ�"+o);
		System.out.print("���յ���ѡ��ť���ֵ�ǣ�");
		for(String a : p) {
			System.out.print(a+",");
		}
		System.out.println();
		
		//��Ӧ�������һ����̬ҳ�棬��ʾ���ǣ�������������ı���Ϣ�ǣ�xxxx��������Ϣ�ǣ�xxxx
		//�ַ����������Դ��������������
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>"); //���Դ��
		out.println("<html>"); //���Դ��
		out.println("<head>"); //���Դ��
		out.println("<meta charset=\"UTF-8\">"); //���Դ��
		out.println("<title>�ύ���</title>"); //���Դ��
		out.println("</head>"); //���Դ��
		out.println("<body>"); //���Դ��
		out.println("������������ı���Ϣ�ǣ�"+x+"��������Ϣ�ǣ�"+y); //���Դ��
		out.println("</body>"); //���Դ��
		out.println("</html>"); //���Դ��
		out.flush();
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("������GetForm��doPost����");
		doGet(req,resp);
	}
	
	

}
