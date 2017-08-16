package com.rewe.digital.cssyncservice.domain.model

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import org.junit.Assert
import org.junit.runner.RunWith
import org.junit.platform.runner.JUnitPlatform

@RunWith(JUnitPlatform::class)
object ExampleSpek: Spek( {
    
    describe("first group") {
        
        var number: Int = 1
        
        beforeGroup {
            number = 2
        }
        
        beforeEachTest {
            number = 3
        }
        
        on("first") {
            it("number should be valid") {
                assert(number == 3)
            }
            
            it("more than 1 it is valid") {
                assert(number > 0)
            }
        }
        
        on("more than 1 on is valid") {
            number = 4
            
            it("number should be valid") {
                assert(number == 4)
            }
        }
        
        afterEachTest {
            // do some stuff
        }
        
        afterGroup {
            // do some stuff
        }
    }
    
    describe("more than 1 descibe is valid") {
        var text: String = "1"
        
        beforeGroup {
            text = "2"
        }
        
        beforeEachTest {
            text = "3"
        }
        
        on("first") {
            it("text should be valid") {
                assert(text == "3")
            }
        }
    }
    
    xdescribe("this test should be ignored") {
        var text: String = "1"
        
        beforeGroup {
            text = "2"
        }
        
        beforeEachTest {
            text = "3"
        }
        
        on("first") {
            it("text should be valid") {
                assert(text == "3")
            }
        }
    }
})