package com.jobx.companyms.company;

import com.jobx.companyms.company.dto.ReviewMessage;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();

    boolean updateCompany(Company company, Long id);

    void createCompany(Company company);

    boolean deleteCompany(Long id);

    Company getCompanyById(Long id);

    void updateCompanyRating(ReviewMessage reviewMessage);

}
