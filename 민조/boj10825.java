import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Student[] students = new Student[n];
        for(int i=0;i<n;i++){
            String[] input=br.readLine().split(" ");
            students[i] = new Student(input[0],
                    Integer.parseInt(input[1]),
                    Integer.parseInt(input[2]),
                    Integer.parseInt(input[3]));
        }
        Comparator<Student> myComparator = new Comparator<Student>(){
            @Override
            public int compare(Student s1,Student s2){
                if(s1.korean<s2.korean)  return 1;
                else if(s1.korean == s2.korean){
                    if(s1.english>s2.english) return 1;
                    else if(s1.english==s2.english){
                        if(s1.math < s2.math)return 1;
                        else if(s1.math==s2.math){
                            return s1.name.compareTo(s2.name);
                        }
                    }
                }
                return -1;
            }
        };
        Arrays.sort(students,myComparator);
        for(int i=0;i<n;i++){
            bw.write(students[i].name+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }


}

class Student{
    String name;
    int korean;
    int english;
    int math;
    Student(String name,int korean,int english,int math){
        this.name=name;
        this.korean=korean;
        this.english=english;
        this.math=math;
    }
}