//- Explain the difference between mutable and immutable strings in Java. Provide examples using `String` and
//`StringBuilder`.

class stringMuImu{
    public static void main(String[]args){
        // let's say we have a string a which has hello in it then we concatenate it with java, it may look like we
        // are mutating the sting but that's not the case as string just in its base form can not be mutated it is a
        // immutable object.
        String name ="prajjwal";
        name = name +"rimal";
        System.out.println(name);
        // in this case what happens is that the string is not mutated instead in jvm we havs something called as
        // the string constant pool which stores all the string so the address of name is first copied then the
        // string is copied then it is concatenated with rimal and stored it a new memory address


        // The only way to make a string a mutable object is by using stringBuffer or stringBuilder
        StringBuffer sb = new StringBuffer("prajjwal");
        sb.append(" rimal");
        System.out.println(sb);
        // so what spring buffer does it takes the length of the string and then adds a 16 character buffer zone used
        // for the manipulation of the string so when i add rimal it adds the characters to the buffer zone and
        // mutates the string
    }
}