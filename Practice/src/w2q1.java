/*Write a Java program that prints a table with a list of at least 5 students together with their grades earned (lab
points, bonus points, and the total) in the format below.

///////////////////\\\\\\\\\\\\\\\\\\\
        ==          Student Points          ==
        \\\\\\\\\\\\\\\\\\\///////////////////


Name            Lab     Bonus   Total
----            ---     -----   -----
Joe             43      7       50
William         50      8       58
Mary Sue        39      10      49

The rrequirements for the program are as follows:

1.Print the border on the top as illustrated (using the slash and backslash characters).
2.Use tab characters to get your columns aligned and you must use the + operator both
for addition and string concatenation.
3.Make up your own student names and points—the ones shown are just for illustration purposes.
You need 5 names.
 */

class w2q1{
    public static void main(String args[])
    {
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");// slash and backslash character
        // add escape sequence and a backslash \\
        System.out.println("=          STUDENT POINTS           =");
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println();
        System.out.println();
        System.out.println("name"+"    "+"lab"+"     "+"bonus"+"    "+"total");
        System.out.println("----"+"    "+"---"+"     "+"-----"+"    "+"-----");
        System.out.println("JOEY"+"    "+" 50"+"     "+"   10"+"    "+ (50+10));
        System.out.println("ANNA"+"    "+" 40"+"     "+"   15"+"    "+ (40+15));
        System.out.println("DREW"+"    "+" 60"+"     "+"    5"+"    "+ (60+5));
    }
}