$(document).ready(function () {
    function conexion() {
        var url = "";
        var data = "";
        $.ajax({
            url:url,
            data:data,
            datatype:"json",
            error:function (resp,status){
                alert('errror al recuperar datos');
                
            },success: function (resp) {
                
            }
        })
    }

});
