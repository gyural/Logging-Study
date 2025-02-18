package org.example.loggingstudy.forCi;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class ForCI {

  @Test
  public void test() {
    Long testVariable = 10L;

    assertThat(testVariable).isEqualTo(9L);


  }
}
