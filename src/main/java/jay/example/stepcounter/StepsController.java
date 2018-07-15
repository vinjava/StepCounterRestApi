package jay.example.stepcounter;


import java.net.URI;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class StepsController {

	@Autowired
	private StepsRepository stepsRepository;

	@GetMapping("/steps")
	public List<Steps> retrieveAllSteps() {
		System.out.println("inside the proram");
		return stepsRepository.findAll();
	}
	@GetMapping("/total")
	public int retrieveAllTotal() {
		int total;
		total = 0;
		List<Steps> s1 = stepsRepository.findAll();
		for (int i = 0; i < s1.size(); i++) {
			total = total + s1.get(i).getstepsCount(); 
			
		}
		return total;
	}
	@GetMapping("/stepsDays/{startTime}")
	public List<Steps> createSteps(@PathVariable("startTime") String t1)  {
		System.out.println("t1 value:"+ t1);
		String t2;
		
		int total =0;
		
		
		
		
		List<Steps> s1 = stepsRepository.findAll();
		List<Steps> s2= new ArrayList<Steps>();
		
		
		
	/*	Date date = new Date();
		date.setTime(t1.getTime());
		String formattedDate = new SimpleDateFormat("yyyyMMdd").format(date);*/
		
	/*DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

LocalDateTime dateTime = LocalDateTime.parse(t1, formatter);
System.out.println("date time val " + dateTime);* */
			
			for (int i = 0; i < s1.size(); i++) {
				t2= s1.get(i).getstartTime().toString();
				System.out.println("t2 value" + t2);
				System.out.println("t2 substring" + t2.substring(0,10));
				System.out.println("t1 substring" + t1.substring(0,10));
				
				if (t2.substring(0,10).contentEquals(t1.substring(0,10)))
				{
				total = total + s1.get(i).getstepsCount();
				System.out.println("inside if");
				System.out.println(s1.get(i));
				Steps sz = new Steps();
				sz = s1.get(i);
				s2.add(sz);
						
				}
				/*Steps sz = new Steps();
				s2.remove(s1.get(i -1 ));
				s1.get(i-1).stepsCount = total;
				System.out.println(s1.get(i));
				s2.add( s1.get(i)); */
				
				
			} 
			
			return s2;
			

	}
	
	@GetMapping("/stepMonths/{startTime}")
	public List<Steps> stepMonths(@PathVariable("startTime") String t1)  {
		System.out.println("t1 value:"+ t1);
		String t2;
		
		int total =0;
		
		
		
		
		List<Steps> s1 = stepsRepository.findAll();
		List<Steps> s2= new ArrayList<Steps>();
		
		
		
	/*	Date date = new Date();
		date.setTime(t1.getTime());
		String formattedDate = new SimpleDateFormat("yyyyMMdd").format(date);*/
		
	/*DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

LocalDateTime dateTime = LocalDateTime.parse(t1, formatter);
System.out.println("date time val " + dateTime);* */
			
			for (int i = 0; i < s1.size(); i++) {
				t2= s1.get(i).getstartTime().toString();
				System.out.println("t2 value" + t2);
				System.out.println("t2 substring" + t2.substring(0,7));
				System.out.println("t1 substring" + t1.substring(0,7));
				
				if (t2.substring(0,7).contentEquals(t1.substring(0,7)))
				{
				total = total + s1.get(i).getstepsCount();
				System.out.println("inside if");
				System.out.println(s1.get(i));
				Steps sz = new Steps();
				sz = s1.get(i);
			//	Steps.setTotal(total);
				s2.add(sz);
						
				}
				/*Steps sz = new Steps();
				s2.remove(s1.get(i -1 ));
				s1.get(i-1).stepsCount = total;
				System.out.println(s1.get(i));
				s2.add( s1.get(i)); */
				
				
			} 
			
			return s2;
			

	}
	
	@GetMapping("/stepYears/{startTime}")
	public List<Steps> stepYears(@PathVariable("startTime") String t1)  {
		System.out.println("t1 value:"+ t1);
		String t2;
		
		int total =0;
		
		
		
		
		List<Steps> s1 = stepsRepository.findAll();
		List<Steps> s2= new ArrayList<Steps>();
		
		
		
	/*	Date date = new Date();
		date.setTime(t1.getTime());
		String formattedDate = new SimpleDateFormat("yyyyMMdd").format(date);*/
		
	/*DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

LocalDateTime dateTime = LocalDateTime.parse(t1, formatter);
System.out.println("date time val " + dateTime);* */
			
			for (int i = 0; i < s1.size(); i++) {
				t2= s1.get(i).getstartTime().toString();
				System.out.println("t2 value" + t2);
				System.out.println("t2 substring" + t2.substring(0,4));
				System.out.println("t1 substring" + t1.substring(0,4));
				
				if (t2.substring(0,4).contentEquals(t1.substring(0,4)))
				{
				total = total + s1.get(i).getstepsCount();
				System.out.println("inside if");
				System.out.println(s1.get(i));
				Steps sz = new Steps();
				sz = s1.get(i);
			//	Steps.setTotal(total);
				s2.add(sz);
						
				}
				/*Steps sz = new Steps();
				s2.remove(s1.get(i -1 ));
				s1.get(i-1).stepsCount = total;
				System.out.println(s1.get(i));
				s2.add( s1.get(i)); */
				
				
			} 
			
			return s2;
			

	}
	

	@GetMapping("/steps/{id}")
	public Steps retrieveSteps(@PathVariable long id) {
		Optional<Steps> steps = stepsRepository.findById(id);

		if (!steps.isPresent())
			throw new StepsNotFoundException("id-" + id);

		return steps.get();
	}

	@DeleteMapping("/steps/{id}")
	public void deleteSteps(@PathVariable long id) {
		stepsRepository.deleteById(id);
	}

	@PostMapping("/steps")
	public ResponseEntity<Object> createSteps(@RequestBody Steps steps) {
		Steps savedSteps = stepsRepository.save(steps);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedSteps.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/steps/{id}")
	public ResponseEntity<Object> updateSteps(@RequestBody Steps steps, @PathVariable long id) {

		Optional<Steps> stepsOptional = stepsRepository.findById(id);

		if (!stepsOptional.isPresent())
			return ResponseEntity.notFound().build();

		steps.setId(id);
		
		stepsRepository.save(steps);

		return ResponseEntity.noContent().build();
	}
	
	
	
}
