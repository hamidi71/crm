package nl.programIt.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.programIt.LoaderClass;
import nl.programIt.entities.Domains;
import nl.programIt.service.interfaces.IDomainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class DomainServlet extends HttpServlet{
	//get en post
	
	private IDomainService domainnService=LoaderClass.getDomainService(); 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		if(req.getParameter("action").equals("saveDomain")){
			String namServlet=req.getParameter("nameInput");			
			Domains domain=new Domains();
			domain.setName(namServlet);
			domainnService.save(domain);
			req.getRequestDispatcher("index.html").forward(req, resp);
			//req.setAttribute("listDomain",domainnService.domains());
			//req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//HttpServletRequest ontvangen
		//HttpServletResponse vezenden	
		/*String firstName=req.getParameter("nomIndex");
		int leeftijd=Integer.valueOf(req.getParameter("ageIndex"));
		req.setAttribute("nomHome", firstName);
		req.setAttribute("ageHome", leeftijd);*/
		//System.out.println(domainnService.domains().size());
		if(req.getParameter("action").equals("list")){
			req.setAttribute("listDomain",domainnService.domains());
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
		if(req.getParameter("action").equals("addDomain")){
			req.getRequestDispatcher("add.jsp").forward(req, resp); 			
		}
		if(req.getParameter("action").equals("delete")){
			long id=Long.valueOf(req.getParameter("id")); 
			domainnService.delete(id);
			req.getRequestDispatcher("index.html").forward(req, resp);
		}
	}
}
