public class Multidimencionais {
    public static void main(String[] args) {
//        meses 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
//        dias 1, 2, 3... [...]28, 29, 30, 31

        int [][] mesesedias = new int[3][3];

        mesesedias [0][0] = 1;
        mesesedias [0][1] = 2;
        mesesedias [0][2] = 3;
        mesesedias [1][0] = 4;
        mesesedias [1][1] = 5;
        mesesedias [1][2] = 6;
        mesesedias [2][0] = 7;
        mesesedias [2][1] = 8;
        mesesedias [2][2] = 9;

        for (int i = 0; i < mesesedias.length; i++){
            for (int j = 0; j < mesesedias[i].length; j++){
                System.out.println(mesesedias[i][j]);
            }
        }

        System.out.println("-----------------");
//        Arrays Multidimencionais Foreach


        for (int[] array : mesesedias){
            for(int i : array){
                System.out.println(i);
            }
        }

    }
}
