package nl.stjaris.reportsender.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ActiveVoltage {

  private BigDecimal activeVoltageL1V;
  private BigDecimal activeVoltageL2V;
  private BigDecimal activeVoltageL3V;

}