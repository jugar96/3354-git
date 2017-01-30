package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Not enough integers were passed");
        }
    }

    private static int addArguments(String[] args) {
    	if(args.length > 1){
    		int sum = 0;
    		for(int count = 0; count < args.length; count++)
    			sum += Integer.valueOf(args[count]);
    		return sum;
    	}
    	else
    		return Integer.valueOf(args[-1]);
    	}
}
