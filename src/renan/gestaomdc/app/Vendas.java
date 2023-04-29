/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package renan.gestaomdc.app;

/**
 *
 * @author Acer
 */
public class Vendas extends Servico{
    
    private int idVenda;
    private int idCliente;
    private int idServico;
    private String historicoAtendimento;

    public Vendas() {
    }

    public Vendas(int idVenda, Cliente idCliente, Servico idServico) {
        this.idVenda = idVenda;
        testeIdCliente(idCliente);
        testeIdServico(idServico);
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }
    
    private void testeIdCliente(Cliente cliente){
        this.idCliente = cliente.getId();
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    private void testeIdServico(Servico servico){
        this.idServico = servico.getId();
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getHistoricoAtendimento() {
        return historicoAtendimento;
    }

    public void setHistoricoAtendimento(String historicoAtendimento) {
        this.historicoAtendimento = historicoAtendimento;
    }

    @Override
    public String toString() {
        return "Vendas{" + "idVenda=" + idVenda + ", idCliente=" + idCliente + ", idServico=" + idServico + '}';
    }

    
    
    
    
}
