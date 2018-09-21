#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.boot.beanconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by springyu on 17-7-20.
 */
@Configuration
public class WebBeanConfig extends WebMvcConfigurerAdapter {

}
