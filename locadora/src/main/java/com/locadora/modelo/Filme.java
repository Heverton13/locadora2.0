
package com.locadora.modelo;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Dev
 */
public class Filme {
    
    private int id;
    private String titulo;
    private Date dataLancamento;
    private int nota;
    private String descricao;
    private int quantidade;
    private int qtdCesta;

    public Filme() {
    }

    public Filme(String titulo, Date dataLancamento, int nota, String descricao, int quantidade, int qtdCesta) {
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.nota = nota;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.qtdCesta = qtdCesta;
    }

    public Filme(int id, String titulo, Date dataLancamento, int nota, String descricao, int quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.nota = nota;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.qtdCesta = qtdCesta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQtdCesta() {
        return qtdCesta;
    }

    public void setQtdCesta(int qtdCesta) {
        this.qtdCesta = qtdCesta;
    }

    @Override
    public String toString() {
        return "Filme{" + "id=" + id + ", titulo=" + titulo + ", dataLancamento=" + dataLancamento + ", nota=" + nota + ", descricao=" + descricao + ", quantidade=" + quantidade + '}';
    }
    
    
    
    
    
    
}
