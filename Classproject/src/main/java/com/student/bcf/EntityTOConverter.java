/**
 * 
 */
package com.student.bcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.entities.AttendanceBE;
import com.entities.StudentBE;
import com.to.AttendanceTO;
import com.to.StudentTO;

/**
 * @author Ashish
 */
public class EntityTOConverter {

    public static StudentTO convertStudentEntity(StudentBE student) {
        StudentTO studentTO = new StudentTO();
        studentTO.setAddress(student.getAddress());
        studentTO.setAge(student.getAge());
        studentTO.setConsesation(student.getConsesation());
        studentTO.setContactNumber(student.getContactNumber());
        studentTO.setContactNumberParent(student.getContactNumberParent());
        studentTO.setId(student.getId());
        studentTO.setName(student.getName());
        studentTO.setOtherInfo(student.getOtherInfo());
        studentTO.setParentName(student.getParentName());
        studentTO.setSchoolName(student.getParentName());
        studentTO.setStudentUserName(student.getStudentUserName());

        studentTO
                .setClassBatchTO(com.batch.bcf.EntityTOConverter.convertClassBatchEntity(student.getClassBatch()));

        studentTO.setAttendanceTOs(convertTOAttendanceTO(student.getStudentsAttendances()));
        return studentTO;
    }

    public static List<StudentTO> convertStudentEntities(Collection<StudentBE> students) {
        List<StudentTO> studentTOs = new ArrayList<StudentTO>();
        for (StudentBE student : students) {
            studentTOs.add(convertStudentEntity(student));
        }
        return studentTOs;
    }

    public static StudentBE convertStudentTO(StudentTO studentTO) {
        StudentBE studentBE = new StudentBE();
        studentBE.setAddress(studentTO.getAddress());
        studentBE.setAge(studentTO.getAge());
        studentBE.setConsesation(studentTO.getConsesation());
        studentBE.setContactNumber(studentTO.getContactNumber());
        studentBE.setContactNumberParent(studentTO.getContactNumberParent());
        studentBE.setName(studentTO.getName());
        studentBE.setOtherInfo(studentTO.getOtherInfo());
        studentBE.setParentName(studentTO.getParentName());
        studentBE.setSchoolName(studentTO.getParentName());
        studentBE.setStudentUserName(studentTO.getStudentUserName());
        return studentBE;
    }

    public static AttendanceTO convertTOAttendanceTO(AttendanceBE attendanceBE) {
        AttendanceTO attendanceTO = new AttendanceTO();
        attendanceTO.setId(attendanceBE.getId());
        attendanceTO.setAbsentDate(attendanceBE.getAbsentDate());

        return attendanceTO;
    }

    public static List<AttendanceTO> convertTOAttendanceTO(Collection<AttendanceBE> attendanceBEs) {
        List<AttendanceTO> attendanceTOs = new ArrayList<AttendanceTO>();
        for (AttendanceBE attendanceBE : attendanceBEs) {
            attendanceTOs.add(convertTOAttendanceTO(attendanceBE));
        }
        return attendanceTOs;
    }

}
