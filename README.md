# different-topic-notes-find-reference-in-readme

NOTE: notes are  not complete but u can go through it

devops : Mumshad  mannambeth (udemy)

for practist : https://www.katacoda.com/courses/kubernetes

aws and kafka : Stephane maarek(udemy)

elastic search: Imtiaz ahmad(udemy)

other:- bharat thippireddy(udemy)

Most Important : for Programming practist
https://www.youtube.com/results?search_query=aditya+verma+playlist

https://www.youtube.com/c/Pepcoding/playlists

https://www.pepcoding.com/resources/

practice question for pepcoding : https://drive.google.com/drive/u/0/mobile/folders/15E9vAooWGtLv1UlzpkawUkM1f7_mFeJs

https://docs.google.com/spreadsheets/u/0/d/1XdXJbn9NC7fx1CeavItkxR0Yos8rQAC9xXjnH4-f6Eg/htmlview#gid=0

#Find reference of different topic ( All are super no doubt u will learn a lot)

1)AWS  and kafka:            Stephane maarek

https://www.udemy.com/course/aws-certified-solutions-architect-associate-saa-c02/

https://www.udemy.com/course/kafka-streams/

https://cisco.udemy.com/course/aws-certified-cloud-practitioner-new/

2) Angular  by javabrain and codevolution 

a) Angular js  https://www.youtube.com/playlist?list=PLvZkOAgBYrsS_ugyamsNpCgLSmtIXZGiz

b) angular 7:  https://www.youtube.com/playlist?list=PLC3y8-rFHvwhBRAgFinJR8KHIrCdTkZcZ

3)Docker : 

https://www.youtube.com/playlist?list=PLhW3qG5bs-L99pQsZ74f-LC-tOEsBp2rK  

4)Typescript:

   a) javabrain :  https://www.youtube.com/playlist?list=PLqq-6Pq4lTTanfgsbnFzfWUhhAz3tIezU
   
   b)codevolution: https://www.youtube.com/playlist?list=PLC3y8-rFHvwhI0V5mE9Vu6Nm-nap8EcjV
   
5) Elastic search and maven  by Imtiaz ahmad udemy

 https://www.udemy.com/course/complete-elasticsearch-masterclass-with-kibana-and-logstash/ 
 
 https://www.udemy.com/course/mavencrashcourse/
 
6)Javascript  by javabrain

https://www.youtube.com/results?search_query=javascript++javabrain+playlist

7)junit, mockito and spring by bharat thippireddy

https://www.udemy.com/course/junitandmockitocrashcourse/

8) Kubernetes by Mumshad mannambeth ( very good playlist for devops seriously)

https://www.udemy.com/course/learn-kubernetes/?utm_source=adwords&utm_medium=udemyads&utm_campaign=LongTail_la.EN_cc.INDIA&utm_content=deal4584&utm_term=_._ag_77882236223_._ad_437477391720_._kw__._de_c_._dm__._pl__._ti_dsa-1007766171032_._li_9062031_._pd__._&matchtype=b&gclid=CjwKCAjwmrn5BRB2EiwAZgL9oq0DGJxGNtMsL5C045s45oqJjpnUwjcuMcFqv4yB6lX2-prlaAAwJxoCgesQAvD_BwE

9) core java and java 8 ( durgasoft playlist)

  https://www.youtube.com/playlist?list=PLd3UqWTnYXOmx_J1774ukG_rvrpyWczm0

10 python : very good:

https://www.udemy.com/course/complete-python-bootcamp/


### Data Model : DCC  
Note : This section include new attributes added in parquet_ne.go and parquet_eq.go for DCC  

#### 1- parquet_ne.go

| Attributes | Data Type | Description |
| ---------- | --------- | ----------- |
| AssetType | string | Type of asset : Hardware / Software |
| ProfileName | string | Profile Name field value |
| HclStatus | string | Hcl Status field value |
| UcsDomain | string | Ucs Domain field value |
| HxClusterName | string | Hx Cluster field value |
| PortalUrl | string | Portal Url field value |
| ManagementMode | string | Management mode of the device - UCSM, IntersightStandalone, Intersight |
| ModTime | long | Mod time field value |
| AccountMoid | string | Account Moid field value |
| ConnectionStatus | string | Connection Status field value |
| ConnectionStatusChangeTime | long | Connection status change time field value |
| UcsdStatus | string | Ucsd status licensing field value |
| UcsdLicenseInfoMoid | string | Ucsd License Info field value |
| IntersightLicenseStatus | string | Intersight License Status field value |
| IntersightLicenseLevel | long | Intersight License Level field value |
| AssetTag | string | AssetTag field value |
| Guid | string | Guid Level field value |


#### 2- parquet_eq.go

| Attributes | Data Type | Description |
| ---------- | --------- | ----------- |
| ParentMoid | string | Parent Moid field value |
| Moid | string | Moid field value |
| ClusterMoid | string | Cluster Moid field value |
| PlatformType | string | Platform Type field value |
