import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Student> set=new TreeSet<>();
        set.add(new Student("张三", 89));
        set.add(new Student("李四", 46));
        set.add(new Student("王五", 49));
        for(Student key:set){
            System.out.println(key);
        }
//        Map<Student, Integer> map = new TreeMap<>();
//
//        map.put(new Student("张三", 89), 1);
//        map.put(new Student("李四", 46), 2);
//        map.put(new Student("王五", 49), 3);
//        for (Student key : map.keySet()) {
//            System.out.println(key);
//        }
//        System.out.println(map.get(new Student("张三", 89)));
    }
}

class Student implements Comparable<Student> {
    public String name;
    public int score;
    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {//按分数排序
        Student p = (Student) o;
        if (this.score == p.score) {
            return 0;
        }
        return this.score < p.score ? -1 : 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}