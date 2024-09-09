class Employee {
    int salary;
    int id;

    public static int calculateHighestSalary(Employee[] salaryArray) {
        int highestSalaried = 0;

        for (Employee emp : salaryArray) {
            if (emp.salary > highestSalaried) {
                highestSalaried = emp.salary;
            }
        }
        return highestSalaried;
    }
}

class arrayObject2 {
    public static void main(String[] args) {
        // Create employee objects and set their salaries and IDs
        Employee e1 = new Employee();
        e1.salary = 10000000;
        e1.id = 1;

        Employee e2 = new Employee();
        e2.salary = 60000000;
        e2.id = 2;

        Employee e3 = new Employee();
        e3.salary = 10000;
        e3.id = 3;

        // Create an array of Employee objects and populate it
        Employee[] salaryArray = new Employee[3];
        salaryArray[0] = e1;
        salaryArray[1] = e2;
        salaryArray[2] = e3;

        // Call the method to calculate the highest salary
        int highestSalary = Employee.calculateHighestSalary(salaryArray);
        System.out.println("Highest Salary: " + highestSalary);
    }
}
