package pl.kurs.builder;

import lombok.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
//@NoArgsConstructor

@Getter
@Setter

@ToString(includeFieldNames = false)
@EqualsAndHashCode

@Builder
public class Course {
    private String name;
    private String location;

    @Singular("studentList")
    private List<Student> studentList;

    @SneakyThrows
    public void fileRead() {
        FileReader fileReader = new FileReader("");
    }

    @SneakyThrows
    public void utfString() {
        String str = new String("".getBytes(), "UTF-8");
    }
}
