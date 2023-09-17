package day42_maps;

import java.time.LocalDate;
import java.util.*;


public class MapPractice2 {


    public static void main(String[] args) {


        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 28);
        person2.put("job_title", "Back End Developer");
        person2.put("salary", 150000);
        person2.put("hired_date", LocalDate.of(2023, 2, 24));
        person2.put("married", false);

        System.out.println(person2.get("salary"));



        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Mary");
        person3.put("gender", 'F');
        person3.put("age", 45);
        person3.put("job_title", "Front End Developer");
        person3.put("salary", 150000);
        person3.put("hired_date", LocalDate.of(2022, 2, 24));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Mike");
        person4.put("gender", 'M');
        person4.put("age", 30);
        person4.put("job_title", "Back End Developer");
        person4.put("salary", 101000);
        person4.put("hired_date", LocalDate.of(2023, 2, 24));
        person4.put("married", false);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Savannah");
        person5.put("gender", 'F');
        person5.put("age", 43);
        person5.put("job_title", "QA Tester");
        person5.put("salary", 150000);
        person5.put("hired_date", LocalDate.of(2023, 2, 24));
        person5.put("married", false);


        List<Map<String, Object>> listOfMap = new ArrayList<>();
        listOfMap.add(person1);
        listOfMap.add(person2);
        listOfMap.add(person3);
        listOfMap.add(person4);
        listOfMap.add(person5);
      //  listOfMap.addAll(Arrays.asList(person3, person4, person5));

        System.out.println(listOfMap);

        System.out.println("--------------------------------------------------");

        for (Map<String, Object> eachMap : listOfMap) {
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }

        System.out.println("--------------------------------------------------");

        //display the names of the employees who were hired this year

        for (Map<String, Object> eachMap : listOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getKey().equals("hired_date")){
                    if(  ( (LocalDate)eachEntry.getValue() ).getYear() == 2023 ){
                        System.out.println(eachMap.get("name"));
                    }
                }
            }
        }

        System.out.println("----------------------------------------------");

        listOfMap.get(0).replace("name", "Victor");
        listOfMap.get(listOfMap.size()-1).replace("salary", ( (Integer) listOfMap.get(listOfMap.size()-1).get("salary")) + 50000);

        System.out.println(listOfMap);

        System.out.println("------------------------------------------------");

        listOfMap.get(1).replace("age", (Integer)listOfMap.get(1).get("age")+4 );
        System.out.println(listOfMap);


        System.out.println("==========================================================================================");

        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("year", 2021);
        car1.put("color", "white");
        car1.put("price", 50000);


        Map<String, Object> car2 = new LinkedHashMap<>();

        Map<String, Object> car3 = new LinkedHashMap<>();

        Map<String, Object> car4 = new LinkedHashMap<>();

        List<Map<String, Object>> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1, car2, car3, car4));








    }




}