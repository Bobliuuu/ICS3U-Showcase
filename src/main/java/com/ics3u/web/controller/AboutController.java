// Import package
package com.ics3u.web.controller;

// Import spring boot framework
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * About controller will map about to a valid web bind and map it to the localhost application so HTTP requests can be sent. 
 */

@Controller // Specify controller type
public class AboutController {
	@GetMapping("/about") // Get a mapping to the /about tag of the website
	// Create a greeting constructor that requests the name parameter from the user
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Jerry") String name, Model model) {
		model.addAttribute("name", name); // Set the attribute of the model object (sent by the main web controller) to the name given to the user
		return "about"; // Return the information to the about tag and display it
	}
}
