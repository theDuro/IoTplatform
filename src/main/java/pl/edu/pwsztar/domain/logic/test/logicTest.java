package pl.edu.pwsztar.domain.logic.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.edu.pwsztar.controller.ApiController;
import pl.edu.pwsztar.domain.logic.CoamanChecking;
import pl.edu.pwsztar.domain.dto.CreateComandDto;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


public class logicTest {
    Random r = new Random();

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);
    @BeforeEach
    void init() {
        LOGGER.info("pruba nowego testu");
    }

    @AfterEach
    void tearDown() {
       LOGGER.info("zakonczono test");
    }

    @RepeatedTest(10)
    @Test
    void trueAssumption() {

        assumeTrue(CoamanChecking.check( new CreateComandDto(
                getRandomfloatForTest(20) ,
                getRandomfloatForTest(20) ,
                getRandomfloatForTest(20) ,
                getRandomLongForTest(0L,20)



        )));
    }


    private Long getRandomLongForTest(Long lowerBond,int highBound){
        return lowerBond+ r.nextInt(highBound);

    }
    private float getRandomfloatForTest(int highBound){
        return highBound* r.nextFloat();

    }



}
