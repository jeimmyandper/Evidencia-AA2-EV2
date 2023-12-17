package com.tuapp.registroclientes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registroClientes")
public class RegistroClientesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirige al formulario JSP
        request.getRequestDispatcher("/registroClientes.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Procesa los datos enviados desde el formulario
        String nombre = request.getParameter("nombre");
        String cedula = request.getParameter("cedula");
        String direccion = request.getParameter("direccion");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");

        // Aquí puedes validar los datos y guardarlos en una base de datos o lista temporal
        // ...

        // Redirigir a resultado.jsp después del procesamiento
        response.sendRedirect(request.getContextPath() + "/resultados.jsp");


    }
}
