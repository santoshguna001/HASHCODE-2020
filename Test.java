package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amine gasa
 */
public class Test {

    static int MAX;
    static int numberBooks, numberLibraries, numberDays;
    static ArrayList<Integer> Scores, Input, Output;
    static int Num;
    static int score = 0;

    static void Solve(ArrayList<Integer> days, ArrayList<Integer> libraries, ArrayList<books>)
    static ArrayList<Integer> Solve(int Max, ArrayList<Integer> input) {
        ArrayList<Integer> BestSolution = new ArrayList<Integer>();
        score = 0;
        int j, i = input.size() - 1;
        boolean test1 = true, test2 = true;
        while (i >= 0 && test1) {
            ArrayList<Integer> TempBestSolution = new ArrayList<Integer>();
            j = i;
            int sum = 0;
            while (j >= 0 && test2) {

                int temp = input.get(j);
                if (sum + temp < Max) {
                    sum = sum + temp;
                    TempBestSolution.add(j);
                } else if (sum + temp == Max) {
                    sum = sum + temp;
                    TempBestSolution.add(j);
                    test2 = false;
                    test1 = false;
                }
                j--;
            }
            if (score < sum) {
                score = sum;
                BestSolution = TempBestSolution;
            }
            if (BestSolution.size() == input.size()) {
                test1 = false;

            }

            i--;
        }

        return BestSolution;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String[] fileNames = {"a_example"};
        //String[] fileNames = {"a_example", "b_read_on", "c_incunabula", "d_tough_choices", "e_so_many_books", "f_libraries_of_the_world"};
        for (int i = 0; i < fileNames.length; i++) {
            getInputFromFile(fileNames[i]);
            /**Output = Solve(MAX, Input);
            Collections.reverse(Output);

            writeIntoFile(fileNames[i]);
            System.out.println("\nSCORE : " + score);*/
        }

    }

    static void getInputFromFile(String fileName) throws FileNotFoundException {
        try {
            Scores = new ArrayList<Integer>();
            //Input = new ArrayList<Integer>();

            BufferedReader fr = new BufferedReader(new FileReader(fileName + ".txt"));
            String line, firstLine;
            firstLine = fr.readLine();
            String[] vars;
            vars = firstLine.split(" ");
            numberBooks = Integer.valueOf(vars[0]);
            numberLibraries = Integer.valueOf(vars[1]);
            numberDays = Integer.valueOf(vars[2]);
            //System.out.println(numberBooks+" "+numberLibraries+" "+numberDays);
            
            line = fr.readLine();
            String temp[] = line.split(" ");
            int[] arr = new int[temp.size];
            for(int i = 0; i < arr.length; i++){
                Scores.add()
            }


            System.out.println("-------input of " + fileName);
            System.out.println(MAX + " " + Num);
            while ((line = fr.readLine()) != null) {

                String letters[] = line.split(" ");

                for (int i = 0; i < letters.length; i++) {
                    Input.add(Integer.valueOf(letters[i]));
                    System.out.print(letters[i] + " ");
                }
            }
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void writeIntoFile(String fileName) {
        try {
            System.out.println("\n------- output " + fileName);
            PrintWriter outputFile = new PrintWriter("output\\" + fileName + ".out", "UTF-8");
            outputFile.println(Output.size());
            System.out.println(Output.size());
            for (int i = 0; i < Output.size(); i++) {
                outputFile.print(Output.get(i) + " ");
                System.out.print(Output.get(i) + " ");
            }
            outputFile.close();
        } catch (Exception e) {
            System.err.println("" + e);
        }
    }

}