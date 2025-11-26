package aplication;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== test 1: Department findById ===");
		Department department = departmentDao.findById(3);
		
		System.out.println(department);
		
		System.out.println();
		System.out.println("=== test 2: seller findByDepartment ===");
		Seller seller = sellerDao.findById(1);
		
		System.out.println(departmentDao.findBySeller(seller));
		
		
		/*
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
		
		System.out.println("\n === test 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Murilo Martins");
		sellerDao.update(seller);
		System.out.println("\nUpdate completed");
		
		System.out.println("\n === test 6: seller delete ===");
		sellerDao.deleteById(7);
		System.out.println("Delete completed!");
		*/
	}

}
