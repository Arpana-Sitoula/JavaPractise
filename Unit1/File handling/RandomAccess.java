import java.io.RandomAccessFile;
import java.net.SocketPermission;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess{
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("myfile.dat", "rw");
        file.writeChar('s');
        file.writeChar('r');
        file.writeInt(22);
        file.seek(0);

        System.out.println(file.getFilePointer()+"\t"+ file.readChar());
        System.out.println(file.getFilePointer()+"\t"+ file.readChar());
        System.out.println(file.getFilePointer()+"\t"+ file.readInt());

        file.seek(4);
        System.out.println(file.readInt());

        file.writeBoolean(true);

        file.seek(9);
        System.out.println(file.getFilePointer()+"\t"+file.readBoolean());

        file.close();
    }
}

