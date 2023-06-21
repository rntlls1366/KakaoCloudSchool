package day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Ex05_Properties {
    public static void main(String[] args)
            throws IOException
    {
        Properties props = new Properties();
        props.put("id", "lee");
        props.put("pw", "1234");
        props.store( new FileOutputStream("test.properties"), "My Comment");
    }

}
