public class Student1 {
    private String name;
    private String rollnum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollnum() {
        return rollnum;
    }

    public void setRollnum(String rollnum) {
        this.rollnum = rollnum;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    private Marks marks;
    public double totalMarks(){
        double sum=0;
        for (int i=0; i< getMarks().marks.length; i++){
            sum+=getMarks().marks[i];
        }
        return sum;
    }
    Student1(String name, String rollnum){
        this.name=name;
        this.rollnum=rollnum;
        marks= new Marks();
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Roll_num:"+rollnum);
        System.out.println("marks"+totalMarks());
    }

}
