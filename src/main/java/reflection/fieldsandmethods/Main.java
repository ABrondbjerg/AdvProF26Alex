package reflection.fieldsandmethods;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Person p = new Person("Alice", 42);
        ReflectionDemo.printInfo(p);


    }
}
