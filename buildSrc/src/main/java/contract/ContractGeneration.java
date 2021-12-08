package contract;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.util.HashSet;
import java.util.Set;

public class ContractGeneration extends DefaultTask {
    String projectDir = this.getProject().getProjectDir().getAbsolutePath();
    String tempOutputDirectory = projectDir + "/generated/javaClient";
    String contractPath = "/contracts/example/openapi/template/v1.yaml";
    String inputDir = projectDir + contractPath;
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
        final ClientOptInput clientOptInput = codegenConfigurator.toClientOptInput();
        new DefaultGenerator().opts(clientOptInput).generate();
    }
}
