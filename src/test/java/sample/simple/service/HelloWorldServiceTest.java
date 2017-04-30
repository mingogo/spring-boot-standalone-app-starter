package sample.simple.service;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldServiceTest {

    private String name = RandomStringUtils.randomAlphabetic(5);
    @InjectMocks
    private HelloWorldService helloWorldService;

    @Before
    public void setup() {
        ReflectionTestUtils.setField(helloWorldService, "name", name);
    }

    @Test
    public void test() {
        String helloMessage = helloWorldService.getHelloMessage();
        assertThat(helloMessage, is("Hello "+ name));
    }

}