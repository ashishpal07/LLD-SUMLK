package DesignPatterns.SingletonDesignPattern;


/**
 * This code will work if our code is running in 
 * single thread
 * 
 * This will fail if our code will on multiple thread
 * condition :-
 *      1. As our code is running in multithreading code comes on if(inst == null)
 *         and check this and now thread goes changes [Basically it goes inside if condition]
 *      2. now second thread will come and run if(inst == null) this line then its gets
 *         inst == null -> then it will create object and return inst
 *      3. Now thread2 gets closed and thread1 starts and it will again create instance of class
 *         so our code will fail in multithreading.
*/

public class Singleton {

    static private Singleton inst;
    
    private Singleton() {}
    
    /* if code runs in single thread then it too fine no problem  

    public static  Singleton getInstance() {
        if(inst == null) {
            inst = new Singleton();
        }

        return inst;
    }

    */

    /** for handle multithreading scenario we will use synchronize 
     * OR
     * we can assign synchronized to getInstance() method
    */
    public static Singleton getInstance() {
        if(inst == null) {
            synchronized (Singleton.class) {
                if(inst == null) {
                    inst = new Singleton();
                }
            }
        }

        return inst;
    }

}

