package ARP;

abstract class Vehicle {
	protected String model;

	public Vehicle(String model) {
		this.model = model;
	}

	abstract void display();
}
