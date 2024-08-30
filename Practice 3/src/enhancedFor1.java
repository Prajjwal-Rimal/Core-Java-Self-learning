//2. Use an enhanced for loop to
// print the details of objects stored in an
// array of a `car` class.

class car{
    public String name;
    public int year;
    public String model;
    public String owner;
}

class enhancedFor1{
    public static void main(String[]args){
        car c1= new car();
        c1.name="tata";
        c1.year=2008;
        c1.model="Indica";
        c1.owner="SUJIT RIMAL";

        car c2= new car();
        c2.name="mahindra";
        c2.year=2016;
        c2.model="Scorpio";
        c2.owner="SUJIT RIMAL";

        car cDetails[]=new car[2];
        cDetails[0]=c1;
        cDetails[1]=c2;

        for (car c : cDetails) { // Enhanced for loop to iterate over the car array
            System.out.println("Name: " + c.name);
            System.out.println("Year: " + c.year);
            System.out.println("Model: " + c.model);
            System.out.println("Owner: " + c.owner);
            System.out.println(); // Blank line for readability
        }
    }
}