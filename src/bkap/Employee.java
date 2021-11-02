package bkap;

import java.util.Scanner;

public class Employee {
	private String employeeld;
	private String employeeName;
	private int age;
	private float rate;
	private float salary;
	private boolean employeeStaus;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeld, String employeeName, int age, float rate, float salary, boolean employeeStaus) {
		super();
		this.employeeld = employeeld;
		this.employeeName = employeeName;
		this.age = age;
		this.rate = rate;
		this.salary = salary;
		this.employeeStaus = employeeStaus;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public boolean isEmployeeStaus() {
		return employeeStaus;
	}

	public void setEmployeeStaus(boolean employeeStaus) {
		this.employeeStaus = employeeStaus;
	}

	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma nhan vien: ");
		this.employeeld = sc.nextLine();
		System.out.println("Nhap vao ten nhan vien: ");
		this.employeeName = sc.nextLine();
		System.out.println("Nhap vao tuoi nhan vien: ");
		this.age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap he so luong: ");
		this.rate = Float.parseFloat(sc.nextLine());
		System.out.println("nhap vao trang thai nhan vien: ");
		this.employeeStaus = Boolean.parseBoolean(sc.nextLine());
	}

	public void displayData() {
		System.out.printf("Ma NV: %s - Ten NV: %s\n", this.employeeld, this.employeeName);
		System.out.printf("Tuoi NV: %d - Trang thai NV: %b - He so luong: %f - Salary NV: %f", this.age,
				this.employeeStaus, this.rate, this.salary);
	}

	// Phuong thuc nay tra ra luong nhan vien lam gi, em lay du lieu luong nhan vien
	// tra ra lam gi?
	public void calSalary() {
		this.salary = getRate() * 1300000;

	}

}
