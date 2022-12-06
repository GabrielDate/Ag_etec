

package Principal;
import java.sql.*;
import javax.swing.JOptionPane;

public class BD {

Cliente usu = new Cliente();
 String servidor = "com.mysql.jdbc.Driver";
   private String urlBanco = "jdbc:mysql://localhost:3306/agenda2" ;
    private String usuarioBanco ="root";
    private String senhaBanco = "";

public void Consultar() {
try{
    Class.forName(servidor);
   Connection con = DriverManager.getConnection(urlBanco, usuarioBanco, senhaBanco);

Statement stmt = con.createStatement();

String sql = "SELECT * FROM cliente";

ResultSet rs = stmt.executeQuery(sql);

String relacao = "Relação de clientes cadastrados";

while (rs.next()){
    relacao = relacao + "\n Cod: " + rs.getString(1).toString() + " - Nome: " + rs.getString(2) + 
                                                                " - Telefone: " + rs.getString(3);

}
rs.close();

JOptionPane.showMessageDialog (null, relacao + "\n");
} catch (ClassNotFoundException e){
    JOptionPane.showMessageDialog(null, e);
} catch (SQLException e ){
    JOptionPane.showMessageDialog(null, e);
} finally {
        }
    }
public void Incluir(Cliente usr){
    Connection con = null;
    PreparedStatement ps = null;
    int cod = 0;
try{
    Class.forName(servidor);
    con = DriverManager.getConnection(urlBanco, usuarioBanco, senhaBanco);


Statement stmt = con.createStatement();
String sql = "select max(cli_cod) from Cliente";
ResultSet rs = stmt.executeQuery(sql);
rs.next();

while (rs.next()){
cod = rs.getInt("cli_cod") + 1;
    }
rs.close();
String sqlInsert = "insert into cliente values(?, ?, ?);";

ps = con.prepareStatement(sqlInsert);
ps.setInt(1, cod);
ps.setString(2, Tela.nome1 );
ps.setInt(3, Tela.telefone1);

ps.executeUpdate();
ps.close();
con.close();

} catch (ClassNotFoundException e){
   JOptionPane.showMessageDialog(null, e);
} catch (SQLException e ){
     JOptionPane.showMessageDialog(null, "erro mysql");
} 
        }
public void Excluir (Cliente usr){
    Connection con = null;
    PreparedStatement ps = null;

    try{
        Class.forName(servidor);
        con = DriverManager.getConnection(urlBanco, usuarioBanco, senhaBanco);

        String sqlDelete = "delete from cliente where cli_cod = ?;";

        ps = con.prepareStatement(sqlDelete);
        ps.setString(1,Integer.toString(Tela.cod1));
        ps.execute();
        ps.close();

        con.close();
    } catch (ClassNotFoundException e){
   JOptionPane.showMessageDialog(null, e);
} catch (SQLException e ){
     JOptionPane.showMessageDialog(null, "erro mysql");
}
}
public void Alterar (Cliente usr){
try{ //tratamento de erros
      Class.forName(servidor);//busca Driver
      //conecta no BD
      Connection con=DriverManager.getConnection(urlBanco, usuarioBanco, senhaBanco );
      Statement stmt= con.createStatement();//objeto comdo sql

int registro = stmt.executeUpdate("update Cliente set cli_nome='" + Tela.nome1 + "', cli_tel=" + 
                                                Tela.telefone1 + " where cli_cod=" + Tela.cod1);

if (registro!=0) JOptionPane.showMessageDialog(null,"Dados Alterados!");
                 else JOptionPane.showMessageDialog(null,"Dados Não Alterados!");
            stmt.close();
            con.close(); //fecha conexão com BD
      } catch(SQLException e){ //trata os erros
            JOptionPane.showMessageDialog(null,"Erro Cmdo SQL "+e.getMessage());
            } catch(ClassNotFoundException e){
             JOptionPane.showMessageDialog(null,"Driver não encontrado");
        }

}

public void Pesquisar (Cliente usr){
    boolean consulta=true;
        try{ //tratamento de erros
            Class.forName(servidor);//busca Driver
            //conecta no BD
            Connection con=DriverManager.getConnection(urlBanco, usuarioBanco, senhaBanco);
            Statement stmt= con.createStatement();//objeto comdo sql
            ResultSet RS= stmt.executeQuery("Select * from Cliente where cli_cod=" + Tela.cod1 );
            while (RS.next()){

                int Mat= RS.getInt("cli_tel");
                Tela.telefone1 = Mat;
                Tela.nome1 = RS.getString("cli_nome"); // Pega o Nome
                consulta=false;
                JOptionPane.showMessageDialog(null,"Dados Encontrados!");
            }
            if (consulta) JOptionPane.showMessageDialog(null,"Dados Não Encontrados!");
            RS.close();
            stmt.close();
            con.close(); //fecha conexão com BD
        } catch(SQLException e){ //trata os erros
            JOptionPane.showMessageDialog(null,"Erro Cmdo SQL "+e.getMessage());
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Driver não encontrado");
        }

}
}