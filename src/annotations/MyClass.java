package annotations;

import java.lang.reflect.Method;

public class MyClass {
    @MyCustumAnnotation(value=2333)
    public void digaOi(){
        System.out.println("Minha anotação");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        MyClass classMy= new MyClass();
        Method methodVal= classMy.getClass().getMethod("digaOi");
        MyCustumAnnotation myCustumAnnotation= methodVal.getAnnotation(MyCustumAnnotation.class);
        System.out.println("value is " + myCustumAnnotation.value());
    }
}
