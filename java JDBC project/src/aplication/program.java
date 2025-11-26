package aplication;

import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== test 1: seller findById ===");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println();
		System.out.println("=== test 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== test 3: seller findAll ===");
		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n === test 4: seller insert ===");
		Seller newSeller = new Seller(null, "Jorge", "jorge@gmail.com", LocalDate.of(2022, 07, 20), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());
	}

}
