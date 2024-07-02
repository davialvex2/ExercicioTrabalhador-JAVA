/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaempresa;

/**
 *
 * @author Computador
 */
public class Departamento {
    
    public Departamento(){
        
    }

    public Departamento(String nome) {
        this.nome = nome;
    }
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
