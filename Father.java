public class Father extends Granpa {
    
    String job;

    public Father(String s_name, String job) {
        super(s_name);
        this.job = job;
        
    }

    public void show_job(){
        System.out.println("Job is " + job);
    }
}
