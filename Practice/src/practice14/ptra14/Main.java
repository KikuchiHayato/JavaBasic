package practice14.ptra14;

import practice14.common.BSCourse;
import practice14.common.JavaCourse;

public class Main {
	public static void main(String[] args) {
        JavaCourse javacourse = new JavaCourse();

        System.out.println(javacourse.getCourseName());

        for (String Unit : javacourse.getCourseUnit()) {
        	System.out.println(Unit);
        }

        BSCourse bscourse = new BSCourse();

        System.out.println(bscourse.getCourseName());

        for (String Unit : bscourse.getCourseUnit()) {
        	System.out.println(Unit);
        }
    }
}
