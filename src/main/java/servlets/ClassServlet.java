package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.AcademyClass;
import entity.Subject;
import entity.Teacher;

/**
 * Servlet implementation class ClassServlet
 */
@WebServlet("/class")
public class ClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClassServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("classes", getClasses());
		request.setAttribute("subjects", getSubjects());

		RequestDispatcher view = getServletContext().getRequestDispatcher("/classes.jsp");

		System.out.println("Get Called Now");

		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Do Assign subject to this class");
		assignSubject(new Subject("Test"));
		doGet(request, response);
	}

	private void assignSubject(Subject subject) {
		AcademyClass obj = new AcademyClass();
		obj.setSubject(subject);
	}
	
	private AcademyClass[] getClasses() {
		AcademyClass[] classes = new AcademyClass[] {
				new AcademyClass("Class one", new Subject("Math"), new Teacher("Mo Salah")), 
				new AcademyClass("Class two", new Subject("Science"), new Teacher("Ahmed")),
				new AcademyClass("Class three", new Subject("Algorithms"), new Teacher("Jack"))};

		return classes;

	}
	
	private Subject[] getSubjects() {
		Subject[] classes = new Subject[] {
				new Subject("Math"), 
				new Subject("Algorithms"),
				new Subject("Data Structure")};

		return classes;

	}
}
