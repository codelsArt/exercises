package CarRender;

public class Car {
	private String brand;
	private String model;
	private String image;
	private int power;
	private int nrOfCylinders;
	
	public Car(String brand, String model, String image, int power, int nrOfCylinders ) {
		this.brand = brand;
		this.model = model;
		this.image = image;
		this.power = power;
		this.nrOfCylinders = nrOfCylinders;
	}

	private String getBrand() {
		return brand;
	}

	private void setBrand(String brand) {
		this.brand = brand;
	}

	private String getModel() {
		return model;
	}

	private void setModel(String model) {
		this.model = model;
	}

	private String getImage() {
		return image;
	}

	private void setImage(String image) {
		this.image = image;
	}

	private int getPower() {
		return power;
	}

	private void setPower(int power) {
		this.power = power;
	}

	private int getNrOfCylinders() {
		return nrOfCylinders;
	}

	private void setNrOfCylinders(int nrOfCylinders) {
		this.nrOfCylinders = nrOfCylinders;
	}
}
