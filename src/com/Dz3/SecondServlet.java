package com.Dz3;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SecondServlet extends HttpServlet {
	
	private static final int goodNumber = 10;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		String taskType = req.getParameter("taskType");
		int task = Integer.parseInt(taskType);
		
		switch (task) {
			case 1:
				task1(req, resp);
				break;
			case 2:
				task2(req, resp);
				break;
			case 3:
				task3(req, resp);
				break;
			case 4:
				task4(req, resp);
				break;
			default:
				break;
		}
		
	}
	
	private static void task1(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String var1 = req.getParameter("var1");
		int i1 = Integer.parseInt(var1);       
		
		String var2 = req.getParameter("var2");
		int i2 = Integer.parseInt(var2);  
		
		int temp1 = Math.abs(goodNumber - i1);
		int temp2 = Math.abs(goodNumber - i2);
		
		if (temp1 < temp2) {
			resp.getWriter().println("The first number is closer");
		} else if (temp1 == temp2) {
			resp.getWriter().println("The numbers are equally close and distant at the same time");
		} else {
			resp.getWriter().println("The second number is closer");
		}
	}
	
	private static void task2(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String var1 = req.getParameter("a");
		double a = Double.parseDouble(var1); 
		
		String var2 = req.getParameter("b");
		double b = Double.parseDouble(var2);  
		
		String var3 = req.getParameter("c");
		double c = Double.parseDouble(var3);  
		
		double D = (double)Math.pow(b,2)-4*a*c;
		
		if (D < 0) {
			resp.getWriter().println("No roots");
		} else if (D == 0) {
			double x = -b/(2*a);
			resp.getWriter().println("The root is " + x);
		} else if (D > 0) {
			
			double x1 = (-b + Math.sqrt(D))/(2*a);
			double x2 = (-b - Math.sqrt(D))/(2*a);
			
			resp.getWriter().println("Roots x1 = " + x1 + " x2 = " + x2);
		} else {
			resp.getWriter().println("Error");
		}
	}
	
	private static void task3(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		int[][] matrix = new int[8][5]; 
		String result = "";
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int random = (int) (Math.random() * (99 - 10)) + 10;
				
				matrix[i][j] = random;
				result += random + " ";
			}
			result += "<br>";
		}
		
		resp.getWriter().println(result);
	}
	
	private static void task4(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int[][] matrix = new int[5][8]; 
		String result = "";
		
		int max = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int random = (int) (Math.random() * (99 - (-99))) + -99;
				
				matrix[i][j] = random;
				result += random + " ";
				
				if (i == 0 && j == 0) {
					max = random;
				} else if (random > max) {
					max = random;
				}
			}
			result += "<br>";
		}
		
		result += "<br>";
		
		result += "Max:" + max;
		
		resp.getWriter().println(result);
	}
	
}