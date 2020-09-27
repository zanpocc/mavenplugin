package com.zanpoc.it;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "hello")
public class MyMojo extends AbstractMojo {

    @Parameter(property = "project.version")
    private String version;

    @Parameter(property = "line.separator")
    private String lineSeparator;

    public void execute() {
        System.out.println(version);
        System.out.println(lineSeparator);
    }

}