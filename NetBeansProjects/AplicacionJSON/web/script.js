/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var listaAnimales = document.getElementById('listaAnimales');

function consultarJSON(){
    
    var request = new XMLHttpRequest();
request.onreadystatechange = function(){
    
    if(this.readyState == 4 && this.status == 200){
        
       // console.log(this.responseText);
        var datos = this.responseText;
            parsearDatos(datos);
        
    }
};

method = "GET";
var url = "animales.json";
request.open(method, url, true);
request.send();
}

function parsearDatos(datos){
    
    var animales = JSON.parse(datos);
    //console.log(animales);
    procesarDatosAnimales(animales);
}

function procesarDatosAnimales(animales){
    for(i=0; i<animales.length; i++){
        var animal=animales[i];
        var nombre = animal.nombre;
        var tipo = animal.tipo;
        var img = animal.imagen;
        var ambiente = animal.ambiente;
        var extinto = animal.extinto;
        var tiempoVida = animal.tiempo_vida;
        
        mostrarAnimal(nombre, tipo, img, ambiente, extinto, tiempoVida);
        
    }
}

function mostrarAnimal(nombre, tipo, imgUrl, ambiente, extinto, tiempoVida){
    
    var liElemento = document.createElement('li');// se crea una lista <li>
    var divContenedor = document.createElement('div');
    var contTitulo = document.createElement('div');
    var encabezadoNombre = document.createElement('h4');
    var imgAnimal = document.createElement('img');
    var pTipo = document.createElement('p');
    var pAmbiente = document.createElement('p');
    var pExtinto = document.createElement('p');
    var pVida = document.createElement('p');
    
    encabezadoNombre.innerText = nombre;
    imgAnimal.src = imgUrl;
    imgAnimal.with = 50;
    imgAnimal.height = 50;
    
    pTipo.innerText = "Tipo: "+tipo;
    pAmbiente.innerText = "Ambiente: "+ambiente;
    pExtinto.innerText = "Extinto: "+extinto;
    pVida.innerText = "Tiempo de vida: "+tiempoVida;
    
    contTitulo.appendChild(encabezadoNombre);
    contTitulo.appendChild(imgAnimal);
    
    divContenedor.appendChild(contTitulo);
    divContenedor.appendChild(pTipo);
    divContenedor.appendChild(pAmbiente);
    divContenedor.appendChild(pExtinto);
    divContenedor.appendChild(pVida);
    liElemento.appendChild(divContenedor);
    listaAnimales.appendChild(liElemento);
}

