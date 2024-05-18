public class Child extends Father{

    int age;
    public Child(String s_name, String job,int age) {
        super(s_name, job);
        this.age = age;
    }

    public void show_age(){
        System.out.println("Age is "+age);
    }
}
