package com.talkingdata.sdmk.design.pattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * User：    ysl
 * Date:   2018/1/5
 * Time:   19:26
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
