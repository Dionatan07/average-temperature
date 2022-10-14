package application;

import entities.Month;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        String path = "C:\\temp\\temperatures.txt";
//        Input values in txt file:
//        January;33
//        February;30
//        March;30
//        April;15
//        May;13
//        Jun;5

        List<Month> months = new ArrayList<>();
        int sum = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            String line = br.readLine();

            while (line != null) {
                String[] vector = line.split(";");
                String monthName = vector[0];
                int temperature = Integer.parseInt(vector[1]);
                sum += temperature;
                Month month = new Month(monthName, temperature);

                months.add(month);
                line = br.readLine();
            }

            int average = sum / months.size();
            System.out.println("Semester average: " + average + "º");
            System.out.println();
            System.out.println("Months with above average temperature:");

            for (Month list : months) {
                if (list.getTemperature() > average) {
                    System.out.println(list.getMonth() + " " + list.getTemperature() + "º");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
