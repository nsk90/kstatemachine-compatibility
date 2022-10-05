import ru.nsk.kstatemachine.createStateMachine
import ru.nsk.kstatemachine.initialState

fun main(args: Array<String>) {
    println("Hello")

    val machine = createStateMachine {
        initialState()
    }
}