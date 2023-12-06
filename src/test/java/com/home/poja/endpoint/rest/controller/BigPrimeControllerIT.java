package com.home.poja.endpoint.rest.controller;

import com.home.poja.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.springframework.test.util.AssertionErrors.assertTrue;

class BigPrimeControllerIT extends FacadeIT {

  @Autowired BigPrimeController bigPrimeController;
  @Test
  void can_read() {
    var prime = bigPrimeController.newPrime();
    assertInstanceOf(BigInteger.class, prime.getClass());
  }
}
