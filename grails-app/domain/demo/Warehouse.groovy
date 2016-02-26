package demo

import grails.rest.Resource

@Resource(uri='/warehouses', formats=['json'])
class Warehouse {
    String name
    static hasMany = [parts: Part]
}
