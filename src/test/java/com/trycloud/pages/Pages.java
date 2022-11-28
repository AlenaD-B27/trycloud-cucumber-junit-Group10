package com.trycloud.pages;

public class Pages {

    private LoginPage loginPage;
    private FilesPage filesPage;

    private DashboardPage dashboardPage;

    public LoginPage  loginPage (){
        if(loginPage == null){
            loginPage=new LoginPage();
        }
        return loginPage;
    }

    public FilesPage filesPage(){
        if(filesPage == null){
            filesPage=new FilesPage();
        }
        return filesPage;
    }

}
