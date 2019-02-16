package k018_Generics;

import java.util.ArrayList;
import java.util.List;

abstract class Collection<E> {
    //002.method accepts a collection of objects of E or some subtype of E, not just E itself.
    //can read E's from items
    //but cannot write to it since we do not know what objects comply to that unknown subtype of E
    //TODO better example!
    //In return for this limitation, we have the desired behaviour:
    // Collection<String> is a subtype of Collection<? extends Object>.
    // the wildcard with an extends-bound (upper bound) makes the type COvariant.(tj jako pole)

    //The key to understanding why this trick works is rather simple:
    // if you can only take items from a collection, then using a collection of Strings
    // and reading Objects from it is fine.
    abstract void addAll(Collection<? extends E> items);


    //List<? super String> a supertype of List<Object>
    //KONTRAvariance
    //you can only call methods that take String as an argument on List<? super String>
    // (e.g., you can call add(String) or set(int, String)),
    // while if you call something that returns T in List<T>, you don't get a String, but an Object!
    //TODO priklad urcite to neni void asi neco co se vrati!!
    abstract void anotherMethod(List<? super String> items);

    //Bloch: objects you only read from: Producers and those you only write to: Consumers.
    //"For maximum flexibility, use wildcard types on input parameters that represent producers or consumers",
    // and proposes the following mnemonic:  //<<PECS>> stands for Producer-Extends, Consumer-Super.


    //producer-object List<? extends Foo>, you are not allowed to call add() or set()


    //nekompatibilni lsucovani array a generik!
//    String[] x0=new List<String>[];
//    List<E> x1=new List<E>[];
//    List<E> x2=new List<String>[];
//    List<E> x3=new E[];

}

public class Ex002_JavaGenerics {
    public static void main(String[] args) {
        Ex002_JavaGenerics ex = new Ex002_JavaGenerics();
        ex.problemJava001();
    }
    private void effectiveJava001() {
        //COvariant t1 extends(impl napoak) t2 => Arra[t1] extsd Arr[t2]
        Object[] objectArray = new Long[1];
        objectArray[0] = "I don't fit in"; // Throws ArrayStoreExceptio
        //array reified: enforce elemetn type conversion

        //INvariant
        //List<Object> ol = new ArrayList<Long>(); // Won't compile!// Incompatible types
        //ol.add("I don't fit in");
        //Generics  constraint jenom compile-time v runtimu info mizi:erasure


        //CONTRAvariant
    }

    private void problemJava001() {
        //001.
        List<String> strs = new ArrayList<String>();
        //List<Object> objs = strs; // !!! The cause of the upcoming problem sits here. Java prohibits this!
        //objs.add(1); // Here we put an Integer into a list of Strings
        String s = strs.get(0); // !!! ClassCastException: Cannot cast Integer to String
    }
}
