package camping.test;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public Test createTest(Test test){
        Test savedTest = testRepository.save(test);

        return savedTest;
    }
}
