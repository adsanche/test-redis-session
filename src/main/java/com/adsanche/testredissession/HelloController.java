package com.adsanche.testredissession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.UrlBasedViewResolver;
import org.springframework.web.server.WebSession;

@Controller
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(final WebSession webSession) {

        webSession.getAttributes().put("test", "TEST");

        return "index";
    }

    @GetMapping(value = "/invalidate")
    public String invalidate(final WebSession webSession) {

        webSession.invalidate().subscribe();

        return UrlBasedViewResolver.REDIRECT_URL_PREFIX + "/hello";
    }
}
