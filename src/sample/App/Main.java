package sample.App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;

public class Main  {

    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> firstNames = new ArrayList<>();
        List<String> lastNames = new ArrayList<>();
        List<String> coursesList = new ArrayList<>();
        List<String> teachersNames =new ArrayList<>();



        File file = new File("C:\\Users\\97253\\Desktop\\git-workplace\\project\\GitProjectTest\\names.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null){
            String temp = st;
            firstNames.add(temp);
        }

        File file1 = new File("C:\\Users\\97253\\Desktop\\git-workplace\\project\\GitProjectTest\\last_names.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(file1));

        String st1;
        while ((st1 = br1.readLine()) != null){
            lastNames.add(st1);
        }

        File file2 = new File("C:\\Users\\97253\\Desktop\\git-workplace\\project\\GitProjectTest\\courses_names.txt");
        BufferedReader br2 = new BufferedReader(new FileReader(file2));

        String st2;
        while ((st2 = br2.readLine()) != null){
          coursesList.add(st2);
        }

        File file3 = new File("C:\\Users\\97253\\Desktop\\git-workplace\\project\\GitProjectTest\\teachers.txt");
        BufferedReader br3 = new BufferedReader(new FileReader(file3));

        String st3;
        while ((st3 = br3.readLine()) != null){
            teachersNames.add(st3);
        }


        Random first = new Random();
        Random last = new Random();
        Random course = new Random();
        Random teacher = new Random();
        Random rand = new Random();

        System.out.println("\n------------------------------\nstudents\n---------------------------------\n");

        for ( int i = 0 ; i < 100 ; i++){//creaing 100 random students.
            String f = firstNames.get(first.nextInt(firstNames.size()));
            String l = lastNames.get(last.nextInt(lastNames.size()));
            String email = f+l+"@gmail.com";
            String phone = "";
             for(int j = 0 ; j <9; j++){
                   phone += rand.nextInt(10);
            }
             String address = f+l+"Home Location.";

             Student student = new Student(f,l,email,phone,address,0);
            System.out.println(student.toString());
        }

        System.out.println("\n------------------------------\ncourses\n---------------------------------\n");


        for(int i = 0 ; i < coursesList.size();i++){
            Course c = new Course(i ,coursesList.get(i));
            System.out.println(c.toString());
        }

        System.out.println("\n------------------------------\nTeachers\n---------------------------------\n");


        for ( int i = 0 ; i < 50 ; i++){//creaing 50 random teachers.
            String f = teachersNames.get(teacher.nextInt(teachersNames.size()));
            String l = lastNames.get(last.nextInt(lastNames.size()));
            String email = f+l+"@gmail.com";
            String phone = "";
            for(int j = 0 ; j <9; j++){
                phone += rand.nextInt(10);
            }
            String address = f+l+" Home Location.";
            rand = new Random();
            Teacher teacher1 = new Teacher(f,l,email,phone,address,(rand.nextInt(5000)+5000));
            System.out.println(teacher1.toString());
        }

    }
}
