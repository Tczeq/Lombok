package pl.kurs.builder;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
//@NoArgsConstructor

@Getter
@Setter

@ToString(includeFieldNames = false)
@EqualsAndHashCode
public class Student {
    private String name;
    private String lastName;
}
