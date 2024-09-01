package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.entity.Note;
import com.helper.FactoryProvider;


public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveNoteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Note note = new Note(title,content,new Date());
		
		
		//System.out.println(note.getId() + " : " + note.getTitle());
		
		Session session = FactoryProvider.getFactory().openSession();
		session.beginTransaction();
		session.save(note);
		
		session.getTransaction().commit();
		session.close();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1 style='text-align:center;'>Note is Added Successfully</h1>");
		out.println("<h1 style='text-align:center;'><a href='all_notes.jsp'>View All Notes</a></h1>");

		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	
	}

}
