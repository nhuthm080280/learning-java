package contract;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import org.apache.commons.io.FileUtils;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.IOException;

public class DownloadContract extends DefaultTask {
    String downloadDir = this.getProject().getBuildDir() + "/openapi/downloaded/";
    String bucketName = "nhuttest";
    String fileName = "v1.yml";

    @TaskAction
    void download() throws IOException {
        System.out.println("Start download contract");

        AmazonS3 s3client = AmazonS3ClientBuilder
            .standard()
            .build();

        S3Object s3object = s3client.getObject(bucketName, fileName);
        S3ObjectInputStream inputStream = s3object.getObjectContent();
        FileUtils.copyInputStreamToFile(
            inputStream,
            new File(downloadDir + fileName)
        );
    }
}
