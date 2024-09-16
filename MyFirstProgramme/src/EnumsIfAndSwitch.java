enum RStatus {
    running, failed, success, pending;
}

class EnumsIfAndSwitch {
    public static void main(String[] args) {

        // Creating an enum variable and assigning it a value
        RStatus rs = RStatus.running;  // data type alias = datatype.constant

        // Using switch-case with enum
        switch (rs) {   // Corrected syntax for switch-case
            case running:
                System.out.println("Program is running.");
                break;

            case failed:
                System.out.println("Program has failed.");
                break;

            case success:
                System.out.println("Program ran successfully.");
                break;

            case pending:
                System.out.println("Program is pending execution.");
                break;
        }

        // Using if-else statements with enum
        if (rs == RStatus.running) {
            System.out.println("The program is currently running.");
        } else if (rs == RStatus.failed) {
            System.out.println("The program has failed.");
        } else if (rs == RStatus.success) {
            System.out.println("Everything is fine, success!");
        } else {
            System.out.println("Please wait, the program execution is pending.");
        }

        // Printing the enum value
        System.out.println("Current status: " + rs);
    }
}
