package m2i.formation.spring;

import org.aspectj.lang.ProceedingJoinPoint;

public class Spectateur {
	public void assoir(ProceedingJoinPoint joinPoint) {
		System.out.println("Les spectateurs s'assoient");
		
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Les spectateurs se lèvent");
	}

	public void applaudir() {
		System.out.println("Les spectateurs applaudissent");
	}

	public void rembourser(Exception ex) {
		System.out.println("BOUHHHHH, remboursez !!!! [" + ex.getMessage() + "]");
	}
}
