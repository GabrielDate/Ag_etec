/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao3;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class Atualiza {
  
   public static DefaultTableModel  cliente(ResultSet rs) {
        try {
           ResultSetMetaData metaData = rs.getMetaData();
         int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();

            columnNames.addElement("Código");
            columnNames.addElement("Nome");
            columnNames.addElement("E-mail");
            columnNames.addElement("Telefone");
            
            
            // Get all rows.
            
            Vector rows = new Vector();
            while (rs.next()) {
                Vector newRow = new Vector();
                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                rows.addElement(newRow);
            }
           return new DefaultTableModel(rows, columnNames);
       } catch (Exception e) {

           return null;
        }
        
    }
    
    
    
}
