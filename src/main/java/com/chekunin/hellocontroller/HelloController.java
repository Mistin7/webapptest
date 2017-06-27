package com.chekunin.hellocontroller;

//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Created by chekuninalexey on 20.06.17.
// */
//public class HelloController extends AbstractController {
//    @Override
//    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        ModelAndView modelAndView = new ModelAndView("HelloPage");
//        modelAndView.addObject("welcomeMessage", "Hi user, welcome to the first pring MVC application");
//
//        return modelAndView;
//    }
//}

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/greet")
public class HelloController {

    @RequestMapping("/welcome/{countryName}/{userName}")
    public ModelAndView helloWorld(@PathVariable Map<String, String> pathVars) {
        String name = pathVars.get("userName");
        String country = pathVars.get("countryName");

        ModelAndView model = new ModelAndView("HelloPage");
        model.addObject("msg", "Hello, "+name+", you are from "+country);

        return model;
    }

    @RequestMapping("/hi")
    public ModelAndView hiWorld() {

        ModelAndView model = new ModelAndView("HelloPage");
        model.addObject("msg", "Hi World");

        return model;
    }
}