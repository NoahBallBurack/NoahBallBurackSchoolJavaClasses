public class Section {
    private Teacher teacher;
    private Student[] students=new Student[50];
    private String name;
    private int currentSize;

    public Section(String name){
        this.name=name;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Teacher t){
        teacher=t;
    }

    public Student[] getStudents(){
        return students;
    }

    public void addStudent(Student s){
        students[currentSize]=s;
        currentSize++;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String toString() {
        String text = "This " + name + " class is taught by " + teacher.getName() + " and has " + currentSize + " students: ";
        for (int i = 0; i < currentSize; i++) {
            text+=students[i].getName();
            if(i<currentSize-1){
                text+=", ";
            }
        }
        return text;
    }
}
