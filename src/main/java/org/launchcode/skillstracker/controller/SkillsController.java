package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String homePage(){
        return "<h1> Skills Tracker </h1>" +
                "<h2> " +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li> Python </li>" +
                "<ol/>" +
                "</h2>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String form(){
        return
                "<form action='/results' method= 'post'>Name:" +
                        "<br>" +
                        "<input type= 'text' name= 'name'>" +
                        "<br>" +
                        "<label>My Favourite Language:" +
                        "<br>" +
                        "    <select name='language1'>" +
                        "<option value='0'>Select One</option>\"" +
                        "    <option value='lang1'>Java</option>" +
                        "    <option value='lang2'>JavaScript</option>" +
                        "    <option value='lang3'>Python</option>" +
                        "    </select>" +
                        "    </label>" +
                        "<br>" +


                        "<label>My Second Favourite Language:" +
                        "<br>" +
                        "<select name='language2'>" +
                        "<br>" +
                        "<option value='0'>Select One</option>\"" +
                        "    <option value='lang1'>Java</option>" +
                        "    <option value='lang2'>JavaScript</option>" +
                        "    <option value='lang3'>Python</option>" +
                        "    </select>" +
                        "    </label>" +
                        "<br>" +

                        "<label>My Third Favourite Language:" +
                        "<br>" +
                        "<select name='language3'>" +
                        "<br>" +
                        "<option value='0'>Select One</option>\"" +
                        "    <option value='lang1'>Java</option>" +
                        "    <option value='lang2'>JavaScript</option>" +
                        "    <option value='lang3'>Python</option>" +
                        "    </select>" +
                        "    </label>" +

                        "<br>" +
                        "<br>" +


                        "<input type= 'submit' value= 'Submit'>"+
                        "<form>";
    }

    @PostMapping("/results")
    @ResponseBody
    public String formSubmission(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<h1>" + name + "<br>" + languageSelector(language1) +"<br>" +  languageSelector(language2) +"<br>" + languageSelector(language3) + "</h1>";

    }

    public String languageSelector(String aLanguage){
        if (aLanguage.equals("lang1")){
            return "Java";
        } else if (aLanguage.equals("lang2")){
            return "JavaScript";
        } else {
            return "Python";
        }
    }
}