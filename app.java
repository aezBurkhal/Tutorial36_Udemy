import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class app {

	public static void main(String[] args) {
		Test test = new Test();
		/*
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Could't parse command file.");
		}*/
		
		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		
		try {
			test.run();
			//enables to use parent class to catch exceptions
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			test.input();
		} catch (FileNotFoundException e) {
			//child exception must be handled before parent otherwise the parent would catch exception due to polymorphism
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			test.input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
