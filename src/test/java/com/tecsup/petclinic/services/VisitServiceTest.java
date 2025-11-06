package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Visit;
import com.tecsup.petclinic.services.VisitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class VisitServiceTest {

    @Autowired
    private VisitService visitService;

    @Test
    public void testCreateVisit() {

        Visit visit = new Visit();
        visit.setDate(LocalDate.now());
        visit.setDescription("Chequeo general");

        Visit newVisit = visitService.create(visit);

        assertNotNull(newVisit.getId(), "El ID de la visita no debería ser nulo");
        assertEquals("Chequeo general", newVisit.getDescription());
    }
}
