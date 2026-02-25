package JPA;

import ENUMS.ReadingStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ReadingStatusConverter implements AttributeConverter<ReadingStatus, String> {

  @Override
  public String convertToDatabaseColumn(ReadingStatus attribute) {
    return (attribute == null) ? null : attribute.name();
  }

  @Override
  public ReadingStatus convertToEntityAttribute(String dbData) {
    if (dbData == null) return null;
    // Maps the value from database to Java ENUM
    // If the value in SQL is 'IN_PROGRESS' and in Java is 'IN_PROGRESS', it works perfectly
    return ReadingStatus.valueOf(dbData.trim().toUpperCase());
  }
}