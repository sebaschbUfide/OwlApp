package Owlearning.OwlApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class IndexController {

@GetMapping

     String indexTest(Model model){

     model.addAttribute("Test","Owllearning is testing");
    return "test Owl learning";
}



}
