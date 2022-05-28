package ru.yandex.practicum.filmorate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.TreeSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {

    private Integer id;
    private String name;
    private String description;
    private LocalDate releaseDate;
    private Integer duration;
    private Integer rate = 0;
    private TreeSet<Integer> userId = new TreeSet<>();


}
