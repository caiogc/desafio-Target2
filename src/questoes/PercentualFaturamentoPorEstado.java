/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Caio Carvalho
 * 
 * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
        • SP – R$67.836,43
        • RJ – R$36.678,66
        • MG – R$29.229,88
        • ES – R$27.165,48
        • Outros – R$19.849,53
    Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora. 
 */
public class PercentualFaturamentoPorEstado {
    public static void main(String[] args) {
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        double faturamentoTotal = faturamentoPorEstado.values().stream().mapToDouble(Double::doubleValue).sum();

        System.out.println("Representação percentual de cada estado:");
        System.out.println("----------------------------------------");

        for (Map.Entry<String, Double> entrada : faturamentoPorEstado.entrySet()) {
            String estado = entrada.getKey();
            double faturamento = entrada.getValue();
            double percentual = (faturamento / faturamentoTotal) * 100;

            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }

        System.out.println("----------------------------------------");
        System.out.printf("Faturamento Total: R$ %.2f\n", faturamentoTotal);
    }
}
