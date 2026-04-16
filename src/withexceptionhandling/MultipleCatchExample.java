package withexceptionhandling;

public class MultipleCatchExample {
    public static void main(String[] args) {
        int a=10,b=10,res=0;
        try{
            res =a/b;
            System.out.println("res is : "+res);

            String msg1 = "hi hello";
            String msg2 = null;
            System.out.println("msg1 length is : "+msg1.length());
            System.out.println("msg2 length is : "+msg2.length());
        }
        catch (ArithmeticException e){
            System.out.println("Exception occurred : "+e.getMessage()+"---"+e.getClass());
        } catch (NullPointerException e){
            System.out.println("Exception occurred : "+e.getMessage()+"---"+e.getClass());
        }
        // generic catch
//        catch (Exception e){
//            System.out.println("Exception occurred : "+e.getMessage()+"---"+e.getClass());
//        }
    }
}
