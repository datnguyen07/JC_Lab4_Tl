package run;

import java.util.Scanner;

import bkap.Employee;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		Employee a[], temp;
		do
		{
			System.out.print(" Nhap so nhan vien: ");
			n = Integer.parseInt(sc.nextLine());
		} while(n<=0);
		a = new Employee[n];
		temp = new Employee();
		do {
			System.out.println("*****************************MENU*************************");
			System.out.println("1. Nhập thông tin cho n nhân viên");
			System.out.println("2. Tính lương tất cả nhân viên");
			System.out.println("3. Hiển thị thông tin tất cả nhân viên");
			System.out.println("4. Sắp xếp nhân viên theo lương tăng dần");
			System.out.println("5. Tìm kiếm nhân viên theo tên nhân viên");
			System.out.println("6. Cập nhật trạng thái nhân viên theo mã nhân viên");
			System.out.println("7. Thoát");
			System.out.println("Vui long chon 1 so: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1: 
				for(i=0; i<n; i++) {
					System.out.printf("Nhap thong tin nhan vien thu: %d\n", i+1);
					a[i] = new Employee();
					a[i].inputData();
				}
				break;
			case 2:
				//O day em tinh luong nhan vien dung ko
				for(i=0; i<n; i++) {
					//Sao lai khoi tao lai phan tu [i]. Dang tinh luon cho nhan vien i ma khoi tao lai vay nhan vien i lam gi co 
					//du lieu				
					a[i].calSalary();
					//Em chay lai di
				}
				break;
			case 3: 
				for(i=0; i<n; i++) {
					System.out.printf("Thong tin nhan vien thu: %d\n", i+1);
					a[i].displayData();
				}
				break;
			case 4:
				for(i=0; i<n-1; i++) {
					for(int j=i+1; j<n; j++) {
						if(a[i].getSalary()>a[j].getSalary()) {
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
				}
				break;
			case 5:
				//O day so sanh la ten nhan vien voi ten nhan vien can tim kiem
				System.out.println("nhap ten nhan vien muon tim: ");
				String search = sc.nextLine();
				for(i=0; i<n; i++) {
					//a[i] cua em kieu du lieu la gi? EM so sanh duoc kieu nhan vien voi kieu chuoi ko?
					//Duoc roi day em
					// em cam on thay a. em hieu van de rooi a
					if(a[i].getEmployeeName().equals(search)) {
						System.out.println("Thong tin nhan vien do la: ");
						a[i].displayData();
					}
				}
				break;
			case 6:
				System.out.println("nhap ld nhan vien muon cap nhat trang thai: ");
				String ldCn = sc.nextLine();
				for(i=0; i<n; i++) {
					if(a[i].getEmployeeld().equals(ldCn)) {
						System.out.println("Nhap lai trang thai NV: ");
						a[i].setEmployeeStaus(sc.hasNextLine());
					}
				}
				break;
			}
		} while(true);

//
	}

}
