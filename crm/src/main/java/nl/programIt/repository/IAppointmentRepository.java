package nl.programIt.repository;

import nl.programIt.entities.Appointments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointments, Long> {

}
