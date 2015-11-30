<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title></title>
        <link rel="stylesheet" href="../../css/Css_Formulario/form.css"  type="text/css" >
         <link rel="stylesheet" type="text/css" media="screen" href="../../css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" media="screen" href="../../css/font-awesome.min.css">

        <!-- SmartAdmin Styles : Please note (smartadmin-production.css) was created using LESS variables -->
        <link rel="stylesheet" type="text/css" media="screen" href="../../css/smartadmin-production.min.css">
        <link rel="stylesheet" type="text/css" media="screen" href="../../css/smartadmin-skins.min.css">
        <link rel="stylesheet" type="text/css" media="screen" href="../../css/demo.min.css">

        <!-- #FAVICONS -->
        <link rel="shortcut icon" href="../../img/favicon/favicon.ico" type="image/x-icon">
        <link rel="icon" href="../../img/favicon/favicon.ico" type="image/x-icon">
    </head>
    <body>

        <title class="title" >Registrar Privilegio</title>
        <form action="../../Privilegio"> 
            <center><label class="title"> Registrar Rol</label>
                <table class="table" >  
                    <tr><td>Modulo:</td>
                        <td >
                            <select class="select_modulo" name="modulo" required="">
                            </select>
                        </td>
                    </tr>
                    <tr><td>Nombre de Privilegio:</td><td ><input type="text" name="No_Link" class=""></td></tr>
                    <tr><td>direccion url</td><td ><input type="text" name="Di_url" class=""></td></tr>
                    <tr><td>direccion icono</td><td ><input type="text" name="Ic_Link" class=""></td></tr>
                    <tr><td>Estado Privilegio</td><td>
                            <select name="Es_privilegio"  required="">
                                <option  value="1">Activado</option>
                                <option  value="0">Desactivado</option>
                            </select>
                        </td></tr>                           
                    <tr><td colspan="2"><button type="submit" value="REGISTRAR PRIVILEGIO"  name="opc">REGISTRAR PRIVILEGIO</button></td></tr>
                </table>
            </center>
        </form>
    </body>
    <script type="text/javascript" src="../../js/JQuery/jQuery.js"></script>
    <script>
        $(document).ready(function() {
        list_modulo();    
        function list_modulo() {
                var mo = $(".select_modulo");
                $.post("../../modulo", "opc=lis_mod", function(objJson) {
                    mo.empty();
                    var lista = objJson.lista;
                    mo.append("<option value=''>[SELECCIONAR]</option>");
                    for (var i = 0; i <= lista.length; i++) {
                        mo.append("<option value='" + lista[i].id_mod + "' >" + lista[i].no_mod + "</option>");
                    }
                });
            }
        })
    </script>
</html>