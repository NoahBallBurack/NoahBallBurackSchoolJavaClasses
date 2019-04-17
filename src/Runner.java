public class Runner {

    public static void main(String[] args){
        School bhs=new School("Berkeley High");
        Section bio=new Section("biology");
        Section math=new Section("math");
        Section compsci=new Section("computer science");
        Teacher alb=new Teacher("Albinson", 1, "Computer Science");
        Teacher wol=new Teacher("Wolkenfeld", 2, "Biology");
        Teacher wei=new Teacher("Weitz", 3, "Math");
        Student noa=new Student("Noah", 4, 12);
        Student kal=new Student("Kalil", 5, 12);
        Student osc=new Student("Oscar", 6, 12);
        Student lev=new Student("Lev", 7, 12);
        Student set=new Student("Seth", 8, 12);
        Student jak=new Student("Jake", 9, 12);
        bio.setTeacher(wol);
        math.setTeacher(wei);
        compsci.setTeacher(alb);
        math.addStudent(noa);
        math.addStudent(set);
        math.addStudent(jak);
        math.addStudent(lev);
        math.addStudent(osc);
        math.addStudent(kal);
        compsci.addStudent(jak);
        compsci.addStudent(noa);
        bio.addStudent(kal);
        bio.addStudent(noa);
        bio.addStudent(set);
        System.out.println(bio.toString());
        System.out.println(math.toString());
        System.out.println(compsci.toString());
    }

}