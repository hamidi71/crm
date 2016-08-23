package nl.programIt.service.impl;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nl.programIt.entities.Appointments;
import nl.programIt.repository.IAppointmentRepository;
import nl.programIt.service.interfaces.IAppointmentService;

@Service
@Transactional //trasaction Jpa
//@org.springframework.transaction.annotation.Transactional
public class AppointmentServiceImpl implements IAppointmentService {
	
	@Autowired //spring anotation is niet =@Prsistencecontext
	private IAppointmentRepository iAppointment;
	
	@Override
	public void addAppointment(Appointments appointment) {
		iAppointment.save(appointment);		
	}

	@Override
	public void deleteAppointement(Long id) {
		iAppointment.delete(id);
		
	}

}
