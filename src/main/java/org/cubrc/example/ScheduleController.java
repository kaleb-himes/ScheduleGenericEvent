package org.cubrc.example;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import static javax.swing.text.StyleConstants.ModelAttribute;

/**
 * @author Robert Weber
 */
@Controller
public class ScheduleController {
//	private static final Logger logger = LoggerFactory
//			.getLogger(CustomerController.class);

	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public ModelAndView Schedule() {
		return new ModelAndView("events", "Event", new Event());
	}
	@RequestMapping(value ="/addEvent", method = RequestMethod.POST)
	public String eventSubmit(@Valid @ModelAttribute("Event") Event event, BindingResult result, Model model) {
		if (result.hasErrors()){
			return "/events";
		} else if (!EventChecker.checkDate(event)){
			return "/events";
		}
			String day = event.getDay();
			String month = event.getMonth();
			String year = event.getYear();
			String title = event.getTitle();
			String description = event.getDescription();
			System.out.print(day);

			//TODO
			// build string for query
			// build query with event data - query.insertEvent()
			// add data to "events" attribute
			return "result";
		
	}
	@RequestMapping(value="/eventsList")
	public String eventsList(Model model) {
		// TODO
		// build query and get selected events
		// parse incoming events data
		// add data to "events" attribute
		return "result";
	}
}