package cse.edu.bubt ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class registration_system {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<String>> course_map = new HashMap<>();
        //  key = course ;
        // value = student_id ;

        while (true) {
            System.out.println("\n--- BUBT Course Registration System ---");
            System.out.println("1. Add student to course");
            System.out.println("2. Drop student from course");
            System.out.println("3. List of students in a course");
            System.out.println("4. Show all courses for a student");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: {
                    System.out.print("Enter course code: ");
                    String course = sc.nextLine();
                    System.out.print("Enter student ID: ");
                    String student = sc.nextLine();

                    course_map.putIfAbsent(course, new ArrayList<>());
                    course_map.get(course).add(student);
                    // add student to the specific course
                    System.out.println("Student added to course!");
                    break;
                }

                case 2: {
                    System.out.print("Enter course code: ");
                    String course = sc.nextLine();
                    System.out.print("Enter student ID: ");
                    String student = sc.nextLine();

                    if (course_map.containsKey(course)) {
                        // returns true if the required course is available ;

                        if (course_map.get(course).remove(student)) {
                            // if the student is on that specific course , remove him ;
                            System.out.println("Student dropped from course.");
                        } else {
                            System.out.println("Student not found in this course.");
                        }
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Enter course code: ");
                    String course = sc.nextLine();

                    if (course_map.containsKey(course)) {
                        //  returns true if the required course is available
                        System.out.println("Students in " + course + ": " + course_map.get(course));

                        // .get(course) , is get(key) ,by that we get value of that map which is (student_id) ;

                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Enter student ID: ");
                    String student = sc.nextLine();

                    ArrayList<String> courses = new ArrayList<>();

                    for (String c : course_map.keySet()) {
                        // looping through all keys ;

                        if (course_map.get(c).contains(student)) {
                            courses.add(c);
                        }
                    }

                    if (courses.isEmpty()) {
                        System.out.println("Student is not enrolled in any courses.");
                    } else {
                        System.out.println("Student is enrolled in: " + courses);
                    }
                    break;
                }

                case 5: {
                    System.out.println("Exiting program.");
                    sc.close();
                    return;  // exits the main method
                }

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
