package quasylab.sibilla.core.simulator.serialization;

import java.io.IOException;
import java.io.InputStream;

public class ClassBytesLoader {

    public static byte[] loadClassBytes(String className) throws IOException {
        int size;
        byte[] classBytes;
        InputStream is;
        String fileSeparator = System.getProperty("file.separator");

        String fileName = className.replace('.', fileSeparator.charAt(0));
        fileName = fileName + ".class";

        // Search for the class in the CLASSPATH
        is = ClassLoader.getSystemResourceAsStream(fileName);
        if (is != null) {
            size = is.available();

            classBytes = new byte[size];

            is.read(classBytes);
            is.close();

            return classBytes;
        }
        
        return CustomClassLoader.classes.get(className);
    }
}