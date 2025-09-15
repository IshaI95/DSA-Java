package DesignPatterns.Builder;

public class Employee {

    private int id;
    private String name;
    private String age;
    private String email;
    private double salary;

    public Employee(EmployeeBuilder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.age = builder.getAge();
        this.email = builder.getEmail();
        this.salary = builder.getSalary();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder{
        private int id;
        private String name;
        private String age;
        private String email;
        private double salary;

        public int getId() {
            return id;
        }

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAge() {
            return age;
        }

        public EmployeeBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public EmployeeBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public double getSalary() {
            return salary;
        }

        public EmployeeBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
