package staticVariable;

public class StaticVarDemo {public int instanceVar; // declared as public only for demonstration
public static int staticVar; // declared as public only for demonstration
public static void main(String args[]){
System.out.println("MyClass.staticVar = " + StaticVarDemo.staticVar);
StaticVarDemo a1 = new StaticVarDemo();
StaticVarDemo a2 = new StaticVarDemo();
System.out.println("a1.instanceVar = " + a1.instanceVar);
System.out.println("a2.instanceVar = " + a2.instanceVar);
System.out.println("a1.staticVar = " + a1.staticVar); // also possible
System.out.println("a2.staticVar = " + a2.staticVar); // also possible

a1.instanceVar++;
a1.staticVar++;
System.out.println("a1.instanceVar = " + a1.instanceVar);
System.out.println("a1.staticVar = " + a1.staticVar);
System.out.println("a2.instanceVar = " + a2.instanceVar);
System.out.println("a2.staticVar = " + a2.staticVar);
}
}