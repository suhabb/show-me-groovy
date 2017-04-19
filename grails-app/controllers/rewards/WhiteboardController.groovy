package rewards

import show.me.groovy.CalculationService

class WhiteboardController {

    def CalculationService calculationService

    def index() {}

    /* http://localhost:8080/whiteboard/variables*/

    def variables() {

        def myTotal = 1;
        render("Total:" + myTotal)
        render("<br/>Total:" + myTotal.class)
        myTotal = myTotal + 1
        render("New Total:" + myTotal)

        def firstName = "Mike"
        render("</br>Name:" + firstName)
        render("</br>Total:" + firstName.class)
        firstName = firstName + 1
        render("</br>New Name:" + firstName)

        def today = new Date("02/09/2015")
        render("</br>Date:" + today)
        render("</br>Total:" + today.class)
        today = today + 1
        render("</br>New Date:" + today)

    }
/*    http://localhost:8080/whiteboard/strings*/

    def strings() {

        def first = "Mike"
        def last = "Kelly"
        def points = 7
        def input = "HELLO"

        render "hey there $first you already have $points </br>"
        render "Today is, $first has ${first.length()} characters</br>"

        render "Lowercase the string:${input.toLowerCase()} </br>"
        render first + " " + last + points
    }

    /*http://localhost:8080/whiteboard/conditions/suhail/?first=mir&second=red*/

    def conditions() {
        def firstParam = params.id
        def queryParam = params.first
        def lastParam = params.second
        render "Hello first:" + firstParam + "-Second:" + queryParam + "-Third:" + lastParam
        render "<br/>Hello first params:" + firstParam
    }

    def service() {
        def welcome = calculationService.welcome()
        render welcome
    }
}
