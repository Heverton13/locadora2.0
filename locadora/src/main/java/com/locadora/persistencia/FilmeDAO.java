
package com.locadora.persistencia;

import com.locadora.modelo.Filme;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Dev
 */
public class FilmeDAO {
    
    private final String INSERTFILME = "INSERT INTO FILMES (titulo, dataLancamento, nota, descricao, quantidade) VALUES (?,?,?,?,?);";
    private final String DELETEFILME = "DELETE FROM FILMES WHERE ID_FILME = ?";
    private final String LISTAFILME = "SELECT * FROM FILMES WHERE ORDER BY";
    
    public boolean inserirFilme(Filme f){
        
        
        Conexao.dbConnection();
        try {
            
            PreparedStatement preparaInstrucao;
            preparaInstrucao = Conexao.getConexao().prepareStatement(INSERTFILME);
            System.out.println(f);
            preparaInstrucao.setString(1,f.getTitulo());
            preparaInstrucao.setDate(2, (Date) f.getDataLancamento());
            preparaInstrucao.setInt(3, f.getNota());
            preparaInstrucao.setString(4, f.getDescricao());
            preparaInstrucao.setInt(5, f.getQuantidade());
            preparaInstrucao.executeUpdate();
            System.out.println("Adicionou");
            Conexao.closeConnection();
            return true;
        } catch (SQLException ex) {
            
            System.err.println(ex);
            ex.printStackTrace();
            return false;
        }
        
    }
    
    /**
     *
     * @return
     */
    public static ArrayList<Filme> listar(){
        
        ArrayList<Filme> lista = new ArrayList<Filme>();
        Conexao.dbConnection();
        String query = "SELECT * FROM FILMES";
        
        try {
            PreparedStatement pst = Conexao.getConexao().prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Filme f = new Filme(
                    rs.getInt("ID"),
                    rs.getString("TITULO"),
                    rs.getDate("DATA_LANCAMENTO"), 
                    rs.getInt("NOTA"),
                    rs.getString("DESCRICAO"),
                    rs.getInt("QUANTIDADE"));  
                lista.add(f);
            }  
            Conexao.closeConnection();
        } catch (Exception e) {
            System.err.println(e);
        }
        return lista;
    }
    
}
