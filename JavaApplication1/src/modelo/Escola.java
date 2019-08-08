/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Escola {
    private String Nome;
    private String Endereco;
    private String Sigla;
    private Integer Codigo;
    private Integer Alunos;
   private Integer Area;

    public Integer getAlunos() {
        return Alunos;
    }

    public void setAlunos(Integer Alunos) {
        this.Alunos = Alunos;
    }


    public Integer getArea() {
        return Area;
    }

    public void setArea(Integer Area) {
        this.Area = Area;
    }

    @Override
    public String toString() {
        return Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String Sigla) {
        this.Sigla = Sigla;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }
    
}
