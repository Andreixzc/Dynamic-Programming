# LCS: 
**Top-down**:
Na abordagem recursiva, começamos fazemos uma matriz de memoização que vai salvar os retornos dos inputs das funções.
Ela tem a dimensão de s1.len + 1, por s2.len+1.
Ao chamarmos a função pela primeira vez, passamos dois ponteiros I e J  inicializados na ultima posição de ambas as strings, dessa forma começamos a dfs.
Se as strings forem diferentes, retornamos duas chamas recursivas: Uma decrementando I, e a outra decrementando J. E com isso pegamos o máximo que retornar entre elas. Caso as letras dos indices forem iguais, chamamos outra instancia da funcao porém, decrementando I e J e somando 1.
Isso, claro passando o vetor nos indices[i][j] para armazenar os valores retornados para que possamos verificar o indice atual para ver se o mesmo ja foi calculado.

**Bottom-uP**
Segue a mesma lógica, primeiramente inicializamos uma matriz s1.len + 1, s2.len +1;
Caso i ou j forem 0, dp[i][j]  = 0 Pois isso representa que estamos comparando um caracter vazio.
Apóis isso, seguimos comparando letra por letra, porém abstraimos a comparação pelos indices da matriz, onde a linha representa uma string, e a coluna outra.
Ao começarmos a iterar sobre a matriz, caso os caracteres forem diferentes, pegamos o máximo previamente calculado entre as duas letras, que se da pelos indices dp[i-1][j] e dp[i][j-1];
A unica diferenca de quando elas forem iguais, é que vamos pegar o máximo somando 1.
Entenda que ao verificar "dp[i-1][j] e dp[i][j-1];" estamos verificando se houveram letras iguais previamente calculadas de ambas as strings.