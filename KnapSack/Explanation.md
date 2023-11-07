# KnapSack 0/1
**Abordagem recursiva (top-down):**
Neste problema, o subproblema se dá em adicionar ou não um item na mochila. Sendo assim, basicamente temos essas duas decisões a cada chamada recursiva da função: Pegar ou passar. Com isso, é evidente que vamos testar todas as combinações possíveis e no final retornaremos aquelas que dão o maior valor. Assim como na sequência de Fibonacci, para reduzir a complexidade em tempo linear, devemos memorizar os resultados de funções previamente calculadas e retornar em O(1). De certa forma, podemos abstrair esse problema como um grafo de dependência. Sendo assim, a fórmula de recorrência fica:

return Math.max(values[n - 1] + knapSack(n - 1), knapsack(n - 1)); // Máximo entre pegar ou passar os itens.


**Abordagem iterativa (bottom-up):**
Nessa abordagem, a lógica permanece a mesma, mas vamos resolver o problema de baixo para cima. O subproblema é o mesmo, adicionar ou não item a item na mochila. Para isso, criamos uma matriz de tamanho Dp[items + 1][weights + 1]. Cada linha da matriz representa um item, e cada coluna representa um peso que varia de 0 até n. Sendo assim, começamos a iterar sobre ela, nos perguntando se o item I cabe em uma mochila de peso I. Se couber, devemos comparar o seu resultado anterior e pegar o máximo. Para isso, deve-se levar em conta a célula logo acima da analisada que representa não pegar o item atual, que é dado pelo índice "dp[i - 1][j]," ou pegar o item atual: "values[i - 1] + dp[i - 1][j - weights[i - 1]]." Valor do item atual + valor do item anterior. Sendo assim, a relação de recorrência se dá por:

Math.max(values[i - 1][j], values[i - 1] + dp[i - 1][j - weights[i - 1]]);


# KnapSack 0/1
**Recursive Approach (top-down):**

In this problem, the subproblem involves deciding whether to add an item to the backpack or not. Essentially, we have these two decisions at each recursive call of the function: Take or skip. With this, it is evident that we will test all possible combinations and return those that yield the highest value. Similar to the Fibonacci sequence, to reduce time complexity, we should memorize the results of previously calculated functions and return them in O(1). In a way, we can abstract this problem as a dependency graph. Therefore, the recurrence formula is:

return Math.max(values[n - 1] + knapSack(n - 1), knapsack(n - 1)); // Maximum between taking or skipping items.

**Iterative Approach (bottom-up):**
In this approach, the logic remains the same, but we solve the problem from the bottom up. The subproblem is still the same: deciding whether to add an item to the backpack or not. To do this, we create a matrix of size Dp[items + 1][weights + 1]. Each row of the matrix represents an item, and each column represents a weight ranging from 0 to n. Therefore, we start iterating over it, asking ourselves if item I fits into a backpack of weight I. If it does, we should compare its previous result and take the maximum. For this, we must take into account the cell just above the one being analyzed, which represents not taking the current item, given by the index "dp[i - 1][j]," or taking the current item: "values[i - 1] + dp[i - 1][j - weights[i - 1]]." Current item value + previous item value. Thus, the recurrence relation is given by:

Math.max(values[i - 1][j], values[i - 1] + dp[i - 1][j - weights[i - 1]]);
