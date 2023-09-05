package pl.kurs.lombok;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
//@NoArgsConstructor

@Getter
@Setter

@ToString(includeFieldNames = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode

public class Employee {
    @ToString.Include
    @NonNull
    private String name;
    private String lastName;
    @EqualsAndHashCode.Exclude
    private double salary;
    private final String pesel;


}
