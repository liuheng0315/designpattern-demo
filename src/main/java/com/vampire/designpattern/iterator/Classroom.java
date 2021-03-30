package com.vampire.designpattern.iterator;

/**
 * @author ASUA
 */
public class Classroom implements Aggregate{
    private Student[] students;
    private int last = 0;

    public Classroom(int size) {
        this.students = new Student[size];
    }

    public Student getStudent(int index) {
        return students[index];
    }

    public void addStudent(Student student) {
        this.students[last++] = student;
    }

    public int getLength(){
        return last;
    }

    public Iterator iterator() {
        return new ClassroomIterator(this);
    }
}
