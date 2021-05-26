package Adapter

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class AdapterTest {

    @Test
    fun runTest() {
        val adaptee = Adaptee()
        val target: ITarget = Adapter(adaptee)

        assertEquals("My Specific request.", target.getRequest())
    }
}