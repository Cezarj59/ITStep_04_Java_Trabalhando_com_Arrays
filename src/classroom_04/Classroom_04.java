package classroom_04;

public class Classroom_04 {

    public static void main(String[] args) {
        //Trabalhando com Arrays

        int[][] array = {
            {7, 9, 4, 2},
            {5, 8, 2, 1},
            {3, 6, 9, 5},
            {7, 8, 1, 3}
        };
        
         //Imprima os valores da diagonal principla e da diagonal secundária

        System.out.println("Diagonal Principal");
        for (int i = 0; i < 4; i++) {
            System.out.print(array[i][i] + " ");
        }

        System.out.println("\nDiagonal Secundaria");
        int i = 0;
        int j = 3;
        for (; i < 4; i++, j--) {
            System.out.print(array[i][j] + " ");
        }

        int[][] array2 = {
            {0, 4, 7, 9, 5},
            {7, 9, 4, 2, 0},
            {5, 8, 2, 1, 3},
            {3, 6, 9, 5, 1},
            {7, 8, 1, 3, 3}
        };

         //imprimir pirâmide:
        /*
                 7
                4,2
               8,2,1
              3,6,9,5
             7,8,0,1,3
         */
        
        System.out.println("\nPirâmide");

        for (int x = 0; x < array2.length; x++) {
            switch (x){
                case 0:
                    System.out.println(array2[x][2]);
                    break;
                case 1:
                    System.out.println(array2[x][2] +" "+ array2[x][3]);
                    break;
                case 2:
                    System.out.println(array2[x][1] +" "+ array2[x][2]+" "+ array2[x][3]);
                    break;
                case 3:
                    System.out.println(array2[x][0] +" "+ array2[x][1]+" "+ array2[x][2]+" "+ array2[x][3]);
                    break;
                case 4:
                    System.out.println(array2[x][0] +" "+ array2[x][1]+" "+ array2[x][2]+" "+ array2[x][3]+" "+ array2[x][4]);
                    break;

            }
        }

    }

}
