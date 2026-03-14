package Practice.Combined;
class AE extends Exception{
    public AE(){

    }
}

public class ThrowCase1 {
    static AE e;// new AE() - Then output will be AE only.

    public static void main(String[] args) throws AE{
        throw e;
    }
}
