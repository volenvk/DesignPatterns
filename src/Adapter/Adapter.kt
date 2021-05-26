package Adapter

data class Adapter(val adaptive: Adaptee) : ITarget {

    override fun getRequest(): String {
        return adaptive.getSpecificRequest()
    }
}