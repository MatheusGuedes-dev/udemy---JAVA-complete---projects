package aplication;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		Department obj = new Department (1, "books");
		Seller seller = new Seller(21, "matheus", "essemesmo@gmail.com", LocalDate.of(2004, 02, 13), 1800.0, obj);
		
		System.out.println(seller);
		
		

	}

}
