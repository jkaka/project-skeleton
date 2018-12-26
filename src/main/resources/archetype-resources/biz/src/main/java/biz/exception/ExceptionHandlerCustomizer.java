#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.biz.exception;

import com.kaka.common.utils.exception.WebExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author jsk
 * @Date Wed Dec 19 13:56:31 CST 2018
 */
@RestControllerAdvice
public class ExceptionHandlerCustomizer extends WebExceptionHandler {
}
