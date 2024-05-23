public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void search_person(){
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}
