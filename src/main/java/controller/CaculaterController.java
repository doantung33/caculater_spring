package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/list")
public class CaculaterController {
    @GetMapping("")
    public ModelAndView modelAndView(){
        ModelAndView modelAndView=new ModelAndView("list");
        return modelAndView;
    }
    @PostMapping("")
    public ModelAndView caculater(@RequestParam int mot,int hai, String s){
        double rusult=0;
        switch (s){
            case "+":
                rusult=mot+hai;
                break;
            case "-":
                rusult=mot-hai;
                break;
            case "*":
                rusult =mot*hai;
                break;
            case "/":
                rusult=mot/hai;
                break;
        }
        ModelAndView modelAndView= new ModelAndView("list");
        modelAndView.addObject("rusult",rusult);
        modelAndView.addObject("s",s);
        return modelAndView;
    }
}
