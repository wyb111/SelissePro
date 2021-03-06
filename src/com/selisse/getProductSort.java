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
		System.out.println("我是init()方法！用来进行初始化工作");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// 获得所有产品分类
		List sorts = common.getProductSort();
		JSONArray sortArr = new JSONArray(sorts);
		out.write(sortArr.toString());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	//销毁实例
	public void destroy() {
		 super.destroy();
		 System.out.println("我是destroy()方法！用来进行销毁实例的工作");
	}
}
