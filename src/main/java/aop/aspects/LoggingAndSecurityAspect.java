package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Before("execution(* get*())")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал");
    }

    @Before("execution(* get*())")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
    }

    @Before("execution(public void returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
    }
}
