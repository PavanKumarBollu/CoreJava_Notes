package Basic;
public class ArrayPractice {
    public static void main(String[] args) {
        //one dimentional array
        int[] arr = new int[5];

        arr[0] = 12;
        arr[1] = 56;
        arr[2] = 13;
        arr[3] = 88;
        arr[4] = 67;

        for(int i = 0; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }

        //two dimentional array
        int[][] twoDimentionalArray = new int [3][3];
        for(int i = 0; i < twoDimentionalArray.length ; i++)
        {
            // System.out.println(twoDimentionalArray[i][i]);
        }

        //two dimentional jagged array jagged means all the coulmns are not equal in thier size 

        int[][] twoDimentionalJaggedArray = new int [3][];

        twoDimentionalJaggedArray[0] = new int[2];
        twoDimentionalJaggedArray[1] = new int[3];
        twoDimentionalJaggedArray[2] = new int[4];


        for(int i = 0; i <= twoDimentionalJaggedArray.length ; i++)
        {
            System.out.println(twoDimentionalJaggedArray[i][i]);
        }

        


    }//main method end

}//class end
