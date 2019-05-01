
package com.locadora.controller;

import com.locadora.modelo.Filme;
import com.locadora.persistencia.FilmeDAO;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Dev
 */
@ManagedBean(name="controler")
public class ControlerFilme {
    
    private Filme filme = new Filme();
    FilmeDAO fp = new FilmeDAO();

    public ControlerFilme() {
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    public void salvarFilme(){
        System.out.println("Aqui");
        fp.inserirFilme(filme);
    }
    
    
}
