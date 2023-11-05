package vn.edu.iuh.fit.wwwlab02.converts;

import vn.edu.iuh.fit.wwwlab02.enums.EmployeeStatus;
import jakarta.persistence.AttributeConverter;

public class EmployeeStatusConvert implements AttributeConverter<EmployeeStatus,Integer> {

    @Override
    public Integer convertToDatabaseColumn(EmployeeStatus attribute) {
        if(attribute==null)
            return null;
        return  attribute.getCode();
    }

    @Override
    public EmployeeStatus convertToEntityAttribute(Integer dbData) {
        if(dbData==null)
            return null;
        return EmployeeStatus.fromcode(dbData);
    }
}