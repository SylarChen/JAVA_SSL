package suiteinstaller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.*;

/**
 * Created by Administrator on 2016/9/26 0026.
 */

//http://stackoverflow.com/questions/31459838/spring-boot-dependency-injection
@Component
public class MyConfig {

    private String confJson;

    public MyConfig() throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("myconf.json");
        InputStream inputStream = classPathResource.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        StringBuffer sb = new StringBuffer();
        String line;
        while((line = br.readLine()) != null){
            sb.append(line);
        }
        this.confJson = sb.toString();
        br.close();
        inputStream.close();
    }

    public String getConf() {
        return confJson;
    }
}
