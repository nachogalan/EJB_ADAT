<%-- 
    Document   : index
    Created on : 05-nov-2018, 13:54:02
    Author     : Nacho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html;
       charset=UTF-8">
 <title>Inicio</title>
 </head>
 <body>
     
 <h1>Actores. Obtiene todos los Actores con EJB </h1>
 <form action="servlet" method="POST">Presiona el
botón para obtener los datos.
 <input type="submit" name="enviar" value="Enviar"
/></form>
 
 <h1>Busqueda de actor por nombre, sanz es guapisimmo.</h1>
 <form action="servletBuscar" method="POST">
     Nombre:<input type="text" name="nombreBusqueda" id="nombreBusqueda"/></br>
 <input type="submit" text="Buscalo de una" name="buscar" value="Buscar"/>
 </form>
     
 <h1>Actores. Insertar un Actor con EJB </h1>
 <form action="servletInsertar" method="POST">
     Nombre:<input type="text" name="nombre" id="nombre"/></br></br>
     Fecha de nacimiento:<input type="date" name= "f_nacimiento" id="f_nacimiento"/></br></br>
     Nacionalidad:<input type="text" name= "nacionalidad" id="nacionalidad"/></br> </br>
     <input type="submit" text="Insertalo de unas" name="enviar" value="Enviar"/>
 </form>
 <h1>Actores. Borrsr un Actor con EJB </h1>
 <form action="ServletDelete" method="POST">
     <input type="submit" text="Insertalo de unas" name="enviar" value="Ir a borrar"/>
 </form>
 </body>
</html>
