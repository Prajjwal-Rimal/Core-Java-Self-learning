//Write a Java program that sums all even
// numbers from 1 to 100 using a `do-while` loop.

class chatgptFOR3{
    public static void main(String[]args){
        int i=1;
        int sum =0;
        do {
            if(i%2==0){
                sum = sum+i;
            }
            i++;
        }while(i<=100);

        System.out.println(sum);
    }
}
