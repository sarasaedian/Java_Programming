package m21_methods_part2;

class EmployeeInfo {

    public static void main(String[] args) {
        displayEmployeeInfo("Josh", 29, "Los Angeles");
    }

    public static void displayEmployeeInfo(String name, int age, String city) {
        System.out.println("Employee name is " + name);
        System.out.println(name + " is " + age + " years old");
        System.out.println(name + " is from " + city);
    }

}