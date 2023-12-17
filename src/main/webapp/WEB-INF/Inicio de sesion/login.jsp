<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Iniciar Sesión</title>
    <!-- Enlace a tus estilos CSS -->
    <link rel="stylesheet" href="ruta/a/tus/estilos.css">
</head>
<body>
    <h2>Iniciar Sesión</h2>
    <form action="LoginServlet" method="post">
        <div>
            <label for="usuario">Usuario:</label>
            <input type="text" id="usuario" name="usuario" required>
        </div>
        <div>
            <label for="contrasena">Contraseña:</label>
            <input type="password" id="contrasena" name="contrasena" required>
        </div>
        <button type="submit">Iniciar Sesión</button>
    </form>
</body>
</html>
