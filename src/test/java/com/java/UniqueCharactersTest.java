package com.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharactersTest {

    @Test
    void TestIsUnique() {
        UniqueCharacters underTest = new UniqueCharacters();

        assertTrue(underTest.isUnique("turn"));
    }

    @Test
    void TestIsNotUnique() {
        UniqueCharacters underTest = new UniqueCharacters();

        assertFalse(underTest.isUnique("jumanji"));
    }

}