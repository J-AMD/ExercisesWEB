/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamientofechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Jesus Martinez
 */
public class TratamientoFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //mostrarFecha();
        //mostrarFechaCalendario();
        //mostrarTimeZone();
        mostrarFechaConFormato();
    }
    
    public static void mostrarFecha(){
        
        Date date = new Date();
        System.out.println(date);
    }
    
    public static void mostrarFechaCalendario(){
        Calendar calendario = Calendar.getInstance();
        Date date = calendario.getTime();
        System.out.println(date);
        calendario.add(Calendar.DATE, 1);// agrega un dia
        date = calendario.getTime();
        System.out.println(date);
        calendario.add(Calendar.HOUR, 10);// agrega 10 hora si ponemos un signo negativo las restaria
        date = calendario.getTime();
        System.out.println(date);
        
        int anio = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DATE);
        int hora = calendario.get(Calendar.HOUR);
        int minuto = calendario.get(Calendar.MINUTE);
        int segundo = calendario.get(Calendar.SECOND);
        
        System.out.println("AÑO: "+ anio);
        System.out.println("Mes:"+ mes);
        System.out.println("Dia: "+ dia);
        System.out.println("Hora: "+ hora);
        System.out.println("Minuto: "+ minuto);
        System.out.println("Segundo: "+ segundo);
        
        
    }
    
    public static void mostrarTimeZone(){
        TimeZone timeZone = TimeZone.getDefault();
        String timeZoneId = timeZone.getID();
        System.out.println(timeZoneId);
        
        for(String tz: TimeZone.getAvailableIDs()){
            System.out.println(tz);
        }
    }
    
    public static void mostrarFechaConFormato(){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM");//Eliges el formato que le quieres dar
        Date now = new Date();
        String fechaFormateada = formato.format(now);
        System.out.println(fechaFormateada);
        
        String fechaTexto = "2019-07-08 13:00:00";
        try{
            Date tomorrow = formato.parse(fechaTexto);
            System.out.println(tomorrow);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Fecha con mal formato");
        }
        
        
    }
}
