/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package renan.gestaomdc.app;

/**
 *
 * @author Acer
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente(0, "Renan", "(71)99633-3313");
        
        Servico s1 = new Servico(0, "Design de Sobrancelhas com Henna", 45, 45, 1);
        
//        Vendas v1 = new Vendas(0, c1, s1);
        
        System.out.println("""
                           Vendas: 
                           Cliente: """+c1.getNome()+"\nServiço realizado: "+s1.getNomeServico());
                
    }
            
}
