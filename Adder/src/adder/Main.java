package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } 
        catch (IndexOutOfBoundsException a) {
        	System.err.println("Not enough arguments were passed");
        }
        catch (Exception e) {
            System.err.println("Invalid characters were passed");
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
