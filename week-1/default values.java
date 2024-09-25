import java.util.*;
public class StaticDefaultValues {
    
    static byte byteVar;
    static short shortVar;
    static int intVar;
    static long longVar;
    static float floatVar;
    static double doubleVar;
    static char charVar;
    static boolean booleanVar;
    static String stringVar; 

    public static void main(String[] args) {
        
        System.out.println("Default byte: " + byteVar +
                           "\nDefault short: " + shortVar +
                           "\nDefault int: " + intVar +
                           "\nDefault long: " + longVar +
                           "\nDefault float: " + floatVar +
                           "\nDefault double: " + doubleVar +
                           "\nDefault char: '" + charVar + "'" +
                           "\nDefault boolean: " + booleanVar +
                           "\nDefault String: " + stringVar);
    }
}
