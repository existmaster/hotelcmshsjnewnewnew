package hotelcmshsjnewnewnew.domain;

import hotelcmshsjnewnewnew.domain.*;
import hotelcmshsjnewnewnew.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CheckInInfoRegistered extends AbstractEvent {

    private Long accomodationId;
    private Object checkInTime;
    private Long roomId;
}
