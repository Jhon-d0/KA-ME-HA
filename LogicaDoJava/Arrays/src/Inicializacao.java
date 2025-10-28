public class Inicializacao {
    public static void main(String[] args) {
        int [][] array1 = {{1, 2}, {3, 4}, {5, 6}};
        int [][] array2 = new int[3][4];



        for ( int[] i : array1){
            for(int j : i){
                System.out.println(j);
            }
        }
    }
}
