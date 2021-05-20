package Adapter

data class Adapter(val adaptive: Adaptee) : ITarget {

    override fun GetRequest(): String {
        return adaptive.GetSpecificRequest();
    }
}