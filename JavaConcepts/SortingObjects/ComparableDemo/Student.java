package JavaConcepts.SortingObjects.ComparableDemo;

 public class Student implements Comparable<Student> {
        private int rollNumber;
        private String name;

        public Student(int rollNumber, String name) {
            this.rollNumber = rollNumber;
            this.name = name;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public String getName() {
            return name;
        }

        @Override
        // Natural ordering by rollNumber
        public int compareTo(Student other) {
            return Integer.compare(this.rollNumber, other.rollNumber);
        }

        @Override
        public String toString() {
            return "Student{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + '}';
        }
 }

