package com.group.sahitest.demo.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/test/resources/features"
,glue = "com.group.sahitest.demo.definitions"
,tags = "@comprar_libros"
,monochrome = true
,snippets = SnippetType.CAMELCASE
)
public class RunnerSahitest {

}
