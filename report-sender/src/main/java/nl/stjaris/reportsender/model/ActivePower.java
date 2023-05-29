package nl.stjaris.reportsender.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ActivePower {

  private BigDecimal activePowerW;
  private BigDecimal activePowerL1W;
  private BigDecimal activePowerL2W;
  private BigDecimal activePowerL3W;
  }