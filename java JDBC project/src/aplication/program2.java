package aplication;

import java.util.List;

import db.DbException;
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
		System.out.println("=== test 2: Department findBySeller ===");
		Seller seller = sellerDao.findById(1);
		
		System.out.println(departmentDao.findBySeller(seller));
		
		
		
		System.out.println();
		System.out.println("=== test 3: Department findAll ===");
		List<Department> list = departmentDao.findAll();

		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n === test 4: Department insert ===");
		Department newDepartment = new Department(null, "Games");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new id = " + newDepartment.getId());
		
		
		System.out.println("\n === test 5: Department update ===");
		Department dep = departmentDao.findById(5);
		dep.setName("literature");
		departmentDao.update(dep);
		System.out.println("\nUpdate completed");
		
		System.out.println("\n === test 6: Department delete ===");
		departmentDao.deleteById(7);
		System.out.println("Delete completed!");
		
		try {
			departmentDao.deleteById(2);
			System.out.println("wrong deletion");
		}
		catch(DbException dbe) {
			System.out.println(dbe.getMessage());
		}
		
	}

}
