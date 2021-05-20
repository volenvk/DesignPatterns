package Adapter


fun main(args: Array<String>) {
    val run = AdapterTest()
    run.runTest()
}

class AdapterTest {

    fun runTest() {
        val adaptee = Adaptee()
        val target: ITarget = Adapter(adaptee)

        println(target.GetRequest())
    }
}