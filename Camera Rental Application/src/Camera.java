
public class Camera {

	int camid;
	String brand;
	String model;
	float  rentperday;
	String status;
	
	public int getCamid() {
		return camid;
	}
	public void setCamid(int camid) {
		this.camid = camid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getRentperday() {
		return rentperday;
	}
	public void setRentperday(float rentperday) {
		this.rentperday = rentperday;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Camera(int camid, String brand, String model, float rentperday, String status) {
		super();
		this.camid = camid;
		this.brand = brand;
		this.model = model;
		this.rentperday = rentperday;
		this.status = status;
	}
	
}