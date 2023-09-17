package day42_maps;

import day26_statics.Car;
import day33_abstraction.employeeTask.Developer;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapPractice4 {


    public static void main(String[] args) {






        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
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



        Map<Integer, Map<String, Object>> mapOfMap = new LinkedHashMap<>();
        mapOfMap.put(0, person1);
        mapOfMap.put(1, person2);
        mapOfMap.put(2, person3);
        mapOfMap.put(3, person4);
        mapOfMap.put(4, person5);

        System.out.println(mapOfMap);

        System.out.println("-----------------------------------");

        mapOfMap.get(1).replace("salary", 120000);
        System.out.println(mapOfMap.get(1));

        System.out.println("----------------------------------------------------------");

        for (Map<String, Object> eachValue : mapOfMap.values()) {
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {
                if(eachEntry.getKey().equals("salary")){
                    eachEntry.setValue( (Integer) eachEntry.getValue()+10000);
                }
            }

        }
        System.out.println(mapOfMap);

        System.out.println("----------------------------------------------------------");

        Map<Map<String, Integer>, Map<String, Integer>> mapOfMaps2 = new LinkedHashMap<>();
        //typically you will avoid making maps like this because it takes up too much memory. But it is possible


        Map<int[], List<Integer>> map2 = new LinkedHashMap<>();

        Map<Developer, Car> map3 = new LinkedHashMap<>();



    }
}
