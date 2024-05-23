package com.example.carla.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;






@Entity

public class CompensationData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String timestamp;
    private String employmentType;
    private String companyName;
    private String companySize;
    private String primaryLocationCountry;
    private String primaryLocationCity;
    private String industry;
    private String publicOrPrivate;
    private String yearsExperienceInIndustry;
    private String yearsOfExperienceInCurrentCompany;
    private String jobTitle;
    private String jobLadder;
    private String jobLevel;
    private String requiredHoursPerWeek;
    private String actualHoursPerWeek;
    private String highestEducation;
    private int totalBaseSalary;
    private int totalBonus;
    private int totalStockOptions;
    private String healthInsurance;
    private int annualVacation;
    private String areYouHappy;
    private String doYouPlanToResign;
    private String thoughtsAboutIndustry;
    private String gender;
    private String topSkills;
    private String bootcampExperience;

    // Getters ve Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public String getPrimaryLocationCountry() {
        return primaryLocationCountry;
    }

    public void setPrimaryLocationCountry(String primaryLocationCountry) {
        this.primaryLocationCountry = primaryLocationCountry;
    }

    public String getPrimaryLocationCity() {
        return primaryLocationCity;
    }

    public void setPrimaryLocationCity(String primaryLocationCity) {
        this.primaryLocationCity = primaryLocationCity;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getPublicOrPrivate() {
        return publicOrPrivate;
    }

    public void setPublicOrPrivate(String publicOrPrivate) {
        this.publicOrPrivate = publicOrPrivate;
    }

    public String getYearsExperienceInIndustry() {
        return yearsExperienceInIndustry;
    }

    public void setYearsExperienceInIndustry(String yearsExperienceInIndustry) {
        this.yearsExperienceInIndustry = yearsExperienceInIndustry;
    }

    public String getYearsOfExperienceInCurrentCompany() {
        return yearsOfExperienceInCurrentCompany;
    }

    public void setYearsOfExperienceInCurrentCompany(String yearsOfExperienceInCurrentCompany) {
        this.yearsOfExperienceInCurrentCompany = yearsOfExperienceInCurrentCompany;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobLadder() {
        return jobLadder;
    }

    public void setJobLadder(String jobLadder) {
        this.jobLadder = jobLadder;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    public String getRequiredHoursPerWeek() {
        return requiredHoursPerWeek;
    }

    public void setRequiredHoursPerWeek(String requiredHoursPerWeek) {
        this.requiredHoursPerWeek = requiredHoursPerWeek;
    }

    public String getActualHoursPerWeek() {
        return actualHoursPerWeek;
    }

    public void setActualHoursPerWeek(String actualHoursPerWeek) {
        this.actualHoursPerWeek = actualHoursPerWeek;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    public int getTotalBaseSalary() {
        return totalBaseSalary;
    }

    public void setTotalBaseSalary(int totalBaseSalary) {
        this.totalBaseSalary = totalBaseSalary;
    }

    public int getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(int totalBonus) {
        this.totalBonus = totalBonus;
    }

    public int getTotalStockOptions() {
        return totalStockOptions;
    }

    public void setTotalStockOptions(int totalStockOptions) {
        this.totalStockOptions = totalStockOptions;
    }

    public String getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public int getAnnualVacation() {
        return annualVacation;
    }

    public void setAnnualVacation(int annualVacation) {
        this.annualVacation = annualVacation;
    }

    public String getAreYouHappy() {
        return areYouHappy;
    }

    public void setAreYouHappy(String areYouHappy) {
        this.areYouHappy = areYouHappy;
    }

    public String getDoYouPlanToResign() {
        return doYouPlanToResign;
    }

    public void setDoYouPlanToResign(String doYouPlanToResign) {
        this.doYouPlanToResign = doYouPlanToResign;
    }

    public String getThoughtsAboutIndustry() {
        return thoughtsAboutIndustry;
    }

    public void setThoughtsAboutIndustry(String thoughtsAboutIndustry) {
        this.thoughtsAboutIndustry = thoughtsAboutIndustry;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTopSkills() {
        return topSkills;
    }

    public void setTopSkills(String topSkills) {
        this.topSkills = topSkills;
    }

    public String getBootcampExperience() {
        return bootcampExperience;
    }

    public void setBootcampExperience(String bootcampExperience) {
        this.bootcampExperience = bootcampExperience;
    }
}
