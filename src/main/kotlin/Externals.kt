external fun alert(message: String)
//external functions don't have a body. It is available in the environment that this code will run on.

//open means can be extended
open class Animal {
    fun walk() {
        console.log("Walking")
    }
}

//: Extends
open class Dog : Animal() {
    fun bark() {
        console.log("Dog is Barking")
    }
}


// : in class means extends
// : in functions means return type
// : in variables and parameters in specifies type
open class Cat : Animal() {
    fun meow() {
        console.log("Cat is Meowing")
    }
}

// instantiating vs invoking
fun createAnimal(type: String): Animal {
    return if (type == "Dog") {
        Dog()
    } else {
        Cat()
    }
}

//    return listOf(Dog(), Cat()).random()


