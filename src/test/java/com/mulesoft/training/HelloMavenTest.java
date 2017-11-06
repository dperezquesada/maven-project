package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {

	@Rule
	public DynamicPort myPort = new DynamicPort("http.port");
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	System.out.println("/n/nDynamic port in Test case 1-------- " + myPort.getNumber());
        runFlowAndExpect("mavenFlow", "Hello Mavens");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
