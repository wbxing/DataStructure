package com.team.junit;

import com.team.domain.Employee;
import com.team.sevrice.NameListService;
import com.team.sevrice.TeamException;
import org.junit.Test;

public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService service = new NameListService();
        Employee[] allEmployee = service.getAllEmployees();
        for (Employee e : allEmployee) {
            System.out.println(e);
        }
    }

    @Test
    public void testGetEmployee() {
        NameListService service = new NameListService();
        int id = 111;
        try {
            Employee employee = service.getEmployees(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}
