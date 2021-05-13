package com.example.graphqlstartervehicle.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlstartervehicle.dao.entity.Vehicle;
import com.example.graphqlstartervehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    private final VehicleService vehicleService;

    public VehicleQuery(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }
}