package Nov.ex_08112024.Encapsulation_Lab097;

public class Lab097 {
    public static void main(String[] args) {
        Person p = new Person("ABC", "Python");
        System.out.println(p.getName());
        p.setName("Bhavya");
        System.out.println(p.getCourse());
        p.setCourse("Selenium with Java");
    }
}
class Person{
    private String name;
    private String course;
    public Person(String name, String course){
        this.name = name;
        this.course = course;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
        System.out.println(this.name);
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
        System.out.println(this.course);
    }
}
