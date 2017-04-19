package show.me.groovy

import grails.transaction.Transactional

@Transactional
class CalculationService {

    def welcome() {
        def welcome = "Welcome to the service"
    }
}
