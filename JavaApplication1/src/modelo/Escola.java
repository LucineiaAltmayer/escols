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
   private  Double Area;

    @Override
    public String toString() {
        return Endereco;
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

    public Integer getAlunos() {
        return Alunos;
    }

    public void setAlunos(Integer Alunos) {
        this.Alunos = Alunos;
    }

    public Double getArea() {
        return Area;
    }

    public void setArea(Double Area) {
        this.Area = Area;
    }

}
