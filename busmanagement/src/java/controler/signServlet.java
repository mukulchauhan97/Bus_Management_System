
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.sign1;
import model.signDAO;

public class signServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
             String fname = request.getParameter("fname");
             String lname = request.getParameter("lname");
             String rno = request.getParameter("rno");
             String email = request.getParameter("email");
             String pp = request.getParameter("pp");
             String mobile = request.getParameter("mobile");
             String pwd = request.getParameter("pwd");
             String routename = request.getParameter("routename");
             sign1 s = new sign1();
             s.setFname(fname);
             s.setLname(lname);
             s.setRno(rno);
             s.setEmail(email);
             s.setPp(pp);
             s.setMobile(mobile);
             s.setPwd(pwd);
             s.setRoutename(routename);
             
            signDAO s2 = new signDAO();
            if(s2.check(s))
            {
                HttpSession session = request.getSession();
                session.setAttribute("fname",fname);
                RequestDispatcher rd1 = request.getRequestDispatcher("home.jsp");
                rd1.forward(request, response);

            }
            else 
            {
                           response.sendRedirect("sign.jsp");
            }
         }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
