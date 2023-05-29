package nl.stjaris.reportsender.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class TotalPowerImport {

  private BigDecimal totalPowerImportT1Kwh;
  private BigDecimal totalPowerImportT2Kwh;
  private BigDecimal totalPowerImportT3Kwh;
  private BigDecimal totalPowerImportT4Kwh;
}