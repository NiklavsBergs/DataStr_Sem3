package datastr;

public class Patient implements Comparable<Patient>{
	
	private String name;
	private String surname;
	private int prio;
	
	public Patient() {
		setName("Unknown");
		setSurname("Unknown");
		setPrio(1);
		
	}
	
	public Patient(String name, String surname, int prio) {
		setName(name);
		setSurname(surname);
		setPrio(prio);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getPrio() {
		return prio;
	}

	public void setPrio(int prio) {
		this.prio = prio;
	}

	public String toString() {
		return "" + getName() + " " + getSurname() + ", " + prio + ", ";
	}
	
	public int compareTo(Patient o) {
		if(prio > o.prio) {
			return 1;
		}
		else if (prio < o.prio) {
			return -1;
		}
		else return 0;
	}
	
	
}