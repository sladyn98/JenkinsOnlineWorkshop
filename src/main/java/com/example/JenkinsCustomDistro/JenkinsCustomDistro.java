package com.example.JenkinsCustomDistro;

import java.io.File;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import io.jenkins.tools.warpackager.lib.config.Config;
import io.jenkins.tools.warpackager.lib.impl.Builder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsCustomDistro {
	public static final String DEFAULT_TMP_DIR_NAME = "tmp";
	public static final String DEFAULT_VERSION = "3.0-SNAPSHOT";


	public static void main(String[] args) {
		SpringApplication.run(JenkinsCustomDistro.class, args);
		System.out.println("Starting custom war service");
		Config cfg = null;
		try {
			cfg = Config.loadDemoConfig();
		} catch (IOException e) {
			System.out.println("Error in reading the sample yml");
			e.printStackTrace();
		}

		cfg.buildSettings.setTmpDir(new File(DEFAULT_TMP_DIR_NAME));
		cfg.buildSettings.setVersion(DEFAULT_VERSION);
		try {
			new Builder(cfg).build();
		} catch (IOException e) {
			System.out.println("The Execution was interrupted due to IO Failure.");
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("The execution was interrupted");
			e.printStackTrace();
		}
	}
}

