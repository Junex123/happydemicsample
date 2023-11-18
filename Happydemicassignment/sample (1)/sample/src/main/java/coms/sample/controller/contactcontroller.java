package coms.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import coms.sample.model.contactus;
import coms.sample.repository.contactrepo;


@CrossOrigin(origins = "*")
@RestController
public class contactcontroller {

	@Autowired
	private contactrepo contactrepo;
	
	 @PostMapping("/contactus")
		public contactus createcontactus(@RequestBody contactus contactus) {
			return contactrepo.save(contactus);
		}
	 @GetMapping("/viewcontact")
		public List<contactus> getAllcontacts() {
			return contactrepo.findAll();
		}
	
}
