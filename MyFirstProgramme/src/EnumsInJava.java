enum Status{ // it is like a class
    Running, Failed,Pending, Success;  // all of these are the objects of status
}

class EnumsInJava{
    public static void main(String[]args){

        int i=5;
        Status s = Status.Running;
        System.out.println(s);

        Status st = Status.Success;
        System.out.println(st.ordinal());

        Status sta[] = Status.values();

        for (int j=0; j<sta.length;j++){
            System.out.println(sta[j]);
        }

        for (Status k:sta){
            System.out.println(k);
        }
    }
}