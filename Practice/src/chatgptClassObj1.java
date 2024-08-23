//- **Q20:** Create a class `Car` with properties like `make`, `model`, `year`, and
// a method `displayDetails()`. Instantiate the class and call the method
// to display the car's details.

class car{
    public String displaydetails(){
        String make="tata";
        String model ="indica";
        String year = "2002";
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
        // u cant use return make, model year so use this
        // return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}

class chatgptClassObj1{
    public static void main(String[]args){

        car car = new car();
        String cardetails= car.displaydetails();
        System.out.println(cardetails);
    }
}