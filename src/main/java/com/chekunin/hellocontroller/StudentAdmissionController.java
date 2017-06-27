package com.chekunin.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by chekuninalexey on 21.06.17.
 */

@Controller
public class StudentAdmissionController {
    @RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
    public ModelAndView getAdmissionForm() {
        ModelAndView model = new ModelAndView("AdmissionForm");
        return model;
    }

    @RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@RequestParam(value="studentName", defaultValue="Mr. ???") String name, @RequestParam("studentHobby") String hobby) {

        ModelAndView model = new ModelAndView("AdmissionSuccess");
        model.addObject("msg", "Details submitted by you:: Name: " + name + " , Hobby: " + hobby);
        return model;
    }
}
