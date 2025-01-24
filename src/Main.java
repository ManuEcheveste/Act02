import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String stName;
    private static int[] grades = {0,0,0,0,0};

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte el nombre del alumno:\t");
        stName = scanner.nextLine();
        for(int i = 1; i <= grades.length; i++)
        {
            System.out.println("Inserte la calificación #"+i+":\t");
            var tmp = scanner.nextLine();
            grades[i-1] = Integer.parseInt(tmp);
        }
        int average = CalcAverage(grades);
        char rank = GetGrade(average);
        ShowGrades(stName, average, grades, rank);
    }
    public static int CalcAverage(int[] gradesLocal)
    {
        int gradeArchieved = 0;
        //int maxGrading = 0;

        for (int i = 0; i<gradesLocal.length;i++)
        {
            //maxGrading+=100;
            gradeArchieved+=gradesLocal[i];
        }
        return gradeArchieved / gradesLocal.length;
    }
    public static char GetGrade(int gradeLocal)
    {
        if(gradeLocal <= 50)
            return 'F';
        else if(gradeLocal<60)
            return 'E';
        else if(gradeLocal<70)
            return 'D';
        else if(gradeLocal<80)
            return 'C';
        else if(gradeLocal<90)
            return 'B';
        else
            return 'A';
    }
    public static void ShowGrades(String studentName, int averageGrade, int[] individualGrades, char rank)
    {
        System.out.println("Nombre del estudiante: " + studentName);
        for(int i = 1; i <= individualGrades.length; i++)
        {
            System.out.println("Calificación "+i+": "+individualGrades[i-1]);
        }
        System.out.println("Promedio: " + averageGrade);
        System.out.println("Calificaición: " + rank);
    }
}