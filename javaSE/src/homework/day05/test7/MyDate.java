package homework.day05.test7;

public class MyDate {
    int year;
    int month;
    int day;
    public MyDate(){}
    public MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void showDate(){
        System.out.println("日期："+getYear()+"年"+getMonth()+"月"+getDay());
    }

    public void isBi() {
        if (getYear() % 4 == 0 && getYear() % 100 != 0 || getYear() % 400 == 0) {
            System.out.println(getYear() + "年是闰年");
        } else {
            System.out.println(getYear() + "年不是闰年");
        }

    }
}
