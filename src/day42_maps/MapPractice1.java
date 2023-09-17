package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("--------------------------");
        
        //how many female and male employees in the map?
        int countMaleEmployees = 0;
        int countFemaleEmployees = 0;

        /*
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployees++;
            }else{
                countFemaleEmployees++;
            }
        }

         */

        for (String eachValue : employeeMap.values()) {
            if(eachValue.equals("F")){
                countFemaleEmployees++;
            }else{
                countMaleEmployees++;
            }
        }

        System.out.println("Female Employees: "+ countFemaleEmployees);
        System.out.println("Male Employees: " + countMaleEmployees);

        System.out.println("-----------------------------------------------");

        //display the names of all female employees

        /*
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("F")){
                System.out.println(name);
            }
        }

         */


        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){ //if each value of the pair is female
                System.out.println(eachEntry.getKey()); //print the key of each entry (or the name)
            }
        }

        System.out.println("-------------------------------------------------");

        //update all of the M values with Male, and all F values with Female

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("M")){  // if the value of each pair is M
                eachEntry.setValue("Male");         // set entry value to male
            }else{
                eachEntry.setValue("Female");
            }
        }


        System.out.println(employeeMap);




    }
}
