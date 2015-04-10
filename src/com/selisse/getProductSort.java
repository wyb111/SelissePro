/**
 * 
 */
package com.selisse;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import com.selisse.db.common;
/**
 * @author Administrator
 *
 */
public class getProductSort extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println("����init()�������������г�ʼ������");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// ������в�Ʒ����
		List sorts = common.getProductSort();
		JSONArray sortArr = new JSONArray(sorts);
		out.write(sortArr.toString());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	//����ʵ��
	public void destroy() {
		 super.destroy();
		 System.out.println("����destroy()������������������ʵ���Ĺ���");
	}
}
