public class Course {
    private  String Course_id;
    private String Coursename;
    private String CreditHours;

    public String getCourse_id() {
        return Course_id;
    }
    public void setCourse_id(String course_id) {
        Course_id = course_id;
    }

    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String coursename) {
        Coursename = coursename;
    }

    public String getCreditHours() {
        return CreditHours;
    }

    public void setCreditHours(String creditHours) {
        CreditHours = creditHours;
    }

    public Course(String course_id, String coursename, String creditHours) {
        Course_id = course_id;
        Coursename = coursename;
        CreditHours = creditHours;
    }

    public void display_course(){
        System.out.println("Course name:"+Coursename);
        System.out.println("Course credits:"+CreditHours);
        System.out.println("Course id:"+Course_id);
    }
}
