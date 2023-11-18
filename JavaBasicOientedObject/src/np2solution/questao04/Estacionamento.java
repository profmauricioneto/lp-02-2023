/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package np2solution.questao04;

/**
 *
 * @author maumneto
 */
public class Estacionamento {
    public String placa;
    public String modelo;
    public int horaEntrada;
    public int horaSaida;
    
    public Estacionamento() {
        this.placa = "";
        this.modelo = "";
        this.horaEntrada = 0;
        this.horaSaida = 0;
    }
    
        public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }
    
    public void apresentarDados() {
        System.out.println("Placa: " + placa);
       System.out.println("Modelo: " + modelo);
       System.out.println("Hora entrada: " + horaEntrada);
       System.out.println("Hora Saida: " + horaSaida);
    }
    
    public double calcularEstacionamento() {
        int horasEstacionadas = horaSaida - horaEntrada;
        return horasEstacionadas*1.5;
    }
}
