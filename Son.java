public class Son extends Person implements Dependent{

    int experience;

    public Son(String name, int age,int experience){
        super(name,age);
        this.experience = experience;
    }

    public void work(){
        System.out.println("The job is a doctor");
    }
}
