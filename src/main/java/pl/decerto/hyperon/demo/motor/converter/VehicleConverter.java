package pl.decerto.hyperon.demo.motor.converter;

import java.util.Objects;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.decerto.hyperon.demo.motor.domain.Vehicle;
import pl.decerto.hyperon.demo.motor.api.dto.VehicleDto;

@Component
public class VehicleConverter implements Converter<Vehicle, VehicleDto> {

	@Override
	public VehicleDto convert(Vehicle vehicle) {
		Objects.requireNonNull(vehicle, "Vehicle can not be null.");
		VehicleDto dto = new VehicleDto();
		dto.setMakeId(vehicle.getMakeId());
		dto.setModelId(vehicle.getModelId());
		dto.setTypeId(vehicle.getTypeId());
		dto.setProductionYear(vehicle.getProductionYear());
		return dto;
	}
}
