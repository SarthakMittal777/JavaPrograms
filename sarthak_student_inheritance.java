
    // A class "student" defines student with data members name, roll number and date of birth
    // and methods as Inputdata () and printdata. Inputdata () accepts the input for instance
    // variable and printdata displays that data.
    class student {
        String name;
        int roll;
        String dob;

        void i(String name, int rol, String da) {
            this.name = name;
            this.roll = rol;
            this.dob = da;
        }

        void printData() {
            System.out.println("Name " + name);
            System.out.println("Roll " + roll);
            System.out.println("Date " + dob);
        }
    }

    class marks {
        int[] sm;
        double tp;
        String grade;

        void readData(int[] marks) {
            sm = marks;
        }

        void compute() {
            int totalMarks = 0;
            for (int mark :sm) {
                totalMarks += mark;
            }
            tp = (double) totalMarks / sm.length;

            if (tp >= 90) {
                grade = "A+";
            } else if (tp >= 80) {
                grade = "A";
            } else if (tp >= 70) {
                grade = "B+";
            } else if (tp >= 60) {
                grade = "B";
            } else if (tp >= 50) {
                grade = "C";
            } else {
                grade = "F";
            }
        }

        void show() {
            System.out.println("Marks");
            for (int i = 0; i < sm.length; i++) {
                System.out.println("Subject " + (i + 1) + ": " +sm[i]);
            }
            System.out.println("Total Marks: " + (int) tp);
            System.out.println("Percentage: " + tp + "%");
            System.out.println("Grade: " + grade);
        }
    }
public class sarthak_student_inheritance {
    public static void main(String[] args) {
        student stu = new student();
        stu.i("The Sarthak", 123456, "2003");
        stu.printData();

        int[] ma = {85, 90, 80, 95, 75}; 
        marks marksObj = new marks();
        marksObj.readData(ma);
        marksObj.compute();
        marksObj.show();
    }
}

