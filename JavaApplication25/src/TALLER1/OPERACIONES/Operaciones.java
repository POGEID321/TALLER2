package TALLER1.OPERACIONES;

public class Operaciones {
    
   public int [][] sumaMatriz (int [][] matrizA, int [][] matrizB,int filas,int columnas)
    {
        int [][]resultado = new int[filas][columnas];
        for(int i=0;i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    } 
       
   public int [][] RestaMatriz (int [][] matrizA, int [][] matrizB,int filas,int columnas)
    {
        int [][]resultado = new int[filas][columnas];
        for(int i=0;i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        return resultado;
    }
     public int [][] MultiplicacionMatriz (int [][] matrizA, int [][] matrizB,int filas,int columnas)
    {
        int [][]resultado = new int[filas][columnas];
        for(int i=0;i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                resultado[i][j] = matrizA[i][j] * matrizB[i][j];
            }
        }
        return resultado;
    } 
}
