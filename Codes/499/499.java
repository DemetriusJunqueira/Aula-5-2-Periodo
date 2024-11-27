prog algoritmo499
    funcao parOuImpar(num: int): string
        se num % 2 == 0 entao
            retorne "par"
        senao
            retorne "ímpar"
        fimse
    fimfuncao

    int numero
    imprima "Digite um número: "
    leia numero

    imprima "\nO número ", numero, " é ", parOuImpar(numero)
fimprog
