public class Course {
    private String courseCode;
    private String courseTitle;
    private String courseCredits;

    public String getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(String courseCredits) {
        this.courseCredits = courseCredits;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void displayInfo(){
        System.out.println("The course code:"+courseCode);
        System.out.println("The course Title:"+courseTitle);
        System.out.println("The course credits:"+courseCredits);
    }
}
