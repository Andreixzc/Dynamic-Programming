# CoinChange
**Top-down:**
A abordagem top-down, é bastante intuitiva. Basicamente vamos realizar uma força bruta recursiva, porém para cada retorno vamos armazenar o seu resultado diante sua entrada, afim de evitar re-calcular funções em que ja possuimos a resposta.
Basicamente, vamos pegar o minimo do retorno de  min(1+ coinChange(troco-moeda)) para cada moeda do conjunto.
Sendo assim, a formula de recorrência se da por:
coinChange(coins, amount) = 1 + min(coinChange(coins, amount - coin)) para cada moeda do conjunto.

**Bottom-up**
Essa abordagem é menos intuitiva, mas segue a mesma lógica.
Primeiramente inicializamos um vetor com tamanho troco+1.
Cada indice desse vetor vai representar um troco a ser dado, sendo assim podemos definir que dp[0] = 0, pois não se pode dar um troco válido quando o valor for 0.
Em seguida, quando o troco for 1, iteramos sobre o conjunto de moedas até encontrar uma possível moeda válida, ou seja uma moeda que seja menor ou igual ao meu troco atual (1). Ao encontrar, comparamos o menor valor entre:
"dp[i] e dp[trocoAtual - moedaAtual] +1;" 
Nessa fórmula, estamos usando o valor do troco anterior para nos auxiliar a calcular o próximo, uma vez que o mínimo de moedas necessário para o valor atual de troco é o mínimo entre o valor anterior e a adição da moeda atual.

