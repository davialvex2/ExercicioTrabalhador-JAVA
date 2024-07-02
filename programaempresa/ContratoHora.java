/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaempresa;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Computador
 */
public class ContratoHora {
    
    public ContratoHora(){
        
    }   

    public ContratoHora(Date data, double valorPorHora, int horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }
    
    
    private Date data;
    private double valorPorHora;
    private int horas;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    public Double totalHoras(){
        return horas * valorPorHora;
    }
}
