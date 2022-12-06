package Controller;


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manager
 */
public class testa_DB {
    
    
   	public static void conecta()
{
               try {
                   Class.forName("com.mysql.jdbc.Driver").newInstance();
                   System.out.println("Conexão bem sucedida");
                   
                   
               } catch (Exception ex) {
                   System.out.println("Erro");
                   
                   Logger.getLogger(testa_DB.class.getName()).log(Level.SEVERE, null, ex);
               }

}

}
