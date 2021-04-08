/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var listaRecetas = document.getElementById('listaRecetas');

function mostrarRecetas(){
    
    var request = new XMLHttpRequest;
    request.onreadystatechange = function(){

        if(this.readyState == 4){
            if(this.status == 200){
                var recetas = this.responseText;
                
                parsearRecetas(recetas);
            
        }else{
            alert('Error en la comunicacion de datos');
        }
        }
    };
    request.open('GET', 'recetas.json', true);
    request.send();
}

function parsearRecetas(datos){
    
    var recetas = JSON.parse(datos); // traemos el JSON
    
    for(i =0; i<recetas.length; i++){
        var receta = recetas[i];
        mostrarDatosReceta(receta);
        function mostrarDatosReceta(receta){
            
            var trFila = document.createElement('tr');
            var tdTitulo = document.createElement('td');
            var tdImagen = document.createElement('td');
            var tdButton = document.createElement('td');
            var imgComida = document.createElement('img');
            var button = document.createElement('button');
            
            tdTitulo.innerText = receta.title;
            button.innerHTML = "Ingredientes";
       
            imgComida.src = receta.image_url;
            imgComida.with = 50;
            imgComida.height = 50;
            
            tdImagen.appendChild(imgComida);
            tdButton.appendChild(button);
            
            trFila.appendChild(tdTitulo);
            trFila.appendChild(tdButton);
            trFila.appendChild(tdImagen);
                
            listaRecetas.appendChild(trFila); //tablaPaises es el objeto referenciado en la parte superior del codigo
            
        }
    }
}