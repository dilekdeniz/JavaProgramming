package Day32_Constructors;

public class Car {
    public String brand,model;
    public int year;
    public double price;
    public String colour;

     public Car(String brand) {
         this.brand = brand;
     }
     public Car(String brand, String model) {
         this(brand);
         this.model = model;
     }
     public Car(String brand,String model,int year) {
         this(brand, model);
         this.year = year;
     }
     public Car(String brand,String model,int year, double price) {
         this(brand, model, year);
         this.price = price;
     }

    public Car(String brand, String model, int year, double price, String colour) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.colour = colour;

    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}


/*
class name: Car
		 instance variables:
		 		make, model, year, price, color
 		1st constructor: initializes the make ONLY
 		2nd constructor: initializes make & model
 				(MUST use constructor call to set the make)
		3rd constructor: initializes make, model, year
				(MUST use constructor call to set the make, model)
		4th constructor: initializes make, model, year, price
				(MUST use constructor call to set the make, model, year)
		5th Constructor: intializes all the instances
				(MUST use constructor call to set the make, mode, year, price, color)
		instance methods: toString
 */