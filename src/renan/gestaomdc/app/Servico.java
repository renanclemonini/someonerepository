/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package renan.gestaomdc.app;

/**
 *
 * @author Acer
 */
public class Servico extends Cliente{
    
    private int id;
    private String nomeServico;
    private double precoDinheiro;
    private double precoCartao;
    private int qtdParcelas;

    public Servico() {
    }

    public Servico(int id, String nomeServico, double precoDinheiro, double precoCartao, int qtdParcelas) {
        this.id = id;
        this.nomeServico = nomeServico;
        this.precoDinheiro = precoDinheiro;
        this.precoCartao = precoCartao;
        this.qtdParcelas = qtdParcelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public double getPrecoDinheiro() {
        return precoDinheiro;
    }

    public void setPrecoDinheiro(double precoDinheiro) {
        this.precoDinheiro = precoDinheiro;
    }

    public double getPrecoCartao() {
        return precoCartao;
    }

    public void setPrecoCartao(double precoCartao) {
        this.precoCartao = precoCartao;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    @Override
    public String toString() {
        return "Servicos{" + "id=" + id + ", nomeServico=" + nomeServico + ", precoDinheiro=" + precoDinheiro + ", precoCartao=" + precoCartao + ", qtdParcelas=" + qtdParcelas + '}';
    }
    
    
    
}
