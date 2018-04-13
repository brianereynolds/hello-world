package com.acme.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Central Controller
 *
 * @author brian.e.reynolds@outlook.com
 */
@RestController
public class Controller {

    private Logger logger = LoggerFactory.getLogger(Controller.class);

    /**
     * Our simple home page
     *
     * @return HTML response
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        logger.debug("Homepage Access");

        return "<html><body><h2>Hello World</h2></body></html>";
    }

    /**
     * Health endpoint to indicate app is alive
     *
     * @return HTTP OK (200) indicates server is healthy
     */
    @RequestMapping(value = "/healthz", method = RequestMethod.GET)
    public ResponseEntity getHealthz() {
        logger.debug("Health Check");

        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Readiness endpoint to indicates app is ready for use
     *
     * @return HTTP OK (200) indicates server is ready
     */
    @RequestMapping(value = "/readinessz", method = RequestMethod.GET)
    public ResponseEntity getReadinessz() {
        logger.debug("Readiness Check");

        return new ResponseEntity(HttpStatus.OK);
    }
}
