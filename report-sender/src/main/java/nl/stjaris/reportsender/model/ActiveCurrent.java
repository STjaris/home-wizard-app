package nl.stjaris.reportsender.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ActiveCurrent {

  private BigDecimal activeCurrentL1A;
  private BigDecimal activeCurrentL2A;
  private BigDecimal activeCurrentL3A;
}