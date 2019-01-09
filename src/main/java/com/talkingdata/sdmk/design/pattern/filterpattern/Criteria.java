package com.talkingdata.sdmk.design.pattern.filterpattern;

import java.util.List;

/**
 * User：    ysl
 * Date:   2018/1/5
 * Time:   19:08
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);

}
