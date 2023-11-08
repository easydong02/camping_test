package camping.test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/test")
@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;


    @GetMapping("")
    public ResponseEntity<Test> createTest() {
        Test test = new Test();
        test.setId(3l);
        test.setName("Donghee");

        Test savedTest = testService.createTest(test);

        return new ResponseEntity<>(savedTest, HttpStatus.OK);
    }
}
