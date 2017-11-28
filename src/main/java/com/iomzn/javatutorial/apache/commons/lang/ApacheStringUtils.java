package com.iomzn.javatutorial.apache.commons.lang;

import org.apache.commons.lang3.StringUtils;

public class ApacheStringUtils {

    public static void main(String[] args) {
        // isEmpty|isNotEmpty|isAnyEmpty|isNoneEmpty|isAllEmpty
        StringUtils.isEmpty(null);    // T
        StringUtils.isEmpty("");      // T
        StringUtils.isEmpty(" ");     // F
        StringUtils.isEmpty("bob");   // F
        StringUtils.isEmpty(" bob "); // F

        // isBlank|isNotBlank|isAnyBlank|isNoneBlank|isAllBlank
        StringUtils.isBlank(null);    // T
        StringUtils.isBlank("");      // T
        StringUtils.isBlank(" ");     // T
        StringUtils.isBlank("bob");   // F
        StringUtils.isBlank(" bob "); // F

        // trim|trimToNull|trimToEmpty
        StringUtils.trim(null);    // null
        StringUtils.trim("");      // ""
        StringUtils.trim(" ");     // ""
        StringUtils.trim("bob");   // "bob"
        StringUtils.trim(" bob "); // "bob"

        // truncate
        StringUtils.truncate(null, 4);          // null
        StringUtils.truncate(null, 4, 4);       // null
        StringUtils.truncate("username", 4);    // user
        StringUtils.truncate("username", 4, 4); // name

        // strip|stripToNull|stripToEmpty
        StringUtils.strip(null);    // null
        StringUtils.strip("");      // ""
        StringUtils.strip(" ");     // ""
        StringUtils.strip("bob");   // "bob"
        StringUtils.strip(" bob "); // "bob"
    }
}
