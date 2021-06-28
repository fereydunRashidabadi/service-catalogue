package ir.negah.bank.arch.corporate.servicecatalogue;

import lombok.extern.slf4j.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.*;
import org.springframework.boot.info.*;

import java.io.*;
import java.lang.invoke.*;
import java.util.*;

@SpringBootApplication
@Slf4j
public class ArchCorporateServicecatalogueApplication {

  static final Class<?> THIS = MethodHandles.lookup().lookupClass();

  public static void main(String[] args) throws IOException {
    BuildProperties buildProperties = getProperties();
    new SpringApplicationBuilder(THIS)
        .properties("spring.application.name:" + buildProperties.getName())
        .build()
        .run(args);
    log.info(
        "Application: {}, Version: {}", buildProperties.getName(), buildProperties.getVersion());
  }

  private static BuildProperties getProperties() throws IOException {
    Properties properties = new Properties();
    properties.load(THIS.getResourceAsStream("/META-INF/build-info.properties"));
    Set<Object> keySet = new HashSet<>(properties.keySet());
    for (Object key : keySet) {
      properties.put(key.toString().replace("build.", ""), properties.get(key));
      properties.remove(key);
    }
    return new BuildProperties(properties);
  }
}
