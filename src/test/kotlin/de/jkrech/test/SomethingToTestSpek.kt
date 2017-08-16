package de.jkrech.test

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import org.junit.runner.RunWith
import org.junit.platform.runner.JUnitPlatform

@RunWith(JUnitPlatform::class)
object SomethingToTestSpek: Spek({
    
    describe("a test object") {
        
        val testObject = SomethingToTest()
        
        on("do some stuff") {
            
            val returnValue = testObject.doSomeStuff(2)
            
            it("should return 4") {
                assert(returnValue == 4)
            }
        }
        
    }
})