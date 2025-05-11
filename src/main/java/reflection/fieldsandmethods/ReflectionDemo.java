package reflection.fieldsandmethods;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void printInfo(Person p) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        System.out.println("ToString: " + p);

        // --- Find og udskriv alle felter
        Class<?> clazz = p.getClass();
        for (Field f : clazz.getDeclaredFields()) {
            f.setAccessible(true);
            System.out.println(f.getName() + " = " + f.get(p));
        }

        // --- Kald en private metode (uden parametre)
        Method secretMethod = clazz.getDeclaredMethod("getPassword");
        secretMethod.setAccessible(true);
        String code = (String) secretMethod.invoke(p);
        System.out.println("Metodekald til getPassword(): " + code);

    }
}
