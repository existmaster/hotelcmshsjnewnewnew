package hotelcmshsjnewnewnew.domain;

import hotelcmshsjnewnewnew.domain.*;
import hotelcmshsjnewnewnew.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class HousekeeperAssigned extends AbstractEvent {

    private Long housekeepingId;
    private Long accomodationId;
    private Long housekeeperId;
    private Long roomId;
}
