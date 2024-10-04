package main

import "fmt"

var helloMessage = "Hello, World!"
var goodbyeMessage = "Goodbye, World!"

func main() {
    sayHello()
    sayGoodbye()
}

func sayHello() {
    fmt.Println(helloMessage)
}

func sayGoodbye() {
    fmt.Println(goodbyeMessage)
}

func SetHelloMessage(message string) {
    helloMessage = message
}

func SetGoodbyeMessage(message string) {
    goodbyeMessage = message
}