package day42_maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

public class MapPractice3 {
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


        Map<String, Object>[] arrayOfMap = new Map[5];
        arrayOfMap[0] = person1;
        arrayOfMap[1] = person2;
        arrayOfMap[2] = person3;
        arrayOfMap[3] = person4;
        arrayOfMap[4] = person5;


        System.out.println(Arrays.toString(arrayOfMap));

        arrayOfMap[1].replace("salary", ( (Integer)arrayOfMap[1].get("salary") ) + 10000);
        arrayOfMap[0].replace("name", "Steve");


        System.out.println(Arrays.toString(arrayOfMap));

        int count = 0;
        for (Map<String, Object> eachMap : arrayOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getKey().equals("salary")){
                    double salary = (Integer) eachEntry.getValue();
                    if(salary <100000){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);



    }

}
