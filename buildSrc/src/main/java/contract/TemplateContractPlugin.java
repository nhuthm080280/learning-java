package contract;

import com.google.common.collect.ImmutableMap;
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
        project.task(ImmutableMap.of("type", ContractGeneration.class)
            , "generateContract");
    }

}
