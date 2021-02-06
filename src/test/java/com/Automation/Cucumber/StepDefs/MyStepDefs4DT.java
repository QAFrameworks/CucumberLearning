package com.Automation.Cucumber.StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class MyStepDefs4DT extends BaseStepDefs {
int calculationResult;


    @Given("perform form filling")
    public void performFormFilling(DataTable dataTable) {
        Map<String,String> map = dataTable.asMap(String.class,String.class);
        System.out.println("the name of the employee is"+map.get("employeeName"));
        System.out.println("the name of the Training is"+map.get("training"));
        System.out.println("the length of the Course is"+map.get("length"));

    }

    @Given("perform largemap handling")
    public void performlargeMapHandling(DataTable dataTable) {
        List<Map<String,String>> list = dataTable.asMaps();
        for(int i = 0;i<list.size();i++) {
            System.out.println("Map information is "+ list.get(i));
            System.out.println("Title is "+list.get(i).get("Title")+"   FirstName is "+list.get(i).get("FirstName")+"  LastName is "+list.get(i).get("LastName"));
        }

        for(Map<String, String> dummy:list) {
            System.out.println("concatenated value without any space is : "+dummy.get("Title") + dummy.get("FirstName") + dummy.get("LastName"));
        }
    }

    @Given("perform login which do not involve keyvalue info")
    public void performLoginWhichDoNotInvolveKeyvalueInfo(DataTable dataTable) {
        List<String> credentialDetails = dataTable.asList();
        String user = credentialDetails.get(0);
        String pwd = credentialDetails.get(1);
        String security = credentialDetails.get(2);

        System.out.println("user logged in with" +user+pwd+security);
    }

    @Given("perform interaction which do not involve keyvalue info")
    public void performInteractionWhichDoNotInvolveKeyvalueInfo(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists();
        for (int i = 0; i < rows.size(); i++) {
            String operator = rows.get(i).get(0).trim();
            int operand1 = Integer.parseInt(rows.get(i).get(1));
            int operand2 = Integer.parseInt(rows.get(i).get(2));
            int result =doCalculation(operator,operand1,operand2);
        }
    }

    private int doCalculation(String operator, int operand1, int operand2) {
        switch(operator) {
            case "add" :
                calculationResult = operand1+operand2;
                break;
            case "subtract" :
                calculationResult = operand1-operand2;
                break;
            case "multiple" :
                calculationResult = operand1*operand2;
                break;
        }
        return calculationResult;
    }

    @Given("perform interaction which do not involve keyvalue info multiple info passed in single col")
    public void performInteractionWhichDoNotInvolveKeyvalueInfoMultipleInfoPassedInSingleCol(String str) {
        String ar[] = str.split(",");
        String operator =ar[0];
        int operand1 = Integer.parseInt(ar[1].trim());
        int operand2 = Integer.parseInt(ar[2].trim());
        int result = doCalculation(operator,operand1,operand2);
        System.out.println("the result is "+result);

    }

    @Given("give vaccine to below users")
    public void giveVaccineToBelowUsers(DataTable dataTable) {
        List<List<String>> list=dataTable.asLists();
        for(List<String> dummy:list) {

            System.out.println("vaccine provided to "+dummy.get(0)+ ", aged: "+dummy.get(1)+ " and living at postcode: "+dummy.get(2));


        }
    }
}
