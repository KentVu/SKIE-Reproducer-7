package com.github.kentvu.skie7

import io.mockative.Mock
import io.mockative.classOf
import io.mockative.given
import io.mockative.mock
import io.mockative.time
import io.mockative.verify
import kotlin.test.Test
import kotlin.test.assertEquals

class MockativeTest {
    @Mock
    val platform = mock(classOf<Platform>())

    @Test
    fun testMockative() {
        given(platform).getter(platform::name)
            .whenInvoked()
            .then { "Mockative" }
        println(platform.name)
        assertEquals("Mockative", platform.name)
        verify(platform).getter(platform::name)
            .wasInvoked(exactly = 2.time)
            //.`with`(eq("Mockative"))
        //every { platform.name }
    }
}