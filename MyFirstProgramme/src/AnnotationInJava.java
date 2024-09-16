class h
{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("IN h SHOW");
    }
}

class g extends h
{
    @Override// checks if the method is overidden or not
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("IN g SHOW");
    }
}


class AnnotationInJava{
    public static void main(String[]args){
        g obj = new g();
        obj.showTheDataWhichBelongsToThisClass();
    }
}