package contract;

import org.gradle.api.tasks.TaskAction;

public class ContractGeneration {
    @TaskAction
    void generateContract(){
        System.out.println("Start generate contract");
    }
}
