package Device;

public class accessModifiers{
    int marks =6;// cant access it out side the package as it s outside of package
    // to use for diffrent package we need to m ake public

    // if we are accessing in the same package we dont need to say public
    // methods should always be public not variables methods

    private int mark=6;
    // can be only used in same class
    // variables should be declared private

    int markss=6;
    // this is default can be accessed in the same package

    protected int markssss =6;
    // works in the same package only
    // does work with sub class
}