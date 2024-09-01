package com.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.entity.Note;
import com.helper.FactoryProvider;


public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UpdateServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int noteId = Integer.parseInt(request.getParameter("noteId").trim());

		Session s = FactoryProvider.getFactory().openSession();
		s.beginTransaction();
		
		Note note = s.get(Note.class, noteId);
		
		note.setTitle(title);
		note.setContent(content);
		note.setAdddedDate(new Date());
		
		s.getTransaction().commit();
		s.close();
		
		response.sendRedirect("all_notes.jsp");
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
