import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionClass {
    private final Class<?> mainClass;

    public ReflectionClass(Object object) {
        this.mainClass = object.getClass();
    }

    public ReflectionClass(Class<?> mainClass) {
        this.mainClass = mainClass;
    }

    public void printFullClassInfo() {
        System.out.println("\nИнформация о классе ");
        printClassName();
        printClassFields();
        printParentClassName();
        printClassMethods();
        printClassConstructors();
    }

    public  void printClassName() {
        System.out.println("Имя класса:");
        System.out.println(mainClass.getName());
    }

    public void printClassFields() {
        System.out.println("\nПоля, объявленные внутри класса:");
        for (Field field : mainClass.getDeclaredFields()) {
            System.out.printf("%s %s\n",
                    Modifier.toString(field.getModifiers()),
                    field.getName()
            );
        }
    }

    public void printParentClassName() {
        System.out.println("\nИмя родительского класса:");
        System.out.println(mainClass.getSuperclass().getSimpleName());
    }

    public void printClassMethods() {
        System.out.println("\nМетоды класса:");
        for(Method method : mainClass.getDeclaredMethods()) {
            System.out.printf("%s %s\n",
                    Modifier.toString(method.getModifiers()),
                    method.getName()
            );
        }
    }

    public void printClassConstructors() {
        System.out.println("\nКонструкторы класса");
        for (Constructor<?> constructor: mainClass.getConstructors()) {
            System.out.println(constructor);
        }
    }

}

