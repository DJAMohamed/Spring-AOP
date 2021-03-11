package m2i.formation.spring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CustomLog {
	
	private Path logPath = Paths.get("error.log");
	
	@Before("@annotation(m2i.formation.spring.M2iLog)")
	public void log(JoinPoint joinPoint) {
		try {
			String str = joinPoint.getSignature().getName() +"\n";
			Files.write(logPath, str.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}	
