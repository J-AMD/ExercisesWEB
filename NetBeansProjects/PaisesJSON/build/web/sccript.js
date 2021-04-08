/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var tablaPaises = document.getElementById('tablaPaises');

function consultarPaises(){
    
    var request = new XMLHttpRequest();
    request.onreadystatechange = function(){
        
        if(this.readyState == 4){
            if(this.status == 200){
                var respuesta = this.responseText;
                parsearDatosPaises(respuesta);
            
        }else{
            alert('Error en la comunicacion de datos');
        }
        }
    };
    request.open('GET', 'https://restcountries.eu/rest/v2/all', true);
    request.send();
}

function parsearDatosPaises(datos){
    
    var paises = JSON.parse(datos); // traemos el JSON
    
    for(i =0; i<paises.length; i++){
        var pais = paises[i];
        mostrarDatosPais(pais);
        function mostrarDatosPais(pais){
            
            var trFila = document.createElement('tr');
            var tdCodigo = document.createElement('td');
            var tdNombre = document.createElement('td');
            var tdCapital = document.createElement('td');
            var tdPoblacion = document.createElement('td');
            var tdBandera = document.createElement('td');
            var imgBandera = document.createElement('img');
            
            tdCodigo.innerText = pais.callingCodes[0];
            tdNombre.innerText = pais.name;
            tdCapital.innerText = pais.capital;
            tdPoblacion.innerText = pais.population;
            
            imgBandera.src = pais.flag;
            imgBandera.with = 50;
            imgBandera.height = 50;
            
            tdBandera.appendChild(imgBandera);
        
            trFila.appendChild(tdCodigo);
            trFila.appendChild(tdNombre);
            trFila.appendChild(tdCapital);
            trFila.appendChild(tdPoblacion);
            trFila.appendChild(tdBandera);
            
            
            tablaPaises.appendChild(trFila); //tablaPaises es el objeto referenciado en la parte superior del codigo
            
        }
    }
}