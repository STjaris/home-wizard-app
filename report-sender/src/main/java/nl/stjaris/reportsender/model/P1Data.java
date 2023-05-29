package nl.stjaris.reportsender.model;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import nl.stjaris.generated.home_wizard.model.ApiV1DataGet200ResponseExternalInner;

@Data
public class P1Data {

  private String uniqueId;
  private BigDecimal smrVersion;
  private String meterModel;
  private String wifiSsid;
  private BigDecimal wifiStrength;
  private TotalPowerImport totalPowerImport;
  private TotalPowerExport totalPowerExport;
  private ActivePower activePower;
  private ActiveVoltage activeVoltage;
  private ActiveCurrent activeCurrent;


  private BigDecimal activeFrequencyHz;
  private BigDecimal voltageSagL1Count;
  private BigDecimal voltageSagL2Count;
  private BigDecimal voltageSagL3Count;
  private BigDecimal voltageSwellL1Count;
  private BigDecimal voltageSwellL2Count;
  private BigDecimal voltageSwellL3Count;
  private BigDecimal anyPowerFailCount;
  private BigDecimal longPowerFailCount;
  private BigDecimal activePowerAverageW;
  private BigDecimal montlyPowerPeakW;
  private BigDecimal montlyPowerPeakTimestamp;
  private BigDecimal totalGasM3;
  private BigDecimal gasTimestamp;
  private BigDecimal uniqueGasId;
  private List<ApiV1DataGet200ResponseExternalInner> external = new ArrayList<>();

}
