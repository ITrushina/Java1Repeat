class Person {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public void setName (String name) {
        this.name = name;
    }
    public void setPosition (String position) {
        this.position = position;;
    }
    public void setEmail (String email) {
        this. email = email;
    }
    public void setPhone (int phone) {
        this.phone = phone;
    }
    public void setSalary (int salary) {
        this.salary = salary;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public int getAge () {
        return age;
    }

    public Person (String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this. email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }



    @Override
    public String toString() {
        return "\n| Имя: " + name + " | Должность: " + position + " | Почта: " + email + " | Телефон: " + phone + " | З/п: " + salary + " | Возраст: " + age;
    }
}
