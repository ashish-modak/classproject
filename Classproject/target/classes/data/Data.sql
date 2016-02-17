SET FOREIGN_KEY_CHECKS = 0;

drop table  CCSD_ATTENDANCE;

    drop table  CCSD_CLASSBATCH;

    drop table  CCSD_EMPLOYEE;

    drop table  CCSD_EMPLOYEEFINANCE;

    drop table  CCSD_EXPENSE;

    drop table  CCSD_STUDENT;

    drop table  CCSD_STUDENTFINANCE;

    drop table  CCSD_USER;

    create table CCSD_ATTENDANCE (
        STAT_ID bigint not null auto_increment unique,
        STAT_ABSENTDATE date not null,
        STAT_STUDENTID_FK bigint,
        primary key (STAT_ID),
        unique (STAT_ABSENTDATE, STAT_STUDENTID_FK)
    );

    create table CCSD_CLASSBATCH (
        CBTB_ID bigint not null auto_increment unique,
        CBTB_BATCHFEE bigint not null,
        CBTB_BATCHNAME varchar(255) not null,
        CBTB_BATCHSTD integer not null,
        CBTB_BATCHSTREAM varchar(255) not null,
        primary key (CBTB_ID),
        unique (CBTB_BATCHNAME, CBTB_BATCHSTD, CBTB_BATCHSTREAM)
    );

    create table CCSD_EMPLOYEE (
        EMTB_ID bigint not null auto_increment unique,
        EMTB_ADDRESS varchar(255),
        EMTB_CONTACTNUMBER varchar(255) not null,
        EMTB_JOININGDATE date not null,
        EMTB_NAME varchar(255) not null,
        EMTB_SALARY bigint not null,
        EMTB_USERID_FK bigint not null unique,
        primary key (EMTB_ID)
    );

    create table CCSD_EMPLOYEEFINANCE (
        EFTB_ID bigint not null auto_increment unique,
        EFTB_AMOUNTPAID bigint not null,
        EFTB_RECEIVEDDATE date not null,
        EFTB_EMPLOYEEID_FK bigint,
        primary key (EFTB_ID)
    );

    create table CCSD_EXPENSE (
        EXTB_ID bigint not null auto_increment unique,
        EXTB_EXPENSETYPE varchar(255) not null,
        EXTB_EXPENSEAMOUNT bigint not null,
        EXTB_EXPENSEDATE date not null,
        EXTB_EXPENSEINFO varchar(255),
        SFTB_USERID_FK bigint,
        primary key (EXTB_ID)
    );

    create table CCSD_STUDENT (
        SDTB_ID bigint not null auto_increment unique,
        SDTB_ADDRESS varchar(255),
        SDTB_AGE integer not null,
        SDTB_CONSESATION bigint,
        SDTB_CONNUMBER bigint not null,
        SDTB_CONPNUMBER bigint not null,
        SDTB_NAME varchar(255) not null,
        SDTB_OTHERINFO varchar(255),
        SDTB_PARENTNAME varchar(255) not null,
        SDTB_SCHOOLNAME varchar(255),
        SDTB_STUDENTUSERNAME varchar(255) not null,
        SDTB_CLASSBATCH_FK bigint,
        primary key (SDTB_ID),
        unique (SDTB_NAME, SDTB_STUDENTUSERNAME)
    );

    create table CCSD_STUDENTFINANCE (
        SFTB_ID bigint not null auto_increment unique,
        SFTB_AMOUNT bigint not null,
        SFTB_FRCEIVEDDATE date not null,
        SFTB_RECEIVINGNAME varchar(255) not null,
        SFTB_STUDENTID_FK bigint,
        primary key (SFTB_ID)
    );

    create table CCSD_USER (
        USTB_ID bigint not null auto_increment unique,
        USTB_USERNAME varchar(255) not null,
        USTB_USERPASSWORD varchar(255) not null,
        USTB_USERROLE varchar(255) not null,
        primary key (USTB_ID),
        unique (USTB_USERNAME, USTB_USERPASSWORD)
    );

    alter table CCSD_ATTENDANCE 
        add constraint  
        foreign key (STAT_STUDENTID_FK) 
        references CCSD_STUDENT (SDTB_ID);

    alter table CCSD_EMPLOYEE 
        add constraint  
        foreign key (EMTB_USERID_FK) 
        references CCSD_USER (USTB_ID);

    alter table CCSD_EMPLOYEEFINANCE 
        add constraint  
        foreign key (EFTB_EMPLOYEEID_FK) 
        references CCSD_EMPLOYEE (EMTB_ID);

    alter table CCSD_EXPENSE 
        add constraint  
        foreign key (SFTB_USERID_FK) 
        references CCSD_USER (USTB_ID);

    alter table CCSD_STUDENT 
        add constraint  
        foreign key (SDTB_CLASSBATCH_FK) 
        references CCSD_CLASSBATCH (CBTB_ID);

    alter table CCSD_STUDENTFINANCE 
        add constraint  
        foreign key (SFTB_STUDENTID_FK) 
        references CCSD_STUDENT (SDTB_ID);

SET FOREIGN_KEY_CHECKS = 1;


--CCSD_CLASSBATCH
INSERT INTO `crystall`.`CCSD_CLASSBATCH` (`CBTB_ID`, `CBTB_BATCHFEE`, `CBTB_BATCHNAME`, `CBTB_BATCHSTD`, `CBTB_BATCHSTREAM`) VALUES ('1000', '17000', '10 Eng 2015-2016', '10', 'English');
INSERT INTO `crystall`.`CCSD_CLASSBATCH` (`CBTB_ID`, `CBTB_BATCHFEE`, `CBTB_BATCHNAME`, `CBTB_BATCHSTD`, `CBTB_BATCHSTREAM`) VALUES ('1001', '15500', '10 Mar 2015-2016', '10', 'Marathi');
INSERT INTO `crystall`.`CCSD_CLASSBATCH` (`CBTB_ID`, `CBTB_BATCHFEE`, `CBTB_BATCHNAME`, `CBTB_BATCHSTD`, `CBTB_BATCHSTREAM`) VALUES ('1002', '17000', '10 SE 2015-2016', '10', 'SemiEnglish');

--CCSD_USER
INSERT INTO `crystall`.`CCSD_USER` (`USTB_ID`, `USTB_USERNAME`, `USTB_USERPASSWORD`, `USTB_USERROLE`) VALUES ('1000', 'Vaibhav_Pangam', 'vaibhav', 'Admin');

--CCSD_STUDENT
INSERT INTO `crystall`.`CCSD_STUDENT` (`SDTB_ID`, `SDTB_ADDRESS`, `SDTB_AGE`, `SDTB_CONSESATION`, `SDTB_CONNUMBER`, `SDTB_CONPNUMBER`, `SDTB_NAME`, `SDTB_OTHERINFO`, `SDTB_PARENTNAME`, `SDTB_SCHOOLNAME`, `SDTB_STUDENTUSERNAME`, `SDTB_CLASSBATCH_FK`) VALUES ('1000', '14/67 B.I.T Colony 3rd Floor K.K Marg Mumbai Central (East)', '15', '0', '8424046852', '8424046853', 'Ankita Padave', 'Good student', 'Nandkishor Padave', 'Aryan High School', 'Ankita_Padave', '1002');
INSERT INTO `crystall`.`CCSD_STUDENT` (`SDTB_ID`, `SDTB_ADDRESS`, `SDTB_AGE`, `SDTB_CONSESATION`, `SDTB_CONNUMBER`, `SDTB_CONPNUMBER`, `SDTB_NAME`, `SDTB_OTHERINFO`, `SDTB_PARENTNAME`, `SDTB_SCHOOLNAME`, `SDTB_STUDENTUSERNAME`, `SDTB_CLASSBATCH_FK`) VALUES ('1001', '07/69 B.I.T Colony 3rd Floor K.K Marg Mumbai Central (East)', '15', '0', '9594965638', '9594965639', 'Roshan Bhoye', 'Good student', 'Janardan Bhoye', 'Aryan High School', 'Roshan_Bhoye', '1002');

--CCSD_STUDENTFINANCE
INSERT INTO `crystall`.`CCSD_STUDENTFINANCE` (`SFTB_ID`, `SFTB_AMOUNT`, `SFTB_FRCEIVEDDATE`, `SFTB_RECEIVINGNAME`, `SFTB_STUDENTID_FK`) VALUES ('1000', '10000', '2015-06-08', 'Rekha Madam', '1000');
INSERT INTO `crystall`.`CCSD_STUDENTFINANCE` (`SFTB_ID`, `SFTB_AMOUNT`, `SFTB_FRCEIVEDDATE`, `SFTB_RECEIVINGNAME`, `SFTB_STUDENTID_FK`) VALUES ('1001', '0', '2015-06-08', 'Rekha Madam', '1001');

--CCSD_ATTENDANCE
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1000', '2015-06-30', '1000');
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1001', '2015-05-01', '1001');
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1002', '2015-05-02', '1001');
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1003', '2015-05-04', '1001');
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1004', '2015-05-05', '1001');
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1005', '2015-05-06', '1001');
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1006', '2015-05-07', '1001');
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1007', '2015-05-08', '1001');
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1008', '2015-05-09', '1001');
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1009', '2015-05-11', '1001');
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1010', '2015-05-12', '1001');
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1011', '2015-05-13', '1001');
INSERT INTO `crystall`.`CCSD_ATTENDANCE` (`STAT_ID`, `STAT_ABSENTDATE`, `STAT_STUDENTID_FK`) VALUES ('1012', '2015-05-14', '1001');