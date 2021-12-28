package contract;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.util.HashSet;
import java.util.Set;

public class ContractGeneration extends DefaultTask {
    String tempOutputDirectory = this.getProject().getBuildDir() + "/generated/javaClient";
    String contractPath = "/openapi/downloaded/v1.yml";
    String inputDir = this.getProject().getBuildDir() + contractPath;
    @TaskAction
    void generateContract() {
        System.out.println("Start generate API java");
        CodegenConfigurator codegenConfigurator = new CodegenConfigurator();
        Set<String> languages = new HashSet<>();
        languages.add("java");
        codegenConfigurator.setGeneratorName("java");
        codegenConfigurator.setInputSpec(inputDir);
        codegenConfigurator.setOutputDir(tempOutputDirectory);
        codegenConfigurator.setLanguageSpecificPrimitives(languages);
        codegenConfigurator.setTemplateDir(this.getProject().getProjectDir() + "/buildSrc/src/main/resources/openapi.templates.java/libraries.resttemplate");
        final ClientOptInput clientOptInput = codegenConfigurator.toClientOptInput();
        new DefaultGenerator().opts(clientOptInput).generate();
    }
}
