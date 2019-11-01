package exer81replit;


public abstract class Animal implements Comparable<Animal>{

	private String id;
	
	public Animal (String id) {
	  this.id = id;
	}
	
	
	public abstract String getFamilia();


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	
	public int compareTo(Animal obj) {
		return getFamilia().compareTo(obj.getFamilia());
	}


	@Override
	public String toString() {
		return "Animal [id=" + id + "]";
	}
	
	

}
