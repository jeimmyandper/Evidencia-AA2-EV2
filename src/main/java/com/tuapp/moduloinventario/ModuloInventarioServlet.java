package com.tuapp.moduloinventario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/moduloInventario")
public class ModuloInventarioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Procesar los datos enviados desde el formulario de inventario
        String nombreProducto = request.getParameter("nombreProducto");
        String categoria = request.getParameter("categoria");
        String tamaño = request.getParameter("tamaño");
        String color = request.getParameter("color");

        // Redirigir a una página de resultado después del procesamiento
        response.sendRedirect(request.getContextPath() + "/resultadosInventario.jsp");
    }
}
