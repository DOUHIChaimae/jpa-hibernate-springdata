package ma.enset.jpahibernatespringdata.services;

import ma.enset.jpahibernatespringdata.entities.Appointment;
import ma.enset.jpahibernatespringdata.entities.Consultation;
import ma.enset.jpahibernatespringdata.entities.Doctor;
import ma.enset.jpahibernatespringdata.entities.Patient;

public interface IHospitalService {
     Patient savePatient(Patient patient);
     Doctor saveMedecin(Doctor doctor);
     Appointment saveRDV(Appointment appointment);
     Consultation saveConsultation(Consultation consultation);
}
