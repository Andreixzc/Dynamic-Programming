package DWT;

public class DwtDp {
    public static void main(String[] args) {
        int[] sequence1 = {1, 2, 3, 4, 5};
        int[] sequence2 = {1, 2, 3, 4, 6}; // Sequência ligeiramente diferente
        double dtwDistance = calculateDTW(sequence1, sequence2);

        System.out.println("Distância DTW: " + dtwDistance);
    }

    public static double calculateDTW(int[] sequence1, int[] sequence2) {
        int len1 = sequence1.length;
        int len2 = sequence2.length;

        double[][] dtwMatrix = new double[len1][len2];

        // Preencha a matriz de DTW com valores iniciais
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                dtwMatrix[i][j] = Double.POSITIVE_INFINITY;
            }
        }

        dtwMatrix[0][0] = 0;

        // Preencha o restante da matriz
        for (int i = 1; i < len1; i++) {
            for (int j = 1; j < len2; j++) {
                double cost = Math.abs(sequence1[i] - sequence2[j]);
                dtwMatrix[i][j] = cost + Math.min(dtwMatrix[i - 1][j],Math.min(dtwMatrix[i][j - 1], dtwMatrix[i - 1][j - 1]));
            }
        }

        return dtwMatrix[len1 - 1][len2 - 1];
    }
}
