package com.Dz3;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Dz3Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		String result = "";
		
		byte b = 127;        
		System.out.println(b); 
		result += b + "<br>";
		
		short s = 32767;         
		System.out.println(s); 
		result += s + "<br>";
		
		int i = 999999999;         
		System.out.println(i); 
		result += i + "<br>";
		
		long l = 100l;         
		System.out.println(l);
		result += l + "<br>";
		
		char c2 = 'c'; 
		char c3 = 1200;         
		System.out.println(c2);         
		System.out.println(c3);
		result += c2 + " " + c3 + "<br>";
		
		char c = 0x0770;         
		System.out.println(c);
		result += c + "<br>";
		
		System.out.println((int)c); 
		result += (int)c + "<br>";
		
		int h=3,g=2;         
		System.out.println(h/g);         
		System.out.println((float)h/g); 
		result += h/g + "<br>";
		result += (float)h/g + "<br>";
		
		float h1=30000000000000000.0f,g1=2;         
		System.out.println(h1/g1);
		result += h1/g1 + "<br>";
		
		System.out.println((int)(h1/g1));    
		result += (int)(h1/g1) + "<br>";
		
		System.out.println(); 
		float f = 100000000000000000000000000000000000000.0f;         
		System.out.println(f); 
		result += f + "<br>";
		double googol = 1e100; 
		double d = 1100.34; 
		boolean bool = true;
		
		System.out.println(googol);         
		System.out.print("Перенос строки"+"\n");
		
		result += googol + "<br>";
		
		int x=1,y=2,z,operation=0; 
		switch (operation) { 
		case 0:            
			z = x+y; 
			break; 
		case 1:
			z = x-y;
			break; 
		case 2:            
			z = x*y; 
			break; 
		default:            
			z = x/y;         
		}         
		
		System.out.println("Результат выполнения операции: "+z);
		result += "Result: "+z + "<br>";
		
		long factorial = 1; 
		for (l=1l;l<10;l++) {
			factorial*=l;         
		}         
		System.out.println(factorial);
		result += factorial + "<br>";
		
		int[] m1; 
		int[] m2= new int[5]; 
		int[] m3 = {1,2,3};         
		System.out.println(m3[0]);
		result += m3[0] + "<br>";
		
		int[][] m4; 
		int[][] m5 = {{1,2},{2}};         
		System.out.println(m5[0][0]);
		result += m5[0][0] + "<br>";
		
		String[] str= new String[4];         
		String[] seasons = {"Winter","Spring","Summer","Autumn"};
		
		for (i=0;i<seasons.length;i++) { 
			System.out.println(seasons[i]);   
			result += seasons[i] + "<br>";
		}
		
		double dd = Math.random();        
		System.out.println(dd); 
		result += dd + "<br>";
		
		int random = (int)(dd*100);         
		System.out.println(random);
		result += random + "<br>";
		
		resp.getWriter().println(result);
	}
}