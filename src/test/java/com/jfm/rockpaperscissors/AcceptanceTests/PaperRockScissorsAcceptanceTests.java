package com.jfm.rockpaperscissors.AcceptanceTests;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = ".",format = {"pretty", "html:target/cucumber","json:target/paper-rock-scissors.json"},glue = {"com.jfm" })

public class PaperRockScissorsAcceptanceTests {
}
