package demo.jaxrs.collector;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import demo.jaxrs.server.Patient;

public class PatientCollector implements Collector<Patient, Patient, Patient> {

	
	@Override
	public Supplier<Patient> supplier() {
		//return this.supplier();
		
		return Patient::new;
	}

	@Override
	public BiConsumer<Patient, Patient> accumulator() {
		
		return(p1,p2)->{
			
		};
		 /* return (s, e) -> { if (e.role.contains("Lead")) s.leadEmployeeCount++; if
		  (e.department.contains("Sales")) s.salesDepartmentEmployeeCount++; };*/
		 
	}

	@Override
	public BinaryOperator<Patient> combiner() {
		return(p1,p2) ->{return p1;};
		/*
		 * return (_this, other) -> {
		 * 
		 * _this.leadEmployeeCount = _this.leadEmployeeCount + other.leadEmployeeCount;
		 * _this.salesDepartmentEmployeeCount = _this.salesDepartmentEmployeeCount +
		 * other.salesDepartmentEmployeeCount; return _this; };
		 */
	}

	@Override
	public Function<Patient, Patient> finisher() {
		return (e -> e);
	}

	@Override
	public Set<Characteristics> characteristics() {
		return null;
		//return Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.IDENTITY_FINISH));
	}
}
