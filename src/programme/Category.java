package programme;

public class Category implements ProductCategory{
	
	private String mName;
	
	public Category(String name) {
		this.mName = name;
	}

	@Override
	public String getName() {
		return this.mName;
	}

	@Override
	public void setName(String name) {
		this.mName = name;
		
	}

}
