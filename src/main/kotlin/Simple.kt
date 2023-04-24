import kotlinx.browser.document
import kotlinx.dom.appendText
import org.w3c.dom.HTMLButtonElement
import kotlin.js.Date


fun main() {
    val animal = createAnimal("Dog") as Dog
    animal.bark()

    val root = document.getElementById("root")
//    val statement = "Hello World"
//    console.log(root)
//    document.getElementById("root")?.appendText(statement)
    val button = document.createElement("button") as HTMLButtonElement
//
//    button.innerHTML = "click me"
    button.innerHTML = format(Date(2014, 1,11), "yyyy-MM-dd")

    button.onclick = {
//        console.log("Clicked")
        alert("Clicked Alert")
    }
    root?.appendChild(button)
}
