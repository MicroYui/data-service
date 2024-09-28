package cn.edu.hit.dataservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicInformation {
    private String holdsData;
    private String changeRecordData;
    private String annualReportData;
    private String branchsData;
    private String headCompany;
}
