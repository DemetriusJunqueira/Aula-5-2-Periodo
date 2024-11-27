prog algoritmo500
    funcao celsiusParaFahrenheit(celsius: real): real
        retorne (celsius * 9 / 5) + 32
    fimfuncao

    real celsius
    imprima "Digite a temperatura em Celsius: "
    leia celsius

    imprima "\nA temperatura em Fahrenheit é: ", celsiusParaFahrenheit(celsius)
fimprog
