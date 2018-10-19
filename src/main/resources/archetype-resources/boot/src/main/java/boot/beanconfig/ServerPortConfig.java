#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.boot.beanconfig;

import ${package}.config.properties.AppProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Configuration;

/**
 * @author jsk
 * @Date 2018/9/20 19:21
 */
@Configuration
public class ServerPortConfig implements EmbeddedServletContainerCustomizer{

    @Autowired
    private AppProperties appProperties;

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container){
        container.setPort(appProperties.getServerPort());
    }

}