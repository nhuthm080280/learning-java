package contract;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

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
    }

}
