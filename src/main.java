import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		 
		Random rand = new Random();
		ArrayList<ArrayList<ArrayList<Integer>>> array = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
		    array.add( new ArrayList<ArrayList<Integer>>());
		    
		    for (int j = 0; j<100; j++) {
		        array.get(i).add(new ArrayList<Integer>());
		       
		        for(int k =0;k<100;k++) {
		        	int rand_int1 = rand.nextInt(100);
		        	array.get(i).get(j).add(rand_int1);
		        }
		    }
		    
		}
		 try (OutputStream fos = new FileOutputStream("array.dat");
		         ObjectOutputStream out = new ObjectOutputStream(fos)) {
		 
		        out.writeObject(array);
		       
		    } catch (IOException e) {
		        System.out.println("Chyba pøi zápisu souboru : "+e);
		    }
	
	try (InputStream fis = new FileInputStream("array.dat");
	         ObjectInputStream in = new ObjectInputStream(fis)) {
	 
	       
	        
	 
	    } catch (IOException e) {
	       System.out.println("Chyba pøi ètení souboru : "+e);
	    }
		
	

}}
