package gmit.ie;

/* Passenger class - Manipulates passenger's info
*
* Renan Moraes
* G00353112
* 05/03/2020
* */

public class Passenger {

    private  String title;
    private String name;
    private String id;
    private String phone;
    private int age;



    public Passenger(String title, String name, String id, String phone, int age) {

        setTitle(title);
        setName(name);
        setAge(age);
        setId(id);
        setPhone(phone);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.equals("Mr")  || title.equals("Mrs") || title.equals("Ms")){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Invalid argument.Title option are Mr, Mrs or Ms");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<3 ){
            throw new IllegalArgumentException("Invalid argument.Name must be over than 3 char");
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length()<10){
            throw new IllegalArgumentException("Invalid argument.ID must be over than 10 char");
        }
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {

    ;

        if(phone.length()<10){
            throw new IllegalArgumentException("Invalid argument. Phone must be minimum of 10 digits");
        }
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<16){
            throw new IllegalArgumentException("Invalid argument. Age must be over 16");
        }
        this.age = age;
    }
}
