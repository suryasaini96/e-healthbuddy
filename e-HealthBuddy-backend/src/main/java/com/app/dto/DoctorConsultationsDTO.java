package com.app.dto;

import java.util.List;

import com.app.entity.Doctor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DoctorConsultationsDTO {
	Doctor doctor;
	List<DoctorConsultations> doctor_consultations;
}
