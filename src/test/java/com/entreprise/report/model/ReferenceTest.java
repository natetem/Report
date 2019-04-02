package com.entreprise.report.model;

import com.entreprise.report.exception.ReferenceException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReferenceTest {

    @Test
    void should_return_red_reference()  {
      Reference ref= new Reference("1460100040;R;45.12;27");
      assertTrue(ref.getType().equals(Color.R));
    }

    @Test
    void should_throws_exception_on_color()  {
        ReferenceException thrown = assertThrows(ReferenceException.class, () ->new Reference("1460100040;A;45.12;27"));
        assertTrue(thrown.getMessage().contains("color"));
    }

    @Test
    void should_throws_exception_on_numReference()  {
        ReferenceException thrown = assertThrows(ReferenceException.class, () ->new Reference("14610004;R;45.12;27"));
        assertTrue(thrown.getMessage().contains("numReference"));

    }

    @Test
    void should_throws_exception_on_arguments()  {
        ReferenceException thrown = assertThrows(ReferenceException.class, () ->new Reference("14610004;45.12;27"));
        assertTrue(thrown.getMessage().contains("arguments"));

    }
}