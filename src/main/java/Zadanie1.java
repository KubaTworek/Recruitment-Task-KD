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
//            * 4 4 4 4 4 4 4
//            *
//            */
    public static String createPicture(int n) {
        int width = 2*n-1;

        int[][] tab2d = new int[width][width];
        for(int i=0; i<width; i++){
            for(int j=0; j<width; j++){
                if(i < width/2){
                    if(i==0 || i==width-1){
                        tab2d[i][j] = n;
                    }else
                    if(j==0 || j==width-1){
                        tab2d[i][j] = n;
                    }else
                    if(i==1 || i==width-2){
                        tab2d[i][j] = n-i;
                    }else
                    if(j==1 || j==width-2){///
                        tab2d[i][j] = n-1;
                    }else
                    if(i==2 || i==width-3){
                        tab2d[i][j] = n-i;
                    } else
                    if(j==2 || j==width-3){
                        tab2d[i][j] = n-j;
                    }else
                    if(i==3 || i==width-4){
                        tab2d[i][j] = n-i;
                    } else
                    if(j==3 || j==width-4){
                        tab2d[i][j] = n-j;
                    } else
                    if(i==4 || i==width-5){
                        tab2d[i][j] = n-i;
                    } else
                    if(j==4 || j==width-5){
                        tab2d[i][j] = n-j;
                    } else
                    if(i==5 || i==width-6){
                        tab2d[i][j] = n-i;
                    } else
                    if(j==5 || j==width-6){
                        tab2d[i][j] = n-j;
                    }
                } else {
                    if(i==0 || i==width-1){
                        tab2d[i][j] = n;
                    }else
                    if(j==0 || j==width-1){
                        tab2d[i][j] = n;
                    }else
                    if(i==1 || i==width-2){
                        tab2d[i][j] = 3;
                    }else
                    if(j==1 || j==width-2){
                        tab2d[i][j] = 3;
                    }else
                    if(i==2 || i==width-3){
                        tab2d[i][j] = 2;
                    } else
                    if(j==2 || j==width-3){
                        tab2d[i][j] = 2;
                    }else
                    if(i==3 || i==width-4){
                        tab2d[i][j] = 1;
                    } else
                    if(j==3 || j==width-4){
                        tab2d[i][j] = 1;
                    } else
                    if(i==4 || i==width-5){
                        tab2d[i][j] = 0;
                    } else
                    if(j==4 || j==width-5){
                        tab2d[i][j] = 0;
                    } else
                    if(i==5 || i==width-6){
                        tab2d[i][j] = 0;
                    } else
                    if(j==5 || j==width-6){
                        tab2d[i][j] = 0;
                    }
                }

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
        System.out.println(createPicture(4));
    }
}
