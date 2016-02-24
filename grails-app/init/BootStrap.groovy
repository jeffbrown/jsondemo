import demo.Vehicle

class BootStrap {

    def init = { servletContext ->
        def v1 = new Vehicle(name: 'Vehicle One')
        v1.addToLocations(x: 4, y: 7)
        v1.addToLocations(x: 9, y: 5)
        v1.save()
    }

    def destroy = {
    }
}
