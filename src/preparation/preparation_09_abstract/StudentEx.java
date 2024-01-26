package preparation.preparation_09_abstract;

public class StudentEx {
    public static void main(String[] args) {
        Son son = new Son("손주연", "우주 고등학교", 17, 19980527);
        System.out.println("=== " + son.getName() +" 학생의 정보");
        System.out.println("학교 :" + son.getSchool());
        System.out.println("나이 :" + son.getAge());
        System.out.println("학번 :" + son.getStudentID());
        son.todo();

        Kim kim = new Kim("김현정", "우주 고등학교", 19, 19941216);
        System.out.println("=== " + kim.getName() +" 학생의 정보");
        System.out.println("학교 :" + kim.getSchool());
        System.out.println("나이 :" + kim.getAge());
        System.out.println("학번 :" + kim.getStudentID());
        kim.todo();
    }
}
