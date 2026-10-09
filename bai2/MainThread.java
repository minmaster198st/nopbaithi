package bai2;

public class MainThread {
    public static void main(String[] args) {
        StudentMark st1 = new StudentMark("Vu Manh Toan", 98, 99, 100);
        StudentMark st2 = new StudentMark("Hoang Thi Quyen", 30, 99, 100);
        st1.checkPass();
        st2.checkPass();
        st1.displayResult();
        st2.displayResult();
    }
}
