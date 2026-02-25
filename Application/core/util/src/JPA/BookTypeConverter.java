package JPA;

import ENUMS.BookType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class BookTypeConverter implements AttributeConverter<BookType, String> {

  @Override
  public String convertToDatabaseColumn(BookType attribute) {
    return (attribute == null) ? null : attribute.name();
  }

  @Override
  public BookType convertToEntityAttribute(String dbData) {
    if (dbData == null) return null;
    return BookType.valueOf(dbData.trim().toUpperCase());
  }
}