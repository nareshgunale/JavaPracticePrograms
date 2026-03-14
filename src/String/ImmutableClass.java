package String;

final class ImmutableClass {
    private int i;
    ImmutableClass(int i){
        this.i=i;

    }
    public ImmutableClass Modify(int i){
        if(this.i==i){
            return this;

        }
        else{
            return new ImmutableClass(i);
        }


    }

    public static void main(String[] args) {
        ImmutableClass obj = new ImmutableClass(10);
        ImmutableClass obj2 = obj.Modify(100);
        ImmutableClass obj3 = obj.Modify(10);

        System.out.println(obj ==  obj2);
        System.out.println(obj==obj3);
    }
}
