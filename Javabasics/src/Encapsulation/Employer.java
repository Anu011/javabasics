package Encapsulation;

public class Employer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEmpcode(501);
		System.out.println(emp.getEmpcode());
		emp.setEmpname("ashwini");
		System.out.println(emp.getEmpname());
		emp.setEmpdesignation("Developer");
		System.out.println(emp.getEmpdesignation());
		
		emp.setEmpcode(502);
		emp.setEmpname("Anu");
		emp.setEmpdesignation("tester");
		System.out.println(emp.getEmpcode());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpdesignation());
		

		
	}

}
