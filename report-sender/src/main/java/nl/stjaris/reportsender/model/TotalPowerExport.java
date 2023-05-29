package nl.stjaris.reportsender.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class TotalPowerExport {

  private BigDecimal totalPowerExportT1Kwh;
  private BigDecimal totalPowerExportT2Kwh;
  private BigDecimal totalPowerExportT3Kwh;
  private BigDecimal totalPowerExportT4Kwh;
}