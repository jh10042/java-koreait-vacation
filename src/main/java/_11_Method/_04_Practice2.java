package _11_Method;

public class _04_Practice2 {

    public static int calcTotal(int kor, int eng, int math) {
        int result = kor + eng + math;
        return result;
    }

    public static double calcAvg(int result) {
        double average = result /3.0;
        return average;
    }

    public static char getGrade(double average) {
        if (average >= 90) {
            char grade = 'A';
            return grade;
        } else if (average >= 80) {
            char grade = 'B';
            return grade;
        } else if (average >= 70) {
            char grade = 'C';
            return grade;
        } else {
            char grade = 'D';
            return grade;
        }
    }
    public static void printStudentInfo(String name, int kor, int eng, int math) {

        // 메서드 3개를  완성해서 에러를 없애주세요
        // getGrade: 90이상 A, 80이상 90미만 B, 70이상 80미만 C, 이외에는 D
        int totalScore = calcTotal(kor, eng, math);
        double average = calcAvg(totalScore);
        char grade = getGrade(average);

        System.out.println("이름: " + name);
        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + average);
        System.out.println("학점: " + grade);
    }


    public static void main(String[] args) {
        // 학생 성적관리
        printStudentInfo("김철수", 80, 90, 70);
    }
}
