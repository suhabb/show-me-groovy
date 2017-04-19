package show.me.groovy

import rewards.Product

class BootStrap {

    def init = { servletContext ->

        new Product(name: "Morning Blend", sku: "MB01", price: 12.09)
        new Product(name: "Dark Roast", sku: "MB02", price: 22.09)
    }
    def destroy = {
    }
}
