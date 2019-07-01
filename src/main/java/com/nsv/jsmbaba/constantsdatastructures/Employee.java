package com.nsv.jsmbaba.constantsdatastructures;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {
    private String name;
    private String companyName;
    private List<String> availableLocations;
    private Map<String, String> availableLocationsMap;
    private Map<String, String> preferredLocationsMap;
}
