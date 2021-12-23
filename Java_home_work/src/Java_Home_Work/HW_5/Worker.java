package Java_Home_Work.HW_5;

    public class Worker {
    private String first_name;
    private String last_name;
    private String patronymic;
    private String post;
    private String email;
    private String phone_number;
    private int pay;
    private int age;


    public Worker(String first_name, String last_name, String patronymic, String post, String email, String phone_number, int pay, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.phone_number = phone_number;
        this.pay = pay;
        this.age = age;
    }
     public String info_about_worker(){
       return  ("Name: " + first_name + " " + last_name + " " + patronymic + "\n" + "Position: " + post + "\n" + "Contact: "
                + email + ", " + phone_number + "\n" + "Other:  " + pay + "$, " + age + " years old.");
    }
    public void print(){
        System.out.println(info_about_worker());
    }
    public int getAge(){
        return(age);
        }
    }




