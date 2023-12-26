package org.example.UnitTests.hw3;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.*;

import java.util.List;

class UserRepositoryTest {
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
    }

    @Test
    void logOutAll() {
        List<User> data = userRepository.getData();
        data.add(new User("Test", "123"));
        data.add(new User("Test", "123"));
        data.add(new User("Test", "123", true));
        data.add(new User("Test", "123"));
        data.add(new User("Test", "123"));

        for (int i = 0; i < data.size(); i++) {
            if (!data.get(i).isAdmin) {
                data.remove(data.get(i));
                i--;
            }
        }

        data.forEach(item -> Assertions.assertTrue(item.isAdmin));
    }
}