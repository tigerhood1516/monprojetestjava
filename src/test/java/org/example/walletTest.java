package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class walletTest {
    wallet wallet;

    @BeforeEach
    public void setUp() {
        wallet = new wallet(50000);
    }

    @Test
    public void test_wallet_created() {
        double actual = wallet.getSolde();
        assertEquals(50000, actual);
    }
}
