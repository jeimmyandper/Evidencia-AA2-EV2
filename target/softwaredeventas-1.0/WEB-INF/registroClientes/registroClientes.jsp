<!DOCTYPE html>
<html>
<head>
    <title>Formulario de Registro de Clientes</title>
</head>
<body>
    <h1>Registro de Clientes</h1>
    <form action="resultado.jsp" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br><br>

        <label for="cedula">Cédula:</label>
        <input type="text" id="cedula" name="cedula" required><br><br>

        <label for="direccion">Dirección:</label>
        <input type="text" id="direccion" name="direccion" required><br><br>

        <label for="correo">Correo:</label>
        <input type="email" id="correo" name="correo" required><br><br>

        <label for="telefono">Teléfono:</label>
        <input type="text" id="telefono" name="telefono" required><br><br>

        <input type="submit" value="Registrar">
    </form>
</body>
</html>
