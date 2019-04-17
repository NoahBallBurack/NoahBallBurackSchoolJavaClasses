public class Person {
    private String name;
    private int id;

    public Person(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String n){
        name=n;
    }

    public void setId(int id){
        this.id=id;
    }
}
