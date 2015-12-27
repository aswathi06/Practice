package wordcount;

public class Word {

	private String name;
	private int occurance;
	public Word(String name, int occurance) {
		super();
		this.name = name;
		this.occurance = occurance;
	}
	public Word() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOccurance() {
		return occurance;
	}
	public void setOccurance(int occurance) {
		this.occurance = occurance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + occurance;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (occurance != other.occurance)
			return false;
		return true;
	}
	
	
	
}
