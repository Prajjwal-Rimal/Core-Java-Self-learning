class Computer{
    int cost;

    public void playmusic(){
        System.out.println("music playing");
    }

    public String getMeAPen(int cost){
        if(cost>=10)
            return "pen";
        else
            return"nothing";
    }
}

class methods{
    public static void main(String[]args){

        Computer obj = new Computer();
        obj.playmusic();
        String str = obj.getMeAPen(3);
        System.out.println(str);
    }
}