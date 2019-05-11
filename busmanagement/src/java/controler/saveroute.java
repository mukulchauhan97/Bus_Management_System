
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.createroute;
import model.createrouteDao;


public class saveroute extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String rname = request.getParameter("Rname");
        String vReg = request.getParameter("Regnumber");
        String Bno =  request.getParameter("BName");
        String dName =  request.getParameter("DName");
        String dcontact =  request.getParameter("DNumber");
//        int caps =  Integer.parseInt(request.getParameter("caps"));
        String sPoint =  request.getParameter("Spoint");
        String tCost =  request.getParameter("Tcost");
        
        createroute ri = new createroute();
        createrouteDao rd = new createrouteDao();
        ri.setRoute(rname);
        ri.setBno(Bno);
        ri.setDname(dName);
        ri.setRegno(vReg);
        ri.setDno(dcontact);
        ri.setSpoint(sPoint);
        ri.setTcost(tCost);
 
        if(rd.check(ri))
        {
            HttpSession session = request.getSession();
            session.setAttribute("route",ri);
            System.out.println(rname);
            session.setAttribute("rname",rname);
            out.println("<script type=\"text/javascript\">");
            out.println("location='addstops.jsp';");
            out.println("</script>");
        }
        else{
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Not able to save !!');");
            out.println("location='createroutes.jsp';");
            out.println("</script>");
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
