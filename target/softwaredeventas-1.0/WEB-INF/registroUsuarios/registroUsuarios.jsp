<!DOCTYPE html>
<html>
<head>
    <title>Formulario de Registro de Usuarios</title>
</head>
<body>
    <h1>Registro de Usuarios</h1>
    <form action="registroUsuarios" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br><br>

        <label for="cedula">Cédula:</label>
        <input type="text" id="cedula" name="cedula" required><br><br>

        <label for="contrasena">Contraseña:</label>
        <input type="password" id="contrasena" name="contrasena" required><br><br>

        <input type="submit" value="Registrar">
    </form>
</body>
</html>
