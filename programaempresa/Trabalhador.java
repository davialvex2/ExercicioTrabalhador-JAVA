/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaempresa;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Trabalhador{
    
    Scanner tec = new Scanner(System.in);
    
    private String nome;
    private NivelTrabalhador nivel;
    private Double salarioBase;
    
    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();
    
    public Trabalhador(){
    }

    public Trabalhador(String nome, NivelTrabalhador nivel, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }
    
    public void AdicionarContrato(ContratoHora contrato){
        contratos.add(contrato);
    }
    public void RemoverContrato(ContratoHora contrato){
        contratos.remove(contrato);
    }
    
    //criado metodo com com os contrutores ano e mês
    public Double Renda(int ano, int mes){
    // criando variavel para quando a soma     
        Double soma = salarioBase;
    // utilizando a classe Calendar manipular a data 
        Calendar cal = Calendar.getInstance();
    // lopp para pecorer a lista de contratos
        for (ContratoHora listac : contratos){
            cal.setTime(listac.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONDAY);
            if(c_ano == ano && c_mes == ano){
                soma += listac.totalHoras();
            }
        }
        return soma;
    }
 
   
}
