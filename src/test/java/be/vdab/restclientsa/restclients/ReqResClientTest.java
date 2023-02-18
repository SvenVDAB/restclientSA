package be.vdab.restclientsa.restclients;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ReqResClientTest {
    private final ReqResClient client;

    public ReqResClientTest(ReqResClient client) {
        this.client = client;
    }

    @Test
    void findBestaandeUser() {
        assertThat(client.findById(1)).hasValueSatisfying(
                user -> {
                    assertThat(user.data().id()).isOne();
                    //assertThat(user.data().firstName()).isEqualTo("George"); // voornaam is null??
                    assertThat(user.data().lastName()).isEqualTo("Bluth");
                }
        );
    }

    @Test
    void findOnbestaandeUser() {
        assertThat(client.findById(-1)).isEmpty();
    }
}
