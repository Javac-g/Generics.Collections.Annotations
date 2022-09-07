# Arrays.-Collection.-Generic-Types.-Annotations
Practice tasks

 $${\color{lightgreen}Task 1 }$$



Create a createNotebook() method of the MyUtils class to create a new map with name as key and phone list as value.  The method receives a map with phone as key and name as value.

For example, for a given map

{0967654321=Petro, 0677654321=Petro, 0501234567=Ivan, 0970011223=Stepan, 0631234567=Ivan}

you should get

{Ivan=[0501234567, 0631234567], Petro=[0967654321, 0677654321], Stepan=[0970011223]}



$${\color{lightgreen}Task 2 }$$ 


Create the commonStudents() method of the MyUtils class to return a HashSet of common elements of two student lists.

For example, for a given

list1 [Students [id=1, name=Ivan], Students [id=2, name=Petro], Students [id=3, name=Stepan]]

and

list2 [Students [id=1, name=Ivan], Students [id=3, name=Stepan], Students [id=4, name=Andriy]]

you should get

[Students [id=3, name=Stepan], Students [id=1, name=Ivan]]





$${\color{lightgreen}Task 3 }$$ 

Create a listMapCompare() method of the MyUtils class to compare the contents of a list of strings and the values of a map.

For example, for a given list

[aa, bb, aa, cc]

and map

{1=cc, 2=bb, 3=cc, 4=aa, 5=cc}

you should get true.




$${\color{lightgreen}Task 4 }$$ 


In the class ArrayUtil write a public static generic method named "setAndReturn(...)" to modify and return the element in an array from the given position.
<pre>
<code>
Integer[] numbers = new Integer[3];
int numberFromSecondPosition = ArrayUtil.<Integer>setAndReturn(numbers,52,1);
System.out.println(numberFromSecondPosition);

String[] words = new String[3];
String wordFromSecondPosition = ArrayUtil.<String>setAndReturn(words,"Hello",1);
System.out.println(wordFromSecondPosition);
</code>
</pre>




$${\color{lightgreen}Task 5 }$$ 

Suppose we have the next generic class:
<pre>
<code>
class Array<T>{
    
    private T[] array;
    
    public Array(T[] array){
        
        this.array = array;
        
    }
    public T get(int index){
        return array[index];
    }
    public int length(){
        return array.length;
    }
}
</code>
</pre>
In the class ArrayUtil write static method named "averageValue(...)" that takes an object of Array type as input, and returns the average value its elements.

The given method should returns value of double type and take any array, whose elements extends Number type.

Examples of usage:
<pre>
<code>
Array<Integer> set1 = new Array<>(new Integer[]{1,2,3,4,5});
double averageValue1 = ArrayUtil.averageValue(set1);
System.out.println(averageValue1);

Array<Double> set2 = new Array<>(new Double[]{1.0,3.0,5.0});
double averageValue2 = ArrayUtil.averageValue(set2);
System.out.println(averageValue2);
</pre>
</code>



$${\color{lightgreen}Task 6 }$$ 


Suppose we have the next class hierarchy:

<pre>
<code>
class Person{
    protected String name;
    protected int age;
    
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
}

class Employee extends Person{
    private double salary;
    public Employee(String name,int age,double salary){
        super(name,age);
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public String toString(){
        return super.toString() + ", Salary: " + salary;
    }
}

class Developer extends Employee{
    private Level level;
    public Developer(String name,int age,double salary,Level level){
        super(name,age,salary);
        this.level = level;
    }
    public Level getLevel({
        return level;
    }
    public String toString(){
        return super.toString() + ", Level: " + level.name();
    }
    
    enum Level{
        JUNIOR,MIDDLE,SENIOR
    }
}
</code>
</pre>



$${\color{lightgreen}Task 7 }$$ 

Create marker-annotation CamelCase which will check whether method named according to code conventions. Create class CheckCamelCase for checking if all the annotated methods of some class satisfy naming pattern. This class contains constant 'CAMELCASE_PATTERN' that introduces regex for checking method name. Also this class contains method checkAndPrint(Class clazz) which returns true if all annotated methods of class satisfy 'CAMELCASE_PATTERN' and prints to standard output information about all incorrect method names by template: method <className>.<methodName> doesn't satisfy camelCase naming convention. For example
<pre>
<code>
For class 
public class Class1{
@CamelCase
public void correct(){} 
@CamelCase
public void InCorrect(){} 
public void JustMethod(){}
}
call CheckCamelCase.checkAndPrint(Class1.class) 
prints to console 
method Class1.InCorrect doesn't satisfy camelCase naming convention
</code>
</pre>

