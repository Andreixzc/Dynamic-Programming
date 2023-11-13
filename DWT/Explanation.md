# DWT
criar matriz[s1.len][s2.len]
Preencher ela com valores infinitos positivos.
Atribuir o valor matriz[0][0] = 0.
Comecar a percorrer a matriz partindo do indice 1.
Custo = abs(seq1[i] - seq2[j])
matriz[i][j] = custo  + min(matriz[i - 1][j], matriz [i][j-1] e [i - 1][j-1];

retornar matriz[seq1.len-1][seq2.len-1]