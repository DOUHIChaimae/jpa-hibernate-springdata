package ma.enset.jpahibernatespringdata.services;

import jakarta.transaction.Transactional;
import ma.enset.jpahibernatespringdata.entities.Appointment;
import ma.enset.jpahibernatespringdata.entities.Consultation;
import ma.enset.jpahibernatespringdata.entities.Doctor;
import ma.enset.jpahibernatespringdata.entities.Patient;
import ma.enset.jpahibernatespringdata.repositories.AppointmentRepository;
import ma.enset.jpahibernatespringdata.repositories.ConsultationRepository;
import ma.enset.jpahibernatespringdata.repositories.DoctorRepository;
import ma.enset.jpahibernatespringdata.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private DoctorRepository doctorRepository;
    private AppointmentRepository appointmentRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository,
                               DoctorRepository doctorRepository,
                               AppointmentRepository appointmentRepository,
                               ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
        this.appointmentRepository = appointmentRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Doctor saveMedecin(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Appointment saveRDV(Appointment appointment) {
        appointment.setId(UUID.randomUUID().toString());
        return appointmentRepository.save(appointment);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
