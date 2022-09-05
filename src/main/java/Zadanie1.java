public class Zadanie1 {
//         * Napisz ciało metody createPicture(int n), która dla dowolnego n > 0 stworzy gotowy do wypisania w konsoli wzór.
//            *
//            * Przykłady:
//            *
//            * Dla n = 1 w konsoli powinien pojawić się wzór:
//            * 1
//            *
//            * Dla n = 2 w konsoli powinien pojawić się wzór:
//            * 2 2 2
//            * 2 1 2
//            * 2 2 2
//            *
//            * Dla n = 3 w konsoli powinien pojawić się wzór:
//            * 3 3 3 3 3
//            * 3 2 2 2 3
//            * 3 2 1 2 3
//            * 3 2 2 2 3
//            * 3 3 3 3 3
//            *
//            * Dla n = 4 w konsoli powinien pojawić się wzór:
//            * 4 4 4 4 4 4 4
//            * 4 3 3 3 3 3 4
//            * 4 3 2 2 2 3 4
//            * 4 3 2 1 2 3 4
//            * 4 3 2 2 2 3 4
//            * 4 3 3 3 3 3 4
//            * 4 4 4 4 4 4 4  1 8 16 24
//            *
//            */
    public static String createPicture(int n) {
        int width = 2*n-1;

        int[][] tab2d = new int[width][width];
        for(int i=0; i<n; i++){
            for(int j = 0; j<width; j++){
                if(width/2+i >= 0 && width/2+i < width && width/2+i-j >= 0 && width/2+i-j < width) tab2d[width/2+i][width/2+i-j] = i+1;
                if(width/2-i >= 0 && width/2-i < width && width/2-i+j >= 0 && width/2-i+j < width) tab2d[width/2-i][width/2-i+j] = i+1;
                if(width/2+i-j >= 0 && width/2+i-j < width && width/2-i >= 0 && width/2-i < width) tab2d[width/2+i-j][width/2-i] = i+1;
                if(width/2-i+j >= 0 && width/2-i+j < width && width/2+i >= 0 && width/2+i < width) tab2d[width/2-i+j][width/2+i] = i+1;
            }
        }



        return stringifyTable(tab2d);
    }

    public static String stringifyTable(int[][] tab2d){
        String string = "";
        for(int i=0; i< tab2d.length; i++){
            for(int j=0; j<tab2d.length; j++){
                string+=tab2d[i][j];
            }
            string += "\n";
        }
        return string;
    }

    public static void main(String[] args) {
        System.out.println(createPicture(5));
    }
}
