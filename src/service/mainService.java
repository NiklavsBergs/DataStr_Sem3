package service;

import datastr.MyHeap;
import datastr.Patient;

public class mainService {

	public static void main(String[] args) {
		try {
		MyHeap intHeap = new MyHeap<>();
		intHeap.add(3);
		intHeap.add(7);
		intHeap.add(10);
		intHeap.add(11);
		System.out.println("------------------");
		intHeap.print();
		System.out.println("------------------");
		intHeap.printByPrefix();
		
		MyHeap<Patient> hospital = new MyHeap<>();
		
		hospital.add(new Patient("Janis", "Berzins", 1));
		hospital.add(new Patient("Janka", "Berzins", 6));
		hospital.add(new Patient("Viktors", "Berzins", 3));
		hospital.add(new Patient("Alfreds", "Berzins", 10));
		
		System.out.println(hospital.remove());
		System.out.println(hospital.remove());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
