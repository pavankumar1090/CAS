*****************************************************PROJECT DESCRIPTION*****************************************************************

Problem Statement : Be Cognizant Home Page Header View 
1.Login into Be.cognizant
2.Verify the Username
3.Click on the Company dropdown
4.Clicking on Acronym option
5.Extracting all the acronyms 

  
Detailed Description: Main Project

1.Login into Be.cognizant using valid credentials
2.Capture and validate the user information
3.Clicking on the Company dropdown
4.Click on the Acronym option 
5.Print all the Acronyms present in the page in console 
6.Scroll down the page and capture screenshots

Key Automation Scope:

Capturing the screenshot
Printing all the values in console and excel sheet
Report generation using Extent Reports


**********************************************************STEPS TO EXECUTE*************************************************************

-unzip the folder
-On eclipse, goto file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
-Now go to the testng.xml file and run as TestNGSuite.
-Now the file will Execute and we get the expected output as shown below.

*******************************************************FILES DESCRIPTION**************************************************************

1.src/test/java- There are three packages present in this folder.

-> PageObjects : In this package there are three java files and they are Acronym.java, BeCognizant_page.java is the page object model for all elements present in becognizant page, ScrollSShot.java is the class file where method for screenshot is present, Validation.java class specifies the authentication issues.

     
->testclass : In this package there is one class CAS_TEST.java  and in this all the methods are under testng annotations which will run in the priority base

->utilities : In this package we have two files, Excel.java for printing data's in excel and ExtentReportmanager for report generation.

2.JRE System Library: In this File we have all dependencies of JAR.files.         

3.Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. when a Maven build is executed, Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.

4.TestNG: This is a plugin for adding TestNG framework

5.report: In this folder all the reports of the project are stored.

6.screenShots: All the screenshots captured during execution are stored in this folder.

7.src: In this, there are two folders
	-main:It is an empty folder
	-test:It is an empty folder

8.target: It is an empty folder

9.writeData: In th folder we have Book1.xlsx excel for writing data in the excel.

10.testng.xml: In this file, the test classes are defined and for cross browser execution.

11.pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,
build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.

 
***************************************************************************************************************************************

                                                        OUTPUT ON CONSOLE

***************************************************************************************************************************************

[RemoteTestNG] detected TestNG version 7.4.0
Feb 13, 2024 4:55:08 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 120, returning the closest version; found: 119; Please update to a Selenium version that supports CDP version 120
userid is:2303896@cognizant.com
Is the acronyms displayed ? true
Acronym   Stands for...
AAD   Azure Active Directory
AAPI   Asian American and Pacific Islander
ABG   Amazon Business Group
AD   Active Directory
AD   Associate Director
ADM   Application Development and Maintenance
AG   Affinity Groups
AI   Artificial Intelligence
AI&A   Artificial Intelligence & Automation
AIM    Analytics & Information Management
AM   Account Management
ANZ   Australia & New Zealand
AOP   Annual Operating Plan
AP   Account Payable
APAC   Asia Pacific
API   Application Programming Interface
AR   Analyst Relations
AR   Account Receivable 
AToF   Account Team of the Future
AUP   Acceptable Use Policy
AVM   Application Value Management
AWS   Amazon Web Services
BA   Business Analyst
BCM   Business Continuity Management
BENELUX   Belgium, the Netherlands and Luxembourg Region
BFS   Banking and Financial Services
BFSI   Banking, Financial Services, Insurance
BLING   Black, Latinx and Indigenous Group
BOD   Board of Directors
BPaaS   Business Process-as-a-Service
BPO   Business Process Operations
BPS   Basis Points
BRG   Business Resource Group
BRT   Business Round Table
BU   Business Unit
CC   Cognizant Consulting
CC   Constant Currency
CCA   Cognizant Career Architecture
CDP   Citizen Developer Program
CDS   Cloud Data Solutions
CE   Continental Europe
CF   Cognizant Foundation
CII   Continuous Improvement and Innovation
CIS   Cloud Infrastructure & Security
CLIA   Citizen-led Intelligent Automation
CM   Contribution Margin
CMS   Content Management System
CMT   Communications, Media and Technology
CoE   Center of Excellence
CP   Client Partner
CP%   Client Profitability (Margin Against Contracted Role)
CPES   Cognizant People Engagement Survey
CRO   Clinical Research Organization
CS   Corporate Security
CTB   Change the Business
CTI   Core Technologies & Insights
CTSH   Cognizant Technology Solutions Corporation (NASDAQ:CTSH)
CWS   Corporate Workplace Services
CREWS   Corporate Real Estate Workplace Services
CWR   Contractor (Contingency Worker)
CX   Customer Experience
D+   Director Plus
DACH   D — Deutschland (Germany), A — Austria, CH — Confœderatio Helvetica (Switzerland) also known as the region with the three central European countries - Germany, Austria and Switzerland
D&A   Data & Analytics
DBO   Digital Business Operations
DE   Digital Engineering
D&I   Diversity & Inclusion
DL   Delivery Lead
DL   Distribution Lists
DF   Digital First
DFC   Digital First Certification
DMA   Digital Marketing Analytics
DP   Delivery Partner
DPO   Digital Process Orchestration
DWP   Deal Win Predictor
DWS   Digital Workplace Services
DX   Digital Experience Practice
EAS   Enterprise Application Services
EC   Executive Committee
EDL   Engagement Delivery Leader
EDP   Engagement Delivery Partner
EE   Enterprise Engineering
EL   Engagement Lead
ELT   Executive Leadership Team
ELT   Entry Level Trainee
EMEA   Europe Middle East Africa
EOD   End of Day
EP   Engagement Partner
EPL   Engagement Portfolio Lead
EPS   Enterprise Platform Services
ESG   Environmental Social Governance 
EVP   Employee Value Proposition
F2F   Face-to-Face
F&A   Finance and Accounting
FDA   Food and Drug Administration (U.S. Federal Agency)
FLL   FrontLine Leaders
FLTP   French Learning Training Program
FP&A   Financial Planning Analysis
FS   Financial Services (inclusive of Banking, Finance Services, and Insurance industries)
FSE   Full Stack Engineer
FY   Fiscal Year and/or Full Year
GAAP   Generally Accepted Accounting Principles
GAPS   Global Account Planning Session
GBG   Google Business Group
GDIA   Global Delivery - Intelligent Automation Center of Excellence
GenC   Generation Cognizant - Generation Z associates
GEO   Global Engineering and Operations
GGM   Global Growth Markets
GLD   Global Leadership Development 
GPE   Global Partner Ecosystem
GPM   Global Program Management
GPOY   Global Project of the Year
GRC   Governance, Risk and Compliance
GSA   Global Solution Architecture (Team)
GTB   Global Talent Board
GTM   Go To Market
GTO   Global Technology Office
GWFM   Global Workforce Management
HC   Healthcare
HCLS   Healthcare and Life Sciences
HCM   Human Capital Management
HIPAA   Health Insurance Portability and Accountability Act
HPOC   Horizontal Point of Contact
HRBP   Human Resources Business Partner
HRSS   Human Resources Shared Services
HS   Health Sciences (inclusive of Healthcare and Life Sciences industries)
IAAS   Infrastructure as a service
IC   Internal Communications
IDA   Intuitive Digital Assistant
IJM   Internal Job Moves
IME   Information, Media and Entertainment
IMS   Information Management System
INS   Insurance
IO&A   Intuitive Operations & Automation
IoT   Internet of Things
IPA   Intelligent Process Automation
IPM   Integration and Process Management
ISG   Industry Solutions Group
ISL   Integrated Service Line
IWD   International Women's Day
KPI   Key Performance Indicator
KRA   Key Results Area
KRO   Key Result Objectives or Key Role Outcomes
LATAM   Latin America
LEED   Leadership in Energy and Environmental Design
L&D   Learning & Development
LGBTQ+   Lesbian, Gay, Bisexual, Queer and Transgender
LoS   Lines of Service
MBG   Microsoft Business Group
MBU   Market Business Unit
MCU   Market Commercial Unit
MDU   Market Delivery Unit
ME   Middle East
MFA   Microsoft Multifactor Authentication 
ML   Machine Learning
MLEU   Manufacturing, Logistics, Energy & Utilities
MSA   Master Services Agreement
MSFT   Microsoft
MSI   Multi-Service Integration
MTK   Manager Tool Kit
MU   Market Unit
MVP   Minimal Viable Product
MVP   Most Valuable Partner/Player
NA   North America/Americas
NLP   Natural Language Processing
NORDICS   Denmark, Norway, Sweden, Finland, Iceland and Greenland Region
NPS   Net Promoter Score
NSV   Net Sales Value
NU   Normalization Unit
OCEO   Office of the CEO
OCM   Organizational Change Management
OM   Operating Margin
OpEx   Operational Excellence
P / PA/ PAT   Programmer and Programmer Analyst/ Programmer Analyst Trainee
PAAS   Platform as a service
PCC   Platinum Client Cluster
PEx   Process Excellence
PDL   Portfolio Delivery Lead
PDP   Practice Deployable Pool
PEP    Profitability Enhancement Program
P&L   Profit and Loss
P&R   Products & Resources (inclusive of Manufacturing, Logistics, Energy, Utilities, Retail, Consumer Goods, Travel & Hospitality)
PMO   Project Management Office
POV   Point of View
PR   Public Relations
PXM   Product Experience Management
QBR   Quarterly Business Review
QC   Quality Control
QE&A   Quality Engineering & Assurance
Q/Q   Quarter-over-Quarter
RCGTH   Retail, Consumer Goods, Travel & Hospitality
RDC   Regional Delivery Center
RDO   Results Delivery Office
RDP   Role Development Plan
REN   Race Equality Network
RFP   Request for Proposals
RHCG   Retail, Hospitality & Consumer Goods
ROI   Return on Investment
ROW   Rest of World
RPA   Robotic Process Automation
RSM   Roll Skill Matrix
RTB   Run the Business
RTO   Return to Office
SAAS   Software as a service
SCP   Strategic Control Points
SBU   Strategic Business Unit
SGA   Sales/Selling, General Administration
SIP   Shared Investigator Platform
SL   Service Line
SLA   Service Level Agreement
SLS   Service Line Sales Specialist
SLSM   Service Line Sales Manager
SLT   Senior Leadership Team
SM   Senior Manager
SMB   Small Medium Business 
SME   Subject Matter Expert
SolX   SolXchange
SOW   Statement of Work
SPE   Software & Platform Engineering
S&T   Strategy and Technology
STEM   Science, Technology, Engineering & Math
TAG   Talent Acquisition Group
TCR   Transforming Client Relationships
TCV   Total Contract Value
TM   Talent Manager
TO   Transformation Office
TPDI   Total Performance and Development Indicators
TQM   Transactional Quality Mangaement 
TSC   Talent Supply Chain
TTM   Trailing Twelve Months
TYU   Test Your Understanding
TZ BMS   TriZetto BMS
UK/I   United Kingdom/Ireland
UPT   Unified Pricing Template
UX   User Experience
VOC   Voice of Cognizant
VPOC   Vertical Point of Contact
WI   Workforce Insights
WFH   Work From Home
WFM   Workforce Management 
YER   Year-end Review
Y/Y or YoY   Year-over-Year
ZDLC   Zero Deviation Lifecycle
Feb 13, 2024 4:56:47 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 121, returning the closest version; found: 119; Please update to a Selenium version that supports CDP version 121
userid is:2303997@cognizant.com
Is the acronyms displayed ? true
Acronym   Stands for...
AAD   Azure Active Directory
AAPI   Asian American and Pacific Islander
ABG   Amazon Business Group
AD   Active Directory
AD   Associate Director
ADM   Application Development and Maintenance
AG   Affinity Groups
AI   Artificial Intelligence
AI&A   Artificial Intelligence & Automation
AIM    Analytics & Information Management
AM   Account Management
ANZ   Australia & New Zealand
AOP   Annual Operating Plan
AP   Account Payable
APAC   Asia Pacific
API   Application Programming Interface
AR   Analyst Relations
AR   Account Receivable 
AToF   Account Team of the Future
AUP   Acceptable Use Policy
AVM   Application Value Management
AWS   Amazon Web Services
BA   Business Analyst
BCM   Business Continuity Management
BENELUX   Belgium, the Netherlands and Luxembourg Region
BFS   Banking and Financial Services
BFSI   Banking, Financial Services, Insurance
BLING   Black, Latinx and Indigenous Group
BOD   Board of Directors
BPaaS   Business Process-as-a-Service
BPO   Business Process Operations
BPS   Basis Points
BRG   Business Resource Group
BRT   Business Round Table
BU   Business Unit
CC   Cognizant Consulting
CC   Constant Currency
CCA   Cognizant Career Architecture
CDP   Citizen Developer Program
CDS   Cloud Data Solutions
CE   Continental Europe
CF   Cognizant Foundation
CII   Continuous Improvement and Innovation
CIS   Cloud Infrastructure & Security
CLIA   Citizen-led Intelligent Automation
CM   Contribution Margin
CMS   Content Management System
CMT   Communications, Media and Technology
CoE   Center of Excellence
CP   Client Partner
CP%   Client Profitability (Margin Against Contracted Role)
CPES   Cognizant People Engagement Survey
CRO   Clinical Research Organization
CS   Corporate Security
CTB   Change the Business
CTI   Core Technologies & Insights
CTSH   Cognizant Technology Solutions Corporation (NASDAQ:CTSH)
CWS   Corporate Workplace Services
CREWS   Corporate Real Estate Workplace Services
CWR   Contractor (Contingency Worker)
CX   Customer Experience
D+   Director Plus
DACH   D — Deutschland (Germany), A — Austria, CH — Confœderatio Helvetica (Switzerland) also known as the region with the three central European countries - Germany, Austria and Switzerland
D&A   Data & Analytics
DBO   Digital Business Operations
DE   Digital Engineering
D&I   Diversity & Inclusion
DL   Delivery Lead
DL   Distribution Lists
DF   Digital First
DFC   Digital First Certification
DMA   Digital Marketing Analytics
DP   Delivery Partner
DPO   Digital Process Orchestration
DWP   Deal Win Predictor
DWS   Digital Workplace Services
DX   Digital Experience Practice
EAS   Enterprise Application Services
EC   Executive Committee
EDL   Engagement Delivery Leader
EDP   Engagement Delivery Partner
EE   Enterprise Engineering
EL   Engagement Lead
ELT   Executive Leadership Team
ELT   Entry Level Trainee
EMEA   Europe Middle East Africa
EOD   End of Day
EP   Engagement Partner
EPL   Engagement Portfolio Lead
EPS   Enterprise Platform Services
ESG   Environmental Social Governance 
EVP   Employee Value Proposition
F2F   Face-to-Face
F&A   Finance and Accounting
FDA   Food and Drug Administration (U.S. Federal Agency)
FLL   FrontLine Leaders
FLTP   French Learning Training Program
FP&A   Financial Planning Analysis
FS   Financial Services (inclusive of Banking, Finance Services, and Insurance industries)
FSE   Full Stack Engineer
FY   Fiscal Year and/or Full Year
GAAP   Generally Accepted Accounting Principles
GAPS   Global Account Planning Session
GBG   Google Business Group
GDIA   Global Delivery - Intelligent Automation Center of Excellence
GenC   Generation Cognizant - Generation Z associates
GEO   Global Engineering and Operations
GGM   Global Growth Markets
GLD   Global Leadership Development 
GPE   Global Partner Ecosystem
GPM   Global Program Management
GPOY   Global Project of the Year
GRC   Governance, Risk and Compliance
GSA   Global Solution Architecture (Team)
GTB   Global Talent Board
GTM   Go To Market
GTO   Global Technology Office
GWFM   Global Workforce Management
HC   Healthcare
HCLS   Healthcare and Life Sciences
HCM   Human Capital Management
HIPAA   Health Insurance Portability and Accountability Act
HPOC   Horizontal Point of Contact
HRBP   Human Resources Business Partner
HRSS   Human Resources Shared Services
HS   Health Sciences (inclusive of Healthcare and Life Sciences industries)
IAAS   Infrastructure as a service
IC   Internal Communications
IDA   Intuitive Digital Assistant
IJM   Internal Job Moves
IME   Information, Media and Entertainment
IMS   Information Management System
INS   Insurance
IO&A   Intuitive Operations & Automation
IoT   Internet of Things
IPA   Intelligent Process Automation
IPM   Integration and Process Management
ISG   Industry Solutions Group
ISL   Integrated Service Line
IWD   International Women's Day
KPI   Key Performance Indicator
KRA   Key Results Area
KRO   Key Result Objectives or Key Role Outcomes
LATAM   Latin America
LEED   Leadership in Energy and Environmental Design
L&D   Learning & Development
LGBTQ+   Lesbian, Gay, Bisexual, Queer and Transgender
LoS   Lines of Service
MBG   Microsoft Business Group
MBU   Market Business Unit
MCU   Market Commercial Unit
MDU   Market Delivery Unit
ME   Middle East
MFA   Microsoft Multifactor Authentication 
ML   Machine Learning
MLEU   Manufacturing, Logistics, Energy & Utilities
MSA   Master Services Agreement
MSFT   Microsoft
MSI   Multi-Service Integration
MTK   Manager Tool Kit
MU   Market Unit
MVP   Minimal Viable Product
MVP   Most Valuable Partner/Player
NA   North America/Americas
NLP   Natural Language Processing
NORDICS   Denmark, Norway, Sweden, Finland, Iceland and Greenland Region
NPS   Net Promoter Score
NSV   Net Sales Value
NU   Normalization Unit
OCEO   Office of the CEO
OCM   Organizational Change Management
OM   Operating Margin
OpEx   Operational Excellence
P / PA/ PAT   Programmer and Programmer Analyst/ Programmer Analyst Trainee
PAAS   Platform as a service
PCC   Platinum Client Cluster
PEx   Process Excellence
PDL   Portfolio Delivery Lead
PDP   Practice Deployable Pool
PEP    Profitability Enhancement Program
P&L   Profit and Loss
P&R   Products & Resources (inclusive of Manufacturing, Logistics, Energy, Utilities, Retail, Consumer Goods, Travel & Hospitality)
PMO   Project Management Office
POV   Point of View
PR   Public Relations
PXM   Product Experience Management
QBR   Quarterly Business Review
QC   Quality Control
QE&A   Quality Engineering & Assurance
Q/Q   Quarter-over-Quarter
RCGTH   Retail, Consumer Goods, Travel & Hospitality
RDC   Regional Delivery Center
RDO   Results Delivery Office
RDP   Role Development Plan
REN   Race Equality Network
RFP   Request for Proposals
RHCG   Retail, Hospitality & Consumer Goods
ROI   Return on Investment
ROW   Rest of World
RPA   Robotic Process Automation
RSM   Roll Skill Matrix
RTB   Run the Business
RTO   Return to Office
SAAS   Software as a service
SCP   Strategic Control Points
SBU   Strategic Business Unit
SGA   Sales/Selling, General Administration
SIP   Shared Investigator Platform
SL   Service Line
SLA   Service Level Agreement
SLS   Service Line Sales Specialist
SLSM   Service Line Sales Manager
SLT   Senior Leadership Team
SM   Senior Manager
SMB   Small Medium Business 
SME   Subject Matter Expert
SolX   SolXchange
SOW   Statement of Work
SPE   Software & Platform Engineering
S&T   Strategy and Technology
STEM   Science, Technology, Engineering & Math
TAG   Talent Acquisition Group
TCR   Transforming Client Relationships
TCV   Total Contract Value
TM   Talent Manager
TO   Transformation Office
TPDI   Total Performance and Development Indicators
TQM   Transactional Quality Mangaement 
TSC   Talent Supply Chain
TTM   Trailing Twelve Months
TYU   Test Your Understanding
TZ BMS   TriZetto BMS
UK/I   United Kingdom/Ireland
UPT   Unified Pricing Template
UX   User Experience
VOC   Voice of Cognizant
VPOC   Vertical Point of Contact
WI   Workforce Insights
WFH   Work From Home
WFM   Workforce Management 
YER   Year-end Review
Y/Y or YoY   Year-over-Year
ZDLC   Zero Deviation Lifecycle

===============================================
Suite
Total tests run: 8, Passes: 8, Failures: 0, Skips: 0
===============================================


