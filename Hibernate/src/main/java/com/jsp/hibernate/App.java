package com.jsp.hibernate;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Session;

import com.jsp.DTO.ApplicationDto;
import com.jsp.Entity.ApplicationEntity;
import com.jsp.Entity.RegisterationDetails;
import com.jsp.Entity.Veichel;
import com.jsp.repository.Apphqlrepository;
import com.jsp.repository.ApplicationRepository;
import com.jsp.repository.VehicleRepository;

public class App {
	public static void main(String[] args) {
		Veichel veichel = new Veichel();
		veichel.setName("bajaj");
		veichel.setModalNumber("AP9618");
		veichel.setEngineNumber("12Fahj65");
		veichel.setPrice("5lakhs");
		RegisterationDetails details = new RegisterationDetails();
		details.setRegDate("2022-03-12");
		details.setRegnumber("4042");
		veichel.setDetails(details);
		VehicleRepository repository = new VehicleRepository();
		repository.saveOrUpdate(veichel);

//---------------------------------------------------------------------------------------		

		ApplicationEntity applicationEntity = new ApplicationEntity();
		// applicationEntity.setAltKey(123);
		applicationEntity.setApplicationName("facebook");
		applicationEntity.setUrl("http:/www.insta");
		applicationEntity.setPassword("insta123");
		applicationEntity.setApplicationType("govt App");
		applicationEntity.setUsername("anjan");
		Apphqlrepository rep = new Apphqlrepository();
		System.out.println(rep.findByApplicationId("insta"));
		// repository.saveOrUpdate(applicationEntity);
		// System.out.println(applicationEntity2);
		// System.out.println(repository.getById(124));
		// ApplicationDto dto = new ApplicationDto();
		// dto.setAltKey(123);
		// dto.setUsername("ashok");
		// dto.setPassword("12345");
		// repository.update(dto);
		// repository.delete(124);

		/*
		 * Apphqlrepository apphqlrepository = new Apphqlrepository();
		 * List<ApplicationEntity> list = apphqlrepository.findAll(); list.forEach(each
		 * -> { System.out.println(each); });
		 * 
		 * list.stream().filter(each->each.getApplicationName().equalsIgnoreCase("anjan"
		 * )).collect(Collectors.toList());
		 * 
		 * //
		 * list.stream().filter(each->each.getApplicationName().equalsIgnoreCase("anjan)
		 * ).findAny().orElse(null);
		 */

		// Apphqlrepository apphqlrepository = new Apphqlrepository();
		/*
		 * ApplicationEntity findByApplicationId =
		 * apphqlrepository.findByApplicationId("insta");
		 * System.out.println(findByApplicationId);
		 */

	}

}
