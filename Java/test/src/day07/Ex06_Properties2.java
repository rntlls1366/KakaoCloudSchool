package day07;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Ex06_Properties2 {
    public static void main(String[] args)
            throws IOException
    {   Properties props = new Properties();
        props.load( new FileInputStream("test.properties") );
        System.out.println( "id : " + props.getProperty("id") );
        System.out.println( "pw: " + props.getProperty("pw") );
    }


}
