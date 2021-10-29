package lv.oxana.testproject.controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class TestControllerTest {

    private TestController controller = new TestController();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test has finished");
    }

    @Test
    void getTest() {
        assert(controller.getTest()).equals("This is Test!");
    }

    @Test
    void getAnotherTest() {
        assert(controller.getAnotherTest()).contains("something");
    }
}