package nl.programIt.service.interfaces;

import nl.programIt.entities.Appointments;

public interface IAppointmentService {
	public void addAppointment(Appointments appointment);
	public void deleteAppointement(Long id);
	

}
