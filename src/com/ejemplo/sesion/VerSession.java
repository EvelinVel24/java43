package com.ejemplo.sesion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/VerSession")
public class VerSession extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Producto miproducto = (Producto) session.getAttribute("producto");

        PrintWriter pw = response.getWriter();
        if (miproducto != null) {
            pw.println("<html><body>");
            pw.println("Producto: " + miproducto.getConcepto() + ", Precio: " + miproducto.getImporte());
            pw.println("</body></html>");
        } else {
            pw.println("<html><body>No hay producto en la sesión.</body></html>");
        }
    }
}
