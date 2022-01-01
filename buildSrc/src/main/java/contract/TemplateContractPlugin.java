package contract;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaPluginConvention;
import org.gradle.api.tasks.SourceSet;
import org.openapitools.codegen.CodegenConstants;

import java.util.Arrays;
import java.util.Collections;

public class TemplateContractPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
//        ContractGeneration extension = project.getExtensions()
//            .create("contractGeneration", ContractGeneration.class);
//        project.task("generateContract")
//            .doLast(task -> {
//                extension.generateContract();
//            });
//        project.task(ImmutableMap.of("type", DownloadContract.class)
//            , "downloadContract");
//
//        project.task(ImmutableMap.of("type", ContractGeneration.class)
//            , "generateContract");
        project.getTasks().register("downloadContract", DownloadContract.class, task -> {
            task.setGroup("contract");
        });
        project.getTasks().register("generateContract", ContractGeneration.class, task -> {
            task.setGroup("contract");
        });
        project.getTasks().getByName("compileJava").dependsOn("downloadContract");
        project.getTasks().getByName("generateContract").dependsOn("downloadContract");

        JavaPluginConvention javaConvention = project.getConvention().getPlugin(JavaPluginConvention.class);
        SourceSet main = javaConvention.getSourceSets().getByName(SourceSet.MAIN_SOURCE_SET_NAME);
        main.getJava().srcDir(Collections.singleton(
            project.getBuildDir() + "/openapi/generated/src/main/java"
        ));
    }

}
