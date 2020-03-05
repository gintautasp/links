package ernadaslinks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PagesController {
	
	@Autowired
	private RusisKategorijuRepository rusis_kategoriju_repository;
	
    @RequestMapping("/")
    public String menu( Model model ) {
      	
        model.addAttribute("lst_menu", Menu.values() );    	
        return "redirect:/kategorijos";
    }	
	
    @GetMapping("/kategorijos")
    public String kategorijos( Model model ) {
    	
    	// List<RusisKategoriju> rusis_kategoriju = (List<RusisKategoriju>) rusis_kategoriju_repository.findAll();
    	model.addAttribute("rusis_kat", rusis_kategoriju_repository.findAll() );
        model.addAttribute("lst_menu", Menu.values() );    	
        return "kategorijos";
    }	

    @GetMapping("/nuorodos")
    public String nuorodos() {

        return "nuorodos";
    }    
}
