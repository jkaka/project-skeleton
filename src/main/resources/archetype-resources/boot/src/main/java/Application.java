#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.${artifactId}.SpringApplication;
import org.springframework.${artifactId}.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("${package}.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
