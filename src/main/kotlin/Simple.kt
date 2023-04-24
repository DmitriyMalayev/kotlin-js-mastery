import kotlinx.browser.document
import kotlinx.dom.appendText
import org.w3c.dom.HTMLButtonElement


fun main() {
    val animal = createAnimal("Dog") as Dog
    animal.bark()

    val root = document.getElementById("root")
//    val statement = "Hello World"
//    console.log(root)
//    document.getElementById("root")?.appendText(statement)
    val button = document.createElement("button") as HTMLButtonElement
//
    button.innerHTML = "click me"
    button.onclick = {
//        console.log("Clicked")
        alert("Clicked Alert")
    }
    root?.appendChild(button)
}
