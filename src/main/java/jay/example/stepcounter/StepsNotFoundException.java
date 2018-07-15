package jay.example.stepcounter;


import org.springframework.http.*;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StepsNotFoundException extends RuntimeException {



	public StepsNotFoundException(String string) {
		// TODO Auto-generated constructor stub
		super("steps not found '" + string + "'.");
	}
}