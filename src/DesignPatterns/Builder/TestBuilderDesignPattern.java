package DesignPatterns.Builder;

public class TestBuilderDesignPattern {

    public static void main(String[] args) {

        Employee e1 = Employee.getBuilder()
                .setId(1)
                .setName("Rekha")
                .setAge("20")
                .setEmail("Rekha@yolo.com")
                .setSalary(15000)
                .build();

        System.out.println("Employee 1: " + e1);

        Employee e2 = Employee.getBuilder()
                .setId(2)
                .setName("Aman")
                .setAge("30")
                .setEmail("Aman@yolo.com")
                .setSalary(150000)
                .build();

        System.out.println("Employee 2: " + e2);

    }
}
