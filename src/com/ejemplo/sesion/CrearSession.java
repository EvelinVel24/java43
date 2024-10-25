package com.ejemplo.sesion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CrearSession")
public class CrearSession extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Producto miproducto = new Producto(1, "iPhone", 1000);
        HttpSession session = request.getSession();
        session.setAttribute("producto", miproducto);

        PrintWriter pw = response.getWriter();
        pw.println("<html><body>Producto en session</body></html>");
    }
}
