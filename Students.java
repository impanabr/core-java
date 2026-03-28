class Students{

public static void displayStudentsName(String name){
    System.out.println("Students Name: " + name);
}

static int age = 21;

public static void displayAge(){
    System.out.println("Students Age: " + age);
}

public static String displayCourse(String course){
    System.out.println("Course: " + course);
    return course;
}
static boolean passed = true;

public static boolean displayResult(){
    System.out.println("Passed: " + passed);
    return passed;
}
}
