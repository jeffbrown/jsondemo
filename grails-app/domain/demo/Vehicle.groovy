package demo

import grails.rest.Resource

@Resource(uri='/vehicles', formats=['json', 'xml'])
class Vehicle {
    String name
    List locations
    static hasMany = [locations: Location]
}
