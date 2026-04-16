package withexceptionhandling;

public class ThrowExample {
    public static void main(String[] args) {
        try{
            int a=20;
            if(a!=20){
                System.out.println("a is : "+a);
            } else {
                throw new RuntimeException("a is 20 hence throwing an exception manually");
            }
        } catch (Exception e){
            System.out.println("Exception occurred : "+e.getMessage()+"---"+e.getClass());
        }
    }
}
