package com.hotels.meetup

import cucumber.api.scala.{EN, ScalaDsl}
import org.scalatest._

/**
  * Created by Garma on 23/10/2016.
  */
class GherkinStepDefs extends ScalaDsl with Matchers with EN{
    var attendedCucumberMeetup = false
    var iHaveToTestABusinessStory = false

    Given("""^I attended the Cucumber meetup$"""){ () =>
      attendedCucumberMeetup = true
    }

    When("""^I test the business story$"""){ () =>
      iHaveToTestABusinessStory = true
    }

    Then(
      """^I should use Cucumber to verify the acceptance criteria$"""
        ){ () =>
      attendedCucumberMeetup shouldBe true
      iHaveToTestABusinessStory shouldBe true
    }
}



//var sum = 0
//var firstNumber = 0
//var secondNumber= 0
//
//Given("""^I have (\d+) as first number$"""){ (number:Int) =>
//firstNumber = number
//}
//
//And("""^I have (\d+) as second number$"""){ (number:Int) =>
//secondNumber = number
//}
//
//When("""^I sum these number$"""){ () =>
//sum = firstNumber + secondNumber
//}
//
//Then("""^The result should be (\d+)$"""){ (expectedSum:Int) =>
//sum shouldBe expectedSum