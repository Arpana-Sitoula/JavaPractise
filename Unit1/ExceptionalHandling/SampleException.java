class UserException extends Exception{
    int num1;
    UserException(int num1){
        this.num1 = num1;
    }
    public String toString(){
        return("Status code"+ num1);
    }
}
class SampleException{
    public static void main(String[] args) {
        try{
            throw new UserException(400);
        }
        catch(UserException e){
            System.out.println(e);
        }
    }
}
