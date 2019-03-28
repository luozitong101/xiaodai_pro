package lzt.xiaodai.cn.common.aspect2;

import lzt.xiaodai.cn.tool.JacksonUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @author luoyong
 * @Date: 2019/3/27 00:16
 * @Description: 对controller层 添加请求入参和返回值得日志拦截
 */
@Component
@Aspect
public class LogAspect {

    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
   @Pointcut("execution(public * lzt.xiaodai.cn.controller..*.*(..))")
   public void webLog(){}
   @Before("webLog()")
    public void before(JoinPoint joinPoint){
       ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
       HttpServletRequest request = attributes.getRequest();

       Object[] args = joinPoint.getArgs();
       Object[] args2 = new Object[args.length];
       MethodSignature signature = (MethodSignature)joinPoint.getSignature();
       Method method = signature.getMethod();
       int i= 0;
       for (Object o : args){
          if (!(o instanceof MultipartFile)){
             args2[i++] = o;
          }
       }
       logger.info("请求入数:{} path:{}, {}.{} ",JacksonUtil.BeanToJson(args2),request.getRequestURL().toString(),method.getDeclaringClass().getName(),method.getName());

   }
   @AfterReturning(pointcut = "webLog()",returning = "ret")
    public void afterReturn(JoinPoint joinPoint,Object ret){
       ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
       HttpServletRequest request = attributes.getRequest();
       MethodSignature signature = (MethodSignature)joinPoint.getSignature();
       Method method = signature.getMethod();
       logger.info("请求出参:{} path:{}, {}.{}", JacksonUtil.BeanToJson(ret),request.getRequestURL().toString(),method.getDeclaringClass().getName(),method.getName());
   }
}
