package Creational.Singleton;
import java.io.*;

// Method1 - Classical Java implementation of singleton  design pattern
class CSingleton {
    private static CSingleton obj;
    private CSingleton(){}
    public static CSingleton getInstance(){
        if(obj==null){
            obj = new CSingleton();
        }
        return obj;
    }

}
//Singleton obj is not created until we need it and call the getInstance() method. This is called lazy instantiation. The main problem with the above method is that it is not thread-safe.

//Method 2 || Make getInstance() synchronized

class Singleton {
    private static Singleton obj;
    private Singleton() {}

    // Only one thread can execute this at a time
    public static synchronized Singleton getInstance()
    {
        if (obj == null)
            obj = new Singleton();
        return obj;
    }
}
//The main disadvantage of this method is that using synchronized every time while creating the singleton object is expensive and may decrease the performance of your program.
//Method 3 – Eager Instantiation || Static initializer based implementation

class SSingleton {
    private static SSingleton obj = new SSingleton();
    private SSingleton() {}

    public static SSingleton getInstance() { return obj; }
}
//JVM executes a static initializer when the class is loaded and hence this is guaranteed to be thread-safe.
//Method 4 – Most Efficient || Use “Double Checked Locking”

class DSingleton {
    private static volatile DSingleton obj = null;
    private DSingleton() {}

    public static DSingleton getInstance()
    {
        if (obj == null) {
            // To make thread safe
            synchronized (DSingleton.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj == null)
                    obj = new DSingleton();
            }
        }
        return obj;
    }
}
//We have declared the obj volatile which ensures that multiple threads offer the obj variable correctly when it is being initialized to the Singleton instance. This method drastically reduces the overhead of calling the synchronized method every time.

//Method 5 – Java Specific || Instantiation through inner class || Using class loading concept
//Classes are loaded only one time in memory by JDK.
//Inner classes in java are loaded in memory by JDK when it comes into scope of usage. It means that if we are not performing any action with inner class in our codebase, JDK will not load that inner class into memory. It is loaded only when this is being used somewhere.
//using class loading concept
// singleton design pattern

class ISingleton {

    private ISingleton() {
        System.out.println("Instance created");
    }

    private static class ISingletonInner{

        private static final ISingleton INSTANCE=new ISingleton();
    }
    public static ISingleton getInstance()
    {
        return ISingletonInner.INSTANCE;
    }
}
