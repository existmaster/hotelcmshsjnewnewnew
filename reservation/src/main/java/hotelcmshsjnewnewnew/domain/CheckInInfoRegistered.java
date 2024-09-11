package hotelcmshsjnewnewnew.domain;

import hotelcmshsjnewnewnew.domain.*;
import hotelcmshsjnewnewnew.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CheckInInfoRegistered extends AbstractEvent {

    private Long accomodationId;
    private DateTime checkInTime;
    private Long roomId;

    public CheckInInfoRegistered(Accomodation aggregate) {
        super(aggregate);
    }

    public CheckInInfoRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
