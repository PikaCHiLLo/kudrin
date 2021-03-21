import java.util.Arrays;

public class Student {
    String surname;

    public String GetSurname(String surname) {
        return surname;
    }

    public void setSurname(String modifiedSurname) {
        this.surname = modifiedSurname;
    }

    int marks[];

    public int GetMarks(int i) {
        return marks[i];
    }

    public void setMarks(int i) {
        this.marks[0] = i;
    }

    public void printMarks() {
        int length = marks.length;
        for (int i = 0; i < length; i++) {
            System.out.println(GetMarks(i));
        }
    }

    String subjects[];

    public String GetSubjects(int i) {
        return subjects[i];
    }

    public void setSubjects(String subjects) {
        this.subjects[0] = subjects;
    }

    public void printSubjects() {
        int length = subjects.length;
        for (int i = 0; i < length; i++) {
            System.out.println(GetSubjects(i));
        }
    }

    public void marksArray(int valuesMarks[]) {
        int countMarks = valuesMarks.length;
        this.marks = Arrays.copyOf(valuesMarks, countMarks);
    }

    public void subjectsArray(String valuesSubjects[]) {
        int countSubjects = valuesSubjects.length;
        this.subjects = Arrays.copyOf(valuesSubjects, countSubjects);
    }

    public int MarksCount(int valuesMarks[]) {
        return valuesMarks.length;
    }

    public int SubjectsCount(String valuesSubjects[]) {
        return valuesSubjects.length;
    }

    public static void main(String[] s) {
        Integer surname = new Integer(s[0]);
        Integer count = new Integer(s[1]);
    }
}
