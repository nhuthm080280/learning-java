package contract;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;
import org.openapitools.codegen.languages.JavaClientCodegen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContractGeneration extends DefaultTask {
    String tempOutputDirectory = this.getProject().getBuildDir() + "/openapi/generated";
    String contractPath = "/openapi/downloaded/v1.yml";
    String inputDir = this.getProject().getBuildDir() + contractPath;
//    String inputDir = this.getProject().getProjectDir() + "/contracts/v1.yml";

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
        codegenConfigurator.setTemplateDir(this.getProject().getProjectDir()
            + "/buildSrc/src/main/resources/openapi.templates.java/libraries.resttemplate");
//        codegenConfigurator.setPackageName("phoenix");
//        codegenConfigurator.setApiPackage("api");
//        codegenConfigurator.setModelPackage("model");
//        codegenConfigurator.setInvokerPackage("invoker");
//        codegenConfigurator.setLogToStderr(true);
//        Map<String, Object> addtionalProperties = new HashMap<>();
//        addtionalProperties.put("dateLibrary", "java8");

//        codegenConfigurator.setAdditionalProperties(addtionalProperties);

//        codegenConfigurator.setIgnoreFileOverride(this.getProject().getProjectDir() + "/buildSrc/src/main/resources/ignores/.openapi-generator-ignore");
        CodegenConfig codegenConfig = new JavaClientCodegen();
        codegenConfig.supportingFiles();
//        codegenConfig.additionalProperties().put(CodegenConstants.SOURCE_FOLDER,
//            this.getProject().getBuildDir() + "/openapi/generated/src/main/java");
        codegenConfig.additionalProperties().put(CodegenConstants.MODEL_PACKAGE, "model");
        codegenConfig.additionalProperties().put(CodegenConstants.API_PACKAGE, "api");
        codegenConfig.additionalProperties().put(CodegenConstants.INVOKER_PACKAGE, "invoker");
        codegenConfig.additionalProperties().put("dateLibrary","java8");
        codegenConfig.additionalProperties().put("library","resttemplate");
        codegenConfig.additionalProperties().put("serializationLibrary","jackson");
        codegenConfig.setOutputDir(this.getProject().getBuildDir().getAbsolutePath() + "/openapi/generated");
        final ClientOptInput clientOptInput = codegenConfigurator.toClientOptInput();
        clientOptInput.config(codegenConfig);
        new DefaultGenerator().opts(clientOptInput).generate();
    }
}
