public class Datee {
    private String Day;
    private String Month;
    private String Year;

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public Datee(String day, String month, String year) {
        Day = day;
        Month = month;
        Year = year;
    }
    @Override
    public String toString(){
        return Day+"-"+Month+"-"+Year;
    }
    public boolean compare(Datee d){
        if (this.Day.equals(d.Day) && this.Month.equals(d.Month) && this.Year.equals(d.Year)){
            return true;
        }
        return false;
    }
    public Datee isBefore(Datee d){
        int day= Integer.parseInt(this.Day);
        int day1= Integer.parseInt(d.Day);
        int month=Integer.parseInt(this.Month);
        int month1=Integer.parseInt(d.Month);
        int year=Integer.parseInt(this.Year);
        int year1=Integer.parseInt(this.Year);
        // Compare by year first
        if (year < year1) {
            return this;  // 'this' date is earlier
        } else if (year > year1) {
            return d;      // 'd' date is earlier
        }
        // Years are same, compare months
        if (month < month1) {
            return this;
        } else if (month > month1) {
            return d;
        }

        // Months are same, compare days
        if (day < day1) {
            return this;
        } else if (day > day1) {
            return d;
        }
        // Both are equal — return either
        return this;
    }
}
