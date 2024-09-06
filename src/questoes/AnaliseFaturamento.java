/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Caio Carvalho
 * 
 * 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
        • O menor valor de faturamento ocorrido em um dia do mês;
        • O maior valor de faturamento ocorrido em um dia do mês;
        • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
 */
public class AnaliseFaturamento {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            JSONArray dadosFaturamento = (JSONArray) parser.parse(new FileReader("dados.json"));         

            List<Double> faturamentoNaoZero = new ArrayList<>();
            for (Object obj : dadosFaturamento) {
                JSONObject entrada = (JSONObject) obj;
                double valor = (double) entrada.get("valor");
                if (valor > 0) {
                    faturamentoNaoZero.add(valor);
                }
            }

            if (faturamentoNaoZero.isEmpty()) {
                System.out.println("Nenhum dado de faturamento válido encontrado.");
                return;
            }

            double menorFaturamento = faturamentoNaoZero.stream().mapToDouble(v -> v).min().orElse(0);
            double maiorFaturamento = faturamentoNaoZero.stream().mapToDouble(v -> v).max().orElse(0);
            double mediaMensal = faturamentoNaoZero.stream().mapToDouble(v -> v).average().orElse(0);
            long diasAcimaDaMedia = faturamentoNaoZero.stream().filter(v -> v > mediaMensal).count();

            System.out.printf("Menor valor de faturamento: R$ %.2f%n", menorFaturamento);
            System.out.printf("Maior valor de faturamento: R$ %.2f%n", maiorFaturamento);
            System.out.printf("Número de dias acima da média mensal: %d%n", diasAcimaDaMedia);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}

