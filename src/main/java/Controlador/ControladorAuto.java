package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassCrudAuto;
import model.TblAuto;

/**
 * Servlet implementation class ControladorAuto
 */
public class ControladorAuto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorAuto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//iniciamos la respectiva clase
		
		ClassCrudAuto crudauto=new ClassCrudAuto();
		TblAuto tblauto=new TblAuto();
		//enviamos a la vista
		List<TblAuto> listado=crudauto.Listado();
		request.setAttribute("listado","listado");
		request.getRequestDispatcher("/ListadoAutos.jsp").forward(request, response);
		
	}//fin del metodo get

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
