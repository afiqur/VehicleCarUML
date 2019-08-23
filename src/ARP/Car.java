package ARP;

public class Car extends Vehicle implements Service, Display {

	private double price;

	public Car(String model, double price) {
		super(model);
		this.price = price;
	}

	public void display() {
		System.out.println("Car Model: " + model + " and Price: " + price);
	}

	public void start() {
		System.out.println("Car Started...");
	}

	public void stop() {
		System.out.println("Car Stopped...");
	}

	public void refuel() {
		System.out.println("Car Refuled...");
	};

	public void on() {
		System.out.println("Display On...");
	}

	public void off() {
		System.out.println("Display Off...");
	}

	public static void main(String[] args) {
		Car c = new Car("BMW", 10000000.00);
		c.display();
		c.start();
		c.stop();
		c.refuel();
		c.off();
		c.off();
	}

}
