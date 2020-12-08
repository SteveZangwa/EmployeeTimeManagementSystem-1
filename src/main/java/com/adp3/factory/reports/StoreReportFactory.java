/**
 * Author: Steve Zangwa
 * Class: Part Time
 * Student number: 217136664
 * Factory: StoreReportsFactory
 */

package com.adp3.factory.reports;


import com.adp3.entity.reports.StoreReports;


public class StoreReportFactory {

    private static StoreReports storeReports = null;

    private StoreReportFactory(){
    }
    /*method used to create a new StoreReports
     * @param: empID, storeID, timeServiceID
     * @return: employeeReport per Store
     * */

    public static StoreReports createStoreReports(String empID, String storeID, String timeServiceID){
                return new StoreReports.Builder()
                        .setEmpID(empID)
                        .setStoreID(storeID)
                        .setTimeServiceID(timeServiceID)
                        .build();

    }
}

