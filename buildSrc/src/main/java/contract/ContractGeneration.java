package contract;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class ContractGeneration {
    @TaskAction
    void generateContract(){
        System.out.println("Start generate API java");
        CodegenConfigurator codegenConfigurator = new CodegenConfigurator();
        String swaggerDefLocation = "./contracts/example/openapi/template/v1.yaml";
        String tempOutputDirectory = "/Users/macintoshhd/workspace/java/new/learning-java/generated/javaClient";
        Set<String> languages = new HashSet<>();
        languages.add("java");
        codegenConfigurator.setGeneratorName("java");
        codegenConfigurator.setInputSpec(swaggerDefLocation);
        codegenConfigurator.setOutputDir(tempOutputDirectory);
        codegenConfigurator.setLanguageSpecificPrimitives(languages);
        final ClientOptInput clientOptInput = codegenConfigurator.toClientOptInput();
        new DefaultGenerator().opts(clientOptInput).generate();
    }
}
