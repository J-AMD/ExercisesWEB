function agregarFrutaPeticion(){
    // Objetos recuperados del DOM
    var inputNombre = $("#inputNombre");
    var inputColor = $("#inputColor");
    var inputPeso = $("#inputPeso");
    var inputPrecio = $("#inputPrecio");
    
    console.log(inputNombre);
    console.log(inputColor);
    console.log(inputPeso);
    console.log(inputPrecio);
    
    var nombre = inputNombre.val();
    var color = inputColor.val();
    var peso = inputPeso.val();
    var precio = inputPrecio.val();
    
    console.log(nombre);
    console.log(color);
    console.log(peso);
    console.log(precio);
    
    var futa = {
        nombre: nombre,
        color: color,
        peso: parseFloat(peso),
        precio: parseFloat(precio)
    };
    
    $.ajax({
        url:'http://node46809-env-0710569.jl.serv.net.mx/canastafrutas/api/canastafruta/agregar',
        method: 'POST',
        data: fruta,
        dataType: "application/json",
        success: function(result){
            console.log(result);
        }
    }); 
}

