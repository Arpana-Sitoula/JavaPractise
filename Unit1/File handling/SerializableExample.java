import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializableExample{
    public static void main(String[] args) {
        Student std = new Student();
        std.StdAd = "Bhadrapur";
        std.StdId= 6;
        std.StdName = "Arpana Sitoula";

        try{
            FileOutputStream fos = new FileOutputStream("my_data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(std);
            oos.close();
            System.out.println("This object has been saved to my_data file successfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
