prog algoritmo490
    funcao classificar(num: int): string
        se num > 0 entao
            retorne "positivo"
        senao se num < 0 entao
            retorne "negativo"
        senao
            retorne "zero"
        fimse
    fimfuncao

    int numero
    imprima "Digite um número: "
    leia numero

    imprima "\nO número é ", classificar(numero)
fimprog
