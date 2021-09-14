package application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ResquestMapping("/livro")
public class LivroControllers {
@Autowired
@ResquestMapping("/list")
public String list(Model model){
    model.addAttribute("livros");
    return"list.jsp";
}


}
