package com.belajar.springtutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Test apakah 1 instance objek tetap sama
// walau dibuat berkali-kali
public class DatabaseTest {
    @Test
    void testSingleton() {
        var database1 = Database.getInstance();
        var database2 = Database.getInstance();

        Assertions.assertSame(database1, database2);

    }
}
