package com.vampire.designpattern.iterator;

/**
 * @author ASUA
 */
public class ClassroomIterator implements Aggregate.Iterator {
    private Classroom classroom;
    private int index;

    public ClassroomIterator(Classroom classroom) {
        this.classroom = classroom;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < classroom.getLength()) {
            return true;
        }
        return false;
    }

    public Object next() {
        Student student = classroom.getStudent(index++);
        return student;
    }
}
