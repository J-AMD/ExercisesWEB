<%-- 
    Document   : negocio
    Created on : 9/07/2019, 03:12:10 PM
    Author     : Jesus Martinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.generation.projectmiranchito.models.Negocio"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" src="css/negocio.css"/>
        <link rel="stylesheet" type="text/css" href="css/styles.css">

    </head>
    <body>
        <%Negocio n = (Negocio) request.getAttribute("n");%>
        <header class="site-header">
            <div>
                <div class="d-flex justify-content-around" id="titulo">
                    <div><h1><a id="titulo" href="index.jsp">MiRanchito!</a></h1></div>
                    <nav class="btnTitulo" style="padding-top: 10px">
                        <a href="index.jsp">Inicio</a>
                        <a href="infosite.jsp" >Informacion</a>
                        <a href="iniciar.Registrar.jsp">Iniciar/Registrarse</a>
                    </nav>
                </div>
            </div>
        </header>
        <div class="container main-secction">
            <div class="row">

                <div class="row user-left-part">
                    <div class="col-md-3 col-sm-3 col-xs-12 user-profil-part pull-left">
                        <div class="row ">
                            <div class="col-md-12 col-md-12-sm-12 col-xs-12 user-image text-center">
                                <img class="imgNegocio" src="<%=n.getImagen()%>" class="rounded-circle">
                            </div>
                            <div class="col-md-12 col-sm-12 col-xs-12 user-detail-section1 text-center">
                                <button id="btn-contact" data-toggle="modal" data-target="#contact" class="btn btn-success btn-block follow">Contactarme</button> 
                                <button class="btn btn-warning btn-block">Descargar Ubicacion</button>                               
                            </div>


                        </div>
                    </div>
                    <div class="col-md-9 col-sm-9 col-xs-12 pull-right profile-right-section">
                        <div class="row profile-right-section-row">
                            <div class="col-md-12 profile-header">
                                <div class="row">
                                    <div class="col-md-8 col-sm-6 col-xs-6 profile-header-section1 pull-left">
                                        <h1><%=n.getNombre()%></h1>
                                    </div>

                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="row">
                                    <div class="col-md-8">
                                        <ul class="nav nav-tabs" role="tablist">
                                            <li class="nav-item">
                                                <a class="nav-link active" href="#profile" role="tab" data-toggle="tab"><i class="fas fa-user-circle"></i> Perfil Profesional</a>
                                            </li>                                  
                                        </ul>

                                        <!-- Tab panes -->
                                        <div class="tab-content">
                                            <div role="tabpanel" class="tab-pane fade show active" id="profile">
                                                <div class="row">
                                                    <div class="col-md-2">
                                                        <label>ID</label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p><%=n.getId()%></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-2">
                                                        <label>Nombre</label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p><%=n.getNombre()%></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-2">
                                                        <label>Email</label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p><%=n.getCorreo()%></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-2">
                                                        <label>Teléfono</label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p><%=n.getTelefono()%></p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-2">
                                                        <label>Ubicacion</label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p><%=n.getUbicacion()%></p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div role="tabpanel" class="tab-pane fade" id="buzz">
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label>Experience</label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p>Expert</p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label>Hourly Rate</label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p>10$/hr</p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label>Total Projects</label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p>230</p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label>English Level</label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p>Expert</p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label>Availability</label>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <p>6 months</p>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <label>Your Bio</label>
                                                        <br>
                                                        <p>Your detail description</p>
                                                    </div>
                                                </div>
                                            </div>

                                        </div>

                                    </div>
                                    <div class="col-md-4 img-main-rightPart">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>           
    </body>
</html>
