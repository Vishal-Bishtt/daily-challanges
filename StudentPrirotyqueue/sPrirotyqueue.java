package StudentPrirotyqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class sPrirotyqueue {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade()-o2.getGrade();
            }
        });
        queue.offer(new Student("vishal", 'a'));
        queue.offer(new Student("Ram", 'b'));
        queue.offer(new Student("Shyam", 'c'));
        queue.offer(new Student("Rohan", 'd'));
        queue.offer(new Student("rahul", 'a'));
        System.out.println(queue);
    }
    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Student: ");
            sb.append("name=").append(name);
            sb.append(", grade=").append(grade);
            return sb.toString();
        }
    }

}
