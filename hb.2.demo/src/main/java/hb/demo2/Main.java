package hb.demo2;

import java.nio.channels.ShutdownChannelGroupException;

import org.hibernate.cfg.CreateKeySecondPass;

import hb.demo2.model.HealthInsurance;
import hb.demo2.model.TermInsurance;
import hb.demo2.model.VehicleInsurance;

public class Main {

	public static void main(String[] args) {
		
		HealthInsurance health = new HealthInsurance();
		TermInsurance term = new TermInsurance();
		VehicleInsurance vehicle = new VehicleInsurance();
		
		health.setId(1);
		health.setInsured("Rahul");
		health.setHealthPlan("Complete");
		health.setSumInsured(1000000);
		
		health.setId(2);
		health.setInsured("Anwesa");
		health.setHealthPlan("Yearly");
		health.setSumInsured(2000000);
		
		health.setId(3);
		health.setInsured("X");
		health.setHealthPlan("Monthly");
		health.setSumInsured(30000);
		
        InsuranceDao insDao = new InsuranceDao();
        
        insDao.create(health);
        insDao.create(term);
        insDao.create(vehicle);
        
        InsuranceDao.shutdown();
		
		
		
		
	}
}
