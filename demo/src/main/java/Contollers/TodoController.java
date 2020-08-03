package Contollers;

import Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller


@RequestMapping("/todo")
    public class TodoController {

    private TodoRepository repository;
@Autowired
public TodoController(TodoRepository repository){
    this.repository=repository;
}


@RequestMapping(value={"/", "/list"})
public String list(Model model){
    model.addAttribute("Wake up");
    model.addAttribute("Start the day");
    model.addAttribute("Eat breakfast");
    model.addAttribute("Play with the cat");
return "view";

}
}
