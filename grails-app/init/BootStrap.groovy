import demo.Vehicle
import demo.Warehouse

class BootStrap {

    def init = { servletContext ->
        def v1 = new Vehicle(name: 'Vehicle One')
        v1.addToLocations(x: 4, y: 7)
        v1.addToLocations(x: 9, y: 5)
        v1.save()

        def w1 = new Warehouse(name: 'Warehouse One')
        w1.addToParts(name: 'Part One')
        w1.addToParts(name: 'Part Two')
        w1.save()
    }

    def destroy = {
    }
}
