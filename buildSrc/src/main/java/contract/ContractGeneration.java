package contract;

import org.gradle.api.DefaultTask;
import org.gradle.api.plugins.JavaPluginConvention;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.TaskAction;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ContractGeneration extends DefaultTask {
    String tempOutputDirectory = this.getProject().getBuildDir() + "/openapi/generated";
//    String tempOutputDirectory = this.getProject().getProjectDir() + "/src/main/java/temp";
    String contractPath = "/openapi/downloaded/v1.yml";
    //    String inputDir = this.getProject().getBuildDir() + contractPath;
    String inputDir = this.getProject().getProjectDir() + "/contracts/v1.yml";

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
        codegenConfigurator.setPackageName("phoenix");
        codegenConfigurator.setApiPackage("api");
        codegenConfigurator.setModelPackage("model");
        codegenConfigurator.setInvokerPackage("invoker");
//        codegenConfigurator.setIgnoreFileOverride(this.getProject().getProjectDir() + "/buildSrc/src/main/resources/ignores/.openapi-generator-ignore");

        final ClientOptInput clientOptInput = codegenConfigurator.toClientOptInput();
        new DefaultGenerator().opts(clientOptInput).generate();
    }
}
