package p1;

public class Main {

    public static void main(String[] args) {
        double studentAverage = 0;
        String [] test = {"test1", "test2", "test3"};
        double [] testAverage = new double[3];
        String [] students  = {"Chung", "Erick", "John", "Robert"};
	    double [][] grades  = { {82.5, 90, 78},
                                {78.4, 92, 85},
                                {80, 84, 82},
                                {85, 82.5,92}};

        System.out.println("\t\t\tSTUDENT GRADEBOOK\n");

        //print gradebook
        System.out.print("\t\t" + "  ");
        for (int i = 0; i < 3; i++) {
            System.out.print(test[i] + "  ");
        }
        System.out.print("\n\t\t --------------------");
        System.out.println();
        for (int i = 0; i < 4; i++){
            System.out.print(students[i] + "\t");

            for (int j = 0; j < 3; j++){
                System.out.print(" | " + grades[i][j]);
            }
            System.out.println("\n");
        }

        //student averages and test averages
        for (int i = 0; i < 4; i++) {
            testAverage[0] += grades[i][0];
            testAverage[1] += grades[i][1];
            testAverage[2] += grades[i][2];

            for (int j = 0; j < 3; j++){
                studentAverage += grades[i][j];
            }
            studentAverage = (studentAverage / 3);
            System.out.println(students[i] + " average is: " + studentAverage);
            studentAverage = 0;
        }
        System.out.print("\n");

        //print test averages
        for (int i = 0; i < 3; i++) {
           System.out.println(test[i] + "'s average grade is: " + testAverage[i]/4);
        }
    }
}// ends main