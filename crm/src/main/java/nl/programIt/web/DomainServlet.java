package nl.programIt.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.programIt.LoaderClass;
import nl.programIt.service.interfaces.IDomainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class DomainServlet extends HttpServlet{
	//get en post
	
	private IDomainService domainnService=LoaderClass.getDomainService(); 
		
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
		req.setAttribute("listDomain",domainnService.domains());
		req.getRequestDispatcher("home.jsp").forward(req, resp);
		
	}
}
