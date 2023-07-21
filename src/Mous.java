public class Mous {
    String name;
    int age;

    public Mous() {
    }

    public Mous(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n"+"Mous: " +"\n"+
                "name: " + name + "\n" +
                "age: " + age +"\n";
    }
}
