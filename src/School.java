public class School {
    private String name;
    private Section[] sections = new Section[200];
    private int sectionCount;

    public School(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }

    public void addSection(Section s){
        sections[sectionCount]=s;
        sectionCount++;
    }

    public Section[] getSections(){
        return sections;
    }
}
