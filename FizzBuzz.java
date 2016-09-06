package test;

public class FizzBuzz {
	public static String print() {
        StringBuilder res = new StringBuilder();
        for( int i=1; i<=100; i++ ){
            if( i%3 == 0 )  res.append("Fizz");
            if( i%5 == 0 ) {
                res.append("Buzz");
                continue;
            }
            res.append(i);
        }
        return res.toString();
    }
}
