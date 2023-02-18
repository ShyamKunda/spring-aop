package com.shyam.aop;

import com.shyam.aop.service.FilteringTechnique1;
import com.shyam.aop.service.FilteringTechnique2;
import com.shyam.movies.recommenderapt.RecommenderAptApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommenderAOPApplication implements CommandLineRunner {

    @Autowired
    private FilteringTechnique1 filter1;
    @Autowired
    private FilteringTechnique2 filter2;

    private Logger logger = LoggerFactory.getLogger(this.getClass());



    public static void main(String[] args) {
        SpringApplication.run(MovieRecommenderAOPApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        logger.info("{}",filter1.contentBasedFiltering());
        logger.info("{}",filter2.collaborativeFiltering());
    }
}
