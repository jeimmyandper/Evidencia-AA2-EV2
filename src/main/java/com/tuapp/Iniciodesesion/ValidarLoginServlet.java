package com.tuapp.Iniciodesesion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validar_login")
public class ValidarLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario de inicio de sesión
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");

        // Verificar si el usuario y la contraseña son válidos (ejemplo simple)
        if (usuario.equals("usuario_demo") && contrasena.equals("contraseña_demo")) {
            // Si las credenciales son válidas, redireccionar a una página de éxito
            response.sendRedirect(request.getContextPath() + "/login_exitoso.html");
        } else {
            // Si las credenciales son inválidas, redireccionar a una página de error
            response.sendRedirect(request.getContextPath() + "/login_error.html");
        }
    }
}
