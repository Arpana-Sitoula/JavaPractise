package Unit1;
class MyCustomException extends Exception{
    public String toString(){
return "hellooo";
    }
}

class TestCustomException {
    public static void main(String[] args) {
        try{
            throw new MyCustomException();
        }
        catch(MyCustomException ex){
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
        System.out.println("rest of the code");
    }
    
}

