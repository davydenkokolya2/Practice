package by.innotechsolutions.practice.DTO;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class GeolocationDTO {

    @Id
    private Long id;
    private Double longitude;
    private Double latitude;
    private Integer userId;
    private boolean sos;
    private LocalTime time;
    private LocalDate date;
}
