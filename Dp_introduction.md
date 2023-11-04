# Dynamic Programming (DP)

**Dynamic Programming** is a widely used technique for solving optimization problems. It is essential because it allows us to always reach the optimal solution to a problem in linear time. To achieve this, we maintain a data structure to store the previously computed results of subproblems.

Initially, this may seem abstract, but the core idea of this technique can be abstracted by thinking of DP as nothing more than "optimized recursion." For every DP problem, we can formulate a recurrence function by identifying the subproblems, "states," and their respective "transitions."

There are basically two ways to solve DP problems:

1. **Memoization:** The idea behind memoization is to create a data structure that stores the previously computed results of a problem and its subproblems. By saving the results, we avoid redundant calculations and achieve linear time complexity in our solutions. A classic example of this is the recursive calculation of Fibonacci numbers. When we do not store previous results, we observe that we have to traverse the entire tree down to the leaf node to obtain results that have already been calculated. Memoization is generally easier to understand and is implemented using recursion. This approach is also known as "Top-down" because we start from the "solved" problem and solve it by descending the recursion.
    
2. **Tabulation:** In tabulation, we store results typically in arrays or matrices. This approach often results in more efficient code, but it can be more challenging to identify the subproblems, states, and transitions because it is less intuitive. Tabulation is implemented iteratively and is known as the "Bottom-up" approach to the problem.
    

The choice between memoization and tabulation depends on the problem and the programmer's preferences, but both are powerful tools for dealing with optimization problems and efficiently solving them.