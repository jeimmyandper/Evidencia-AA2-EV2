<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Módulo de Inventario - Pintu-Paipa</title>
</head>
<body>
    <header>
      
    </header>
    <nav>
    </nav>
    
    <section id="modulo-inventario">
        <h2>Módulo de Inventario</h2>
        <!-- Contenido del formulario del módulo de inventario -->
        <form action="moduloInventario" method="post">
            <!-- Campos del formulario para el inventario -->
            <input type="text" name="nombreProducto" placeholder="Nombre del Producto">
            <input type="text" name="categoria" placeholder="Categoría">
            <input type="text" name="tamaño" placeholder="Tamaño">
            <input type="text" name="color" placeholder="Color">
            <button type="submit">Enviar</button>
        </form>
    </section>
    <footer>
        <!-- Contenido del pie de página -->
    </footer>
</body>
</html>