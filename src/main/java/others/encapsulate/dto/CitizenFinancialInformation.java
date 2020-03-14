package others.encapsulate.dto;

public class CitizenFinancialInformation {

    private String citizenId;
    private String citizenName;
    private Integer taxableYear;
    private Double totalIncome;
    private Double totalDeductions;
    private Double totalAssets;
    private Double totalPassives;
    private Double totalValueTaxable;
    private Double finalValueTaxable;

    public CitizenFinancialInformation(String citizenId, String citizenName, Integer taxableYear, Double totalIncome, Double totalDeductions, Double totalAssets, Double totalPassives) {
        this.citizenId = citizenId;
        this.citizenName = citizenName;
        this.taxableYear = taxableYear;
        this.totalIncome = totalIncome;
        this.totalDeductions = totalDeductions;
        this.totalAssets = totalAssets;
        this.totalPassives = totalPassives;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public Integer getTaxableYear() {
        return taxableYear;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public Double getTotalDeductions() {
        return totalDeductions;
    }

    public Double getTotalAssets() {
        return totalAssets;
    }

    public Double getTotalPassives() {
        return totalPassives;
    }

    public Double getTotalValueTaxable() {
        return totalValueTaxable;
    }

    public void setTotalValueTaxable(Double totalValueTaxable) {
        this.totalValueTaxable = totalValueTaxable;
    }

    public Double getFinalValueTaxable() {
        return finalValueTaxable;
    }

    public void setFinalValueTaxable(Double finalValueTaxable) {
        this.finalValueTaxable = finalValueTaxable;
    }
}
