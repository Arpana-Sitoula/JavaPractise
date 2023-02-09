package Unit5.WorkingWithURLs;

import java.net.URL;

public class URLdemo {
    public static void main(String[] args) {
        try{
            URL url= new URL("https://github.com/search?q=user%3AArpana-Sitoula+java");
            System.out.println("Protocol: "+ url.getProtocol());
            System.out.println("Host Name: "+ url.getHost());
            System.out.println("Port Number: "+ url.getPort());
            System.out.println("Path: "+ url.getPath());
            System.out.println("Query: "+ url.getQuery());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
