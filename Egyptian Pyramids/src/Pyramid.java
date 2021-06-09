
public class Pyramid {
	private String pharoah;
	private String modern_name;
	private String site;
	private double height;
	
	public Pyramid(String pharoah, String modern_name, String site, double height) {
		this.pharoah = pharoah;
		this.modern_name = modern_name;
		this.site = site;
		this.height = height;
	}
	
	
	public String getPharoah() {
		return pharoah;
	}


	public void setPharoah(String pharoah) {
		this.pharoah = pharoah;
	}


	public String getModern_name() {
		return modern_name;
	}


	public void setModern_name(String modern_name) {
		this.modern_name = modern_name;
	}


	public String getSite() {
		return site;
	}


	public void setSite(String site) {
		this.site = site;
	}


	public void setHeight(double height) {
		this.height= height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	@Override
	public String toString() {
		return "Pyramid [pharoah=" + pharoah + ", modern_name=" + modern_name + ", site=" + site + ", height=" + height
				+ "]";
	}
}
