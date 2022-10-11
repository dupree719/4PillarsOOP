package listnotes.linkedlist;


public class Notes2DArray {
    public static void main(String[] args) {

        int[][] numberTable = {
                //rows
                //Inside rows, goes columns
                //5 columns
                //6 rows
                //rows start at 0, columns start at 0
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
                {26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35},


        };
        //How to print data from position row 1, column 1
        System.out.println(numberTable[4][2] * numberTable[5][0]);


        int[][] uneven =
                //amount of columns do not have to be the same in each row
                //
                {
                        {1, 9, 4},
                        {0, 2},
                        {0, 1, 2, 3, 4},

                };
        System.out.println(uneven[1][1]);
        //.length prints out the # of items in a specific row (in this case, the first row which is 3)
        System.out.println(uneven[0].length);
        //.length prints out the # of ROWS in a 2D array
        System.out.println(uneven.length);

        for(int row = 0; row < uneven.length; row++){
            System.out.println("Outer loop at index/row " + row + " :");
            for(int column = 0; column < uneven[row].length; column++){
                System.out.println(uneven[row][column] + " ");

            }

        }


    }
}



