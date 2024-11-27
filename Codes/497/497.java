prog algoritmo497
    funcao potencia(base: int, expoente: int): int
        int resultado <- 1
        para i de 1 ate expoente faca
            resultado <- resultado * base
        fimpara
        retorne resultado
    fimfuncao

    int base, expoente
    imprima "Digite a base: "
    leia base
    imprima "Digite o expoente: "
    leia expoente

    imprima "\n", base, " elevado a ", expoente, " é ", potencia(base, expoente)
fimprog
