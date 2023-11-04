# Programação Dinâmica (PD)

A **Programação Dinâmica** é uma técnica amplamente utilizada na resolução de problemas de otimização. Ela é crucial, pois permite chegar sempre à resposta ótima do problema em tempo linear. Para isso, mantemos alguma estrutura para armazenar os resultados prévios dos subproblemas já resolvidos.

Inicialmente, isso pode parecer abstrato, mas a ideia principal dessa técnica pode ser abstraída se pensarmos que a PD é, essencialmente, uma "recursão otimizada". Para todo problema de PD, podemos criar uma função de recorrência identificando os subproblemas, os "estados" e suas respectivas "transições".

Basicamente, existem duas formas de resolver problemas de PD:

1. **Memoização:** A ideia da memoização é criar uma estrutura que armazena os resultados previamente calculados de um problema e seus subproblemas. Ao salvar os resultados, evitamos cálculos redundantes e alcançamos uma resolução em tempo linear. Um exemplo clássico disso é o cálculo recursivo de Fibonacci. Quando não armazenamos resultados anteriores, é necessário percorrer toda a árvore até a folha para obter resultados já calculados. A memoização é geralmente mais fácil de entender e é implementada usando recursividade. Essa abordagem é conhecida como "Top-down", pois partimos do problema "resolvido" e, ao descer na recursão, resolvemos o problema.

2. **Tabulação:** Na tabulação, armazenamos os resultados geralmente em vetores ou matrizes. Essa abordagem geralmente resulta em um código mais eficiente, mas é mais desafiadora na identificação dos subproblemas, estados e transições, pois é menos intuitiva. Essa abordagem é implementada de forma iterativa e é conhecida como abordagem "Bottom-up" do problema.
    

A escolha entre memoização e tabulação depende do problema e das preferências do programador, mas ambas são poderosas ferramentas para lidar com problemas de otimização e resolvê-los de maneira eficiente.

