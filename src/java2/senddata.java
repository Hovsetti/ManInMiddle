package java2;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class senddata
 */
@WebServlet("/senddata")
public class senddata extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public senddata() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getOutputStream().write("NO USING GET".getBytes());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Identity id = new Identity(request.getParameter("email"),  request.getParameter("password"));
		
		HttpSession session = request.getSession(true);
		@SuppressWarnings("unchecked")
		List<Identity> identities = (List<Identity>) session.getAttribute("identity");
		if(identities == null){
			identities = new ArrayList<>();
		}
		identities.add(id);
		session.setAttribute("identity", identities);
		request.getRequestDispatcher("/form.jsp").forward(request,response);
	}

}
