package assignment;

import java.util.UUID;

public class Random_String {
	public static void main(String[] args) {
		
		 System.out.println(generateString());
    }

    public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return "uuid = " + uuid;
		    

		
	}

}
