package com.talkingdata.sdmk.design.pattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * User：    ysl
 * Date:   2018/1/5
 * Time:   19:23
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons){
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
