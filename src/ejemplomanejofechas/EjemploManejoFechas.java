/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomanejofechas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author oscarquinteros
 */
public class EjemploManejoFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Calendar cal = Calendar.getInstance();

      System.out.println("Fecha actual :" + cal.getTime());

      System.out.println("Año actual :" + cal.get(Calendar.YEAR));
      
      System.out.println("Mes actual :" + cal.get(Calendar.MONTH));
      
      System.out.println("Dia actual :" + cal.get(Calendar.DAY_OF_MONTH));
      
      cal.set(2013,9,12); // El mes se numera desde 0 a 11, 0 = enero.
      	  
      System.out.println("Fecha seleccionada:  " + cal.getTime());    
      
      // Formateando la presentacion de la fecha a String:
      
      DateFormat formato1 = new SimpleDateFormat("dd/MM/yy");

      String fecha = formato1.format(cal.getTime());
      
      System.out.println("Fecha formateada:  " + fecha);    
      
      DateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd");
        
      fecha = formato2.format(cal.getTime());
      
      System.out.println("Fecha formateada:  " + fecha);    
      
      // La clase java.sql.Date hereda de java.util.Date, y presenta la fecha
      // en un formato apto para ser enviado via JDBC a la base de datos
      
            
      java.sql.Date sqlDate = new java.sql.Date(cal.getTime().getTime());
      
      System.out.println("Fecha sql:  " + sqlDate);    
      
      
    }
    
}
