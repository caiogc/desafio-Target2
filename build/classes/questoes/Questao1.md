# Desafio Target

Autor: Caio Guilherme Costa Carvalho


## Questão 1
**Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);**
**Ao final do processamento, qual será o valor da variável SOMA?**

    INDICE = 13, SOMA = 0, K = 0;  
    
    enquanto K < INDICE faça {  
        K = K + 1;  
        SOMA = SOMA + K;  
    }  
    imprimir(SOMA);  

Quando K = 0, SOMA = 0 + 1 = 1  
Quando K = 1, SOMA = 1 + 2 = 3  
Quando K = 2, SOMA = 3 + 3 = 6  
Quando K = 3, SOMA = 6 + 4 = 10  
Quando K = 4, SOMA = 10 + 5 = 15  
Quando K = 5, SOMA = 15 + 6 = 21  
Quando K = 3, SOMA = 21 + 7 = 28  
Quando K = 7, SOMA = 28 + 8 = 36  
Quando K = 8, SOMA = 36 + 9 = 45  
Quando K = 9, SOMA = 45 + 10 = 55  
Quando K = 10, SOMA = 55 + 11 = 66  
Quando K = 11, SOMA = 66 + 12 = 78  
Quando K = 12, SOMA = 78 + 13 = 91  

**SOMA será 91**.
