class ForLoop{
    public static void main(String[]args){
//
//        int i=1;          INITIALIZATION
//        while(i<=4)       CONDITION
//        {
//            System.out.println("HI " + i);
//            i++;          INCREMENT
//        }

        for (int i=1;i<=5;i++){
            System.out.println("Day "+i);

            for (int j=1;j<=9;j++)
            {
                System.out.println((j+8)+" - "+(j+9));
            }
        }
    }
}