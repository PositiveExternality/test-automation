package br.com.rkoyanagui.setup;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cucumber.api.CucumberOptions;
import io.openbdt.setup.Setup;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/bdd/features"}, glue = {"br.com.rkoyanagui.steps.definition"})
@Component
@Qualifier("webSetup")
public class WebSetupImpl implements Setup{}
