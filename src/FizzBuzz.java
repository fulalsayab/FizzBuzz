/*program that outputs numbers from 1 to 100… with a catch:

        For multiples of 3, print Fizz instead of the number.
        For the multiples of 5, print Buzz.
        For numbers which are multiples of both 3 and 5, print FizzBuzz.

        Created by Ful Al Sayab 12/7/2019
*/
public class FizzBuzz {
    public static void main ( String[] args ) {

        //using for loop to output all the numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if ( i % 3 == 0 && i % 5 == 0 ) {
                System.out.println ( "FizzBuzz" );
            }
            if ( i % 3 == 0 ) {
                System.out.println ( "Fizz" );

            } else if ( i % 5 == 0 ) {
                System.out.println ( "Buzz" );
            } else {
                System.out.println ( i );
            }
        }

    }

}

