package com.tuapp.registrousuarios;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registroUsuarios")
public class RegistroUsuariosServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Procesar los datos enviados desde el formulario
        String nombre = request.getParameter("nombre");
        String cedula = request.getParameter("cedula");
        String contrasena = request.getParameter("contrasena");

        // Aquí puedes validar los datos y guardarlos en una base de datos o realizar las acciones necesarias
        // ...

        // Redirigir a una página de resultado después del procesamiento
        response.sendRedirect(request.getContextPath() + "/resultadosUsuarios.jsp");
    }
}
