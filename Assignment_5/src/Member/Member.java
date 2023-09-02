package Member;

class Member {
	 String name;
	 int age;
	 int phone_no;
	 String address;
	 double salary;

	   void printSalary(){
	      System.out.println("Salary: "+salary);
	   }

	}

	class Employee extends Member{
	   String specialization;

	   Employee(String name, int age, int phone_no, String address, double salary, String  specialization){
	      this.name = name;
	      this.age = age;
	      this.phone_no = phone_no;
	      this.address = address;
	      this.salary = salary;
	      this.specialization = specialization;
	   }
	}

	class Manager extends Member{
	   String department;

	   Manager(String name, int age, int phone_no, String address, double salary, String department) {
	      this.name = name;
	      this.age = age;
	      this.phone_no = phone_no;
	      this.address = address;
	      this.salary = salary;
	      this.department = department;
	   }
	}