<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/Styles.css">
        <link rel="stylesheet" href="css/SEspacioEmple.css">
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/Estilos_Menu_EspacioEmpleado.css">
        <title>Empleado</title>
    </head>

    <body>
        <!-- Parte del menú-->

        <header>
            <section class="sec_menu">
                <a href="index.jsp" id="Logo">Cementerios</a>

                <label for="menu-1" class="menu">
                    <ul>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>

                    </ul>
                </label>
                <input type="checkbox" id="menu-1">

                <nav>
                    <ul>
                        <li><a href="#sec2">Nosotros</a></li>
                        <li><a href="#sec3">Servicios</a></li>
                        <li><a href="#sec4">Aliados</a></li>
                        <li><a href="">Contacto</a></li>
                        <li><a href="Login.jsp">Ingreso</a></li>
                    </ul>
                </nav>
            </section>
        </header>

        <!-- Fin Menú-->

        <!-- Contenido pagina principal -->
        <main>
            <h1>Espacio Empleado</h1>
            <section class="s1">
                <div class="caja">
                    <button><a href="Fallecido.jsp">Fallecidos</a></button>
                </div>
                <div class="caja">
                    <button><a href="Tumba.jsp">Tumbas</a></button>
                </div>

                <div class="caja">
                    <button><a href="Visitante.jsp">Visitantes</a></button>
                </div>



            </section>
            <section class="s2">

                <div class="caja">
                    <button><a href="Novedad.jsp">Novedad</a></button>
                </div>

                <div class="caja">
                    <button><a href="Actividad.jsp">Actividades</a></button>
                </div>

                <div class="caja">
                    <button><a href="Herramientas.jsp">Herramientas</a></button>
                </div>
                
                <div class="caja">
                    <button><a href="Usuario.jsp">Usuarios</a></button>
                </div>

            </section>
            <section>

                <div class="container">
                    <div id="navMenu" class="diamond">
                        <div id="mainRotCorrect" class="rotCorrect">
                            <i class="fa fa-cubes fa-4x" aria-hidden="true">
                                <a href="Gestion Ventas.html"> <img src="Ico/ventas.png" alt=""></a>
                                <span class="unspam">Ventas</span>
                            </i>
                        </div>
                    </div>
                    <div id="nav1" class="nav nav1 diamond">
                        <div class="rotCorrect">
                            <i class="fa fa-home fa-2x" aria-hidden="true">
                                <a href="Gestion Ususarios.html"> <img src="Ico/Usuarios.png" alt=""></a>
                                <span class="unspam">Usuarios</span>
                            </i>
                        </div>
                    </div>

                    <div id="nav2" class="nav nav2 diamond">
                        <div class="rotCorrect">
                            <i class="fa fa-file-text-o fa-2x" aria-hidden="true">
                                <a href="Gestion Proveedores.html"> <img src="Ico/proveedor.png" alt=""></a>
                                <span class="unspam">Proveedores</span>
                            </i>
                        </div>
                    </div>
                    <div id="nav3" class="nav nav3 diamond">
                        <div class="rotCorrect">
                            <i class="fa fa-calendar fa-2x" aria-hidden="true">
                                <a href="Gestion Productos.html"> <img src="Ico/Productos.png" alt=""></a>
                                <span class="unspam">Productos</span>
                            </i>
                        </div>
                    </div>
                    <div id="nav4" class="nav nav4 diamond">
                        <div class="rotCorrect">
                            <i class="fa fa-line-chart fa-2x" aria-hidden="true">
                                <a href="Gestion Clientes.html"> <img src="Ico/Cliente.png" alt=""></a>
                                <span class="unspam">Clientes</span>
                            </i>
                        </div>
                    </div>
                    <div id="nav5" class="nav nav5 diamond">
                        <div class="rotCorrect">
                            <i class="fa fa-cogs fa-2x" aria-hidden="true">
                                <a href="Reportes.html"> <img src="Ico/reportes.png" alt=""></a>
                                <span class="unspam">Reportes</span>
                            </i>
                        </div>
                    </div>
                </div>

            </section>
        </main>



    </body>

</html>
