/**
 * 
 */
package com.student.bcf;

import java.util.ArrayList;
import java.util.List;

import com.entities.StudentBE;
import com.to.StudentTO;

/**
 * @author Ashish
 * 
 */
public class EntityTOConverter {

	public static StudentTO convertStudentEntity(StudentBE student) {

		return new StudentTO();
	}

	public static List<StudentTO> convertStudentEntities(List<StudentBE> students) {
		List<StudentTO> studentTOs = new ArrayList<StudentTO>();
		for (StudentBE student : students) {
			studentTOs.add(convertStudentEntity(student));
		}
		return studentTOs;
	}
}
