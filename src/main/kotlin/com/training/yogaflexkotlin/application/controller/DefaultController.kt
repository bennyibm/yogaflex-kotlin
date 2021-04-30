package com.training.yogaflexkotlin.application.controller

import com.training.yogaflexkotlin.application.form.ContactForm
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class DefaultController {

    @GetMapping("/")
    fun home(): String{
        System.out.println("in home request handler")
        return "home"
    }

    @GetMapping("/blog")
    fun blog(): String{
        System.out.println("in services request handler")
        return "blog"
    }

    @GetMapping("/about")
    fun about(): String{
        System.out.println("in about request handler")
        return "about"
    }

    @GetMapping("/contact")
    fun contact(model: Model): String{
        System.out.println("in contact request handler")
        model.addAttribute("benny", ContactForm())
        return "contact"
    }
    @PostMapping("/contact")
    fun contactPost(model: Model, @ModelAttribute("benny") benny : ContactForm): String{
        val i  = 0
        val end : Int= 10

        for (current in i..end)
            System.out.println("$current");

        System.out.println("in contact submit request handler : ${benny.name}")

        model.addAttribute("benny", ContactForm())
        return "contact"
    }
}
