public class ArraysForeach {
    public static void main(String[] args) {
        int [] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        int [] array2 = {1, 2, 4, 6, 7, 1, 3};
        int [] array3 = new int []{10, 20, 30, 40, 50, 60};

        for (int i =0; i < array2.length; i++){
            System.out.println(array2[i]);
        }

        for (int i : array3){
            System.out.println(i);
        }

        System.out.println("----------");

        int [] numeros = {1, 2, 3, 4};

        for(int i : numeros){
            System.out.println(i);
        }
    }
}
