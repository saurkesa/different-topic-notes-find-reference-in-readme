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

https://www.pepcoding.com/most-important-interview-questions-list-for-product-based-companies

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

microservice  best approach :--https://12factor.net/

11- helm chart
 https://www.youtube.com/c/DeekshithSN/playlists
 
 12----java techie playlist
 https://www.youtube.com/c/JavaTechie/playlists
 
 ===============================================================================================================================================================
 
# IBES Processing Provisioning Product
The Service Catalog Product for deploying an IBES Processing Product

## Input parameters
| Name | Type | Description | Allowed values | cx-nprd-datalake ap-southeast-2 | cx-nprd-datalake eu-central-1 | cx-nprd-datalake us-west-2 | cx-prd-datalake  ap-southeast-2 | cx-prd-datalake eu-central-1 | cx- prd-datalake us-west-2 |
|------|------|-------------|----------------|---------------------------------|-------------------------------|----------------------------|---------------------------------|------------------------------|----------------------------|
| ProjectNamePrefix | String | Name of the product prefix. |  | cxdl3 | cxdl3 | cxdl3 | cxdl | cxdl | cxdl |
| Service | String | Name of the service |  | ibes | ibes | ibes | ibes | ibes | ibes |
| LambdaArtifactS3Bucketname | String | S3 Bucket name where Lambda function source resides |  | cxdl-prd-serverless-artifacts-r-ap-southeast-2 | cxdl-prd-serverless-artifacts-r-eu-central-1 | cxdl-prd-serverless-artifacts-r-us-west-2 | cxdl-prd-serverless-artifacts-r-ap-southeast-2 | cxdl-prd-serverless-artifacts-r-eu-central-1 | cxdl-prd-serverless-artifacts-r-us-west-2 |
| InputBucketName | String | Name of the incoming bucket |  | cxdl3-dev-curated-ap-southeast-2 | cxdl3-dev-curated-eu-central-1 | cxdl3-dev-curated-us-west-2 | cxdl-prd-curated-ap-southeast-2 | cxdl-prd-curated-eu-central-1 | cxdl-prd-curated-us-west-2 |
| InputS3BucketCmkArn | String | ARN of the CMK key for the input s3 bucket |  |  |  |  |  |  |  |
| CloudWatchLogGroupProductId | String | Product ID in ServiceCatalog |  |  |  |  |  |  |  |
| CloudWatchLogGroupProvisioningArtifactName | String | Name of the product in ServiceCatalog |  | v1.0.1 | v1.0.1 | v1.0.1 | v1.0.1 | v1.0.1 | v1.0.1 |
| CmkProductId | String | Systems parameter to the product id for the CMK product |  |  |  |  |  |  |  |
| CmkProvisioningArtifactName | String | Name (version) of the product in Service catalog. |  | v1.0.6 | v1.0.6 | v1.0.6 | v1.0.6 | v1.0.6 | v1.0.6 |
| IBESDynamoDBProvisioningArtifactName | String | Name of the product in ServiceCatalog |  | v1.0.10 | v1.0.10 | v1.0.10 | v1.0.10 | v1.0.10 | v1.0.10 |
| CommonDynamoDBProvisioningArtifactName | String | Name of the product in ServiceCatalog |  | v1.0.7 | v1.0.7 | v1.0.7 | v1.0.7 | v1.0.7 | v1.0.7 |
| EventRuleProductId | String | Systems parameter to the product id for the IBES eventrule product |  |  |  |  |  |  |  |
| EventRuleProvisioningArtifactName | String | Name (version) of the IBES eventrule product in Service catalog. |  | v1.0.13 | v1.0.13 | v1.0.13 | v1.0.13 | v1.0.13 | v1.0.13 |
| EcsClusterProvisioningArtifactName | String | None |  | v1.0.1 | v1.0.1 | v1.0.1 | v1.0.1 | v1.0.1 | v1.0.1 |
| ContainerInsights | String | None | - enabled <br />- disabled <br /> | disabled | disabled | disabled | disabled | disabled | disabled |
| DynamoDBCmkService | String | Enter name of the AWS Service the CMK will be used to encrypt. |  | dynamodb | dynamodb | dynamodb | dynamodb | dynamodb | dynamodb |
| DynamoDbProcessorTasksTableNameSuffix | String | DynamoDbProcessorTasks TableNameSuffix |  | processor-tasks | processor-tasks | processor-tasks | processor-tasks | processor-tasks | processor-tasks |
| DynamoDbTaskExecutionTableNameSuffix | String | DynamoDbTaskExecution TableNameSuffix |  | task-execution | task-execution | task-execution | task-execution | task-execution | task-execution |
| DynamoDbTaskExecutionTableAttribute1Name | String | DynamoDbTaskExecutionTable Attribute1Name |  | TaskId | TaskId | TaskId | TaskId | TaskId | TaskId |
| DynamoDbTaskExecutionTableAttribute1Type | String | DynamoDbTaskExecutionTable Attribute1Type |  | S | S | S | S | S | S |
| DynamoDbTaskExecutionTableKeySchemaAttribute1Name | String | DynamoDbTaskExecutionTable KeySchema Attribute1 Name |  | TaskId | TaskId | TaskId | TaskId | TaskId | TaskId |
| DynamoDbTaskExecutionTableKeySchemaKeyTypeAttribute1 | String | DynamoDbTaskExecutionTable KeySchemaKeyTypeAttribute1 |  | HASH | HASH | HASH | HASH | HASH | HASH |
| DynamoDbTaskExecutionTableAttribute2Name | String | DynamoDbTaskExecutionTable Attribute2Name |  | ExecutionId | ExecutionId | ExecutionId | ExecutionId | ExecutionId | ExecutionId |
| DynamoDbTaskExecutionTableAttribute2Type | String | DynamoDbTaskExecutionTable Attribute2Type |  | S | S | S | S | S | S |
| DynamoDbTaskExecutionTableKeySchemaAttribute2Name | String | DynamoDbTaskExecutionTable KeySchema Attribute2 Name |  | ExecutionId |  ExecutionId | ExecutionId | ExecutionId | ExecutionId | ExecutionId |
| DynamoDbTaskExecutionTableKeySchemaKeyTypeAttribute2 | String | DynamoDbTaskExecutionTable KeySchemaKeyTypeAttribute2 |  | RANGE | RANGE | RANGE | RANGE | RANGE | RANGE |
| DynamoDbTaskExecutionTableReadCapacityUnits | String | DynamoDbTaskTable ReadCapacityUnits |  | 300 | 300 | 300 | 300 | 300 | 300 |
| DynamoDbTaskExecutionTableWriteCapacityUnits | String | DynamoDbTaskTable WriteCapacityUnits |  | 300 | 300 | 300 | 300 | 300 | 300 |
| DynamoDbTaskExecutionTableSSEEnabled | String | DynamoDbTaskExecutionTable SSEEnabled |  | true | true | true | true | true | true |
| TimeToLiveSpecificationAttributeName | String | Time To Live Specification Attribute Name NOTE - To update this property, you must first disable TTL then enable TTL with the new attribute name. |  | TtlTm | TtlTm | TtlTm | TtlTm | TtlTm | TtlTm |
| TimeToLiveSpecificationEnabled | String | Enables / Disables the Time To Live Specification |  | True | True | True | True | True | True |
| DynamoDbTaskTableReadCapacityUnits | String | DynamoDbTaskExecutionTable ReadCapacityUnits |  | 300 | 300 | 300 | 300 | 300 | 300 |
| DynamoDbTaskTableWriteCapacityUnits | String | DynamoDbTaskExecutionTable WriteCapacityUnits |  | 300 | 300 | 300 | 300 | 300 | 300 |
| UploadHandlerArtifactName | String | UploadHandler Artifact Name |  | v1.0.34 | v1.0.34 | v1.0.34 | v1.0.34 | v1.0.34 | v1.0.34 |
| UploadHandlerServiceName | String | Service name for the upload handler |  | upload-handler | upload-handler | upload-handler | upload-handler | upload-handler | upload-handler |    
| SqsProductId | String | Product ID for the SQS queue |  |  |  |  |  |  |  |
| SqsProvisioningArtifactName | String | Name (version) of the SQS product in ServiceCatalog. |  | v1.0.4 | v1.0.4 | v1.0.4 | v1.0.4 | v1.0.4 | v1.0.4 |
| SqsPolicyProductId | String | Product ID for the SQS policy in ServiceCatalog |  |  |  |  |  |  |  |
| SqsPolicyProvisioningArtifactName | String | Name (version) of the SQS policy product in ServiceCatalog. |  | v1.0.0 | v1.0.0 | v1.0.0 | v1.0.0 | v1.0.0 | v1.0.0 |
| SqsLambdaFunctionBatchSize | Number | Batch size of the SQS trigger for the upload handler lambda function |  |  |  |  |  |  |  |
| UploadHandlerLambdaS3Key | String | S3 file name with prefix for lambda source |  | cxdl-ibes-processing/upload-handler/lambda-upload-handler-v0.9.53.zip | cxdl-ibes-processing/upload-handler/lambda-upload-handler-v0.9.53.zip | cxdl-ibes-processing/upload-handler/lambda-upload-handler-v0.9.53.zip | cxdl-ibes-processing/upload-handler/lambda-upload-handler-v0.9.52.zip | cxdl-ibes-processing/upload-handler/lambda-upload-handler-v0.9.52.zip | cxdl-ibes-processing/upload-handler/lambda-upload-handler-v0.9.52.zip |
| PointInTimeRecoveryEnabled | String | Enable field PointInTimeRecovery |  |  |  |  |  |  |  |
| InventoryProcessorProductId | String | None |  | v1.0.60 | v1.0.60 | v1.0.60 | v1.0.60 | v1.0.60 | v1.0.60 |
| InventoryProcessorProvisioningArtifactName | String | None |  | v1.0.24 | v1.0.24 |
| SFNWrapUpLambdaS3Key | String | None |  | cxdl-ibes-processing/sfn-wrap-up/lambda-sfn-wrap-up-v0.9.53.zip | cxdl-ibes-processing/sfn-wrap-up/lambda-sfn-wrap-up-v0.9.53.zip | cxdl-ibes-processing/sfn-wrap-up/lambda-sfn-wrap-up-v0.9.53.zip | cxdl-ibes-processing/sfn-wrap-up/lambda-sfn-wrap-up-v0.9.52.zip | cxdl-ibes-processing/sfn-wrap-up/lambda-sfn-wrap-up-v0.9.52.zip | cxdl-ibes-processing/sfn-wrap-up/lambda-sfn-wrap-up-v0.9.52.zip |
| SFNTriggerLambdaS3Key | String | None |  | cxdl-ibes-processing/sfn-trigger/lambda-sfn-trigger-v0.9.53.zip | cxdl-ibes-processing/sfn-trigger/lambda-sfn-trigger-v0.9.53.zip | cxdl-ibes-processing/sfn-trigger/lambda-sfn-trigger-v0.9.53.zip | cxdl-ibes-processing/sfn-trigger/lambda-sfn-trigger-v0.9.52.zip | cxdl-ibes-processing/sfn-trigger/lambda-sfn-trigger-v0.9.52.zip | cxdl-ibes-processing/sfn-trigger/lambda-sfn-trigger-v0.9.52.zip |
| RawS3Bucket | String | None |  | cxdl3-dev-raw-ap-southeast-2| cxdl3-dev-raw-eu-central-1 | cxdl3-dev-raw-us-west-2 | cxdl-prd-raw-ap-southeast-2 | cxdl-prd-raw-eu-central-1 | cxdl-prd-raw-us-west-2 |
| InputS3Bucket | String | None |  | cxdl3-dev-raw-ap-southeast-2 | cxdl3-dev-raw-eu-central-1 | cxdl3-dev-raw-us-west-2 | cxdl-prd-raw-ap-southeast-2 | cxdl-prd-raw-eu-central-1 | cxdl-prd-raw-us-west-2 |
| CuratedS3BucketUS | String | None |  |cxdl3-dev-curated-ap-southeast-2 | cxdl3-dev-curated-eu-central-1 | cxdl3-dev-curated-us-west-2 | cxdl-prd-curated-ap-southeast-2 | cxdl-prd-curated-eu-central-1 | cxdl-prd-curated-us-west-2 |
| CuratedS3BucketEU | String | None |  | cxdl3-dev-curated-ap-southeast-2 | cxdl3-dev-curated-eu-central-1 | cxdl3-dev-curated-eu-central-1 | cxdl-prd-curated-ap-southeast-2 | cxdl-prd-curated-eu-central-1 | cxdl-prd-curated-eu-central-1 |
| CuratedS3BucketAPJC | String | None |  | cxdl3-dev-curated-ap-southeast-2 | cxdl3-dev-curated-eu-central-1 | cxdl3-dev-curated-ap-southeast-2 | cxdl-prd-curated-ap-southeast-2 | cxdl-prd-curated-eu-central-1 | cxdl-prd-curated-ap-southeast-2 |
| CustomerRegionToAwsRegionMap | String | None |  | {\"apjc\":\"cxdl3-dev-curated-ap-southeast-2\"} | {\"emea\":\"cxdl3-dev-curated-eu-central-1\"} | {\"us\":\"cxdl3-dev-curated-us-west-2\", \"emea\":\"cxdl3-dev-curated-eu-central-1\", \"apjc\":\"cxdl3-dev-curated-ap-southeast-2\"} | {\"apjc\":\"cxdl-prd-curated-ap-southeast-2\"} | {\"emea\":\"cxdl-prd-curated-eu-central-1\"} | {\"us\":\"cxdl-prd-curated-us-west-2\",\"emea\":\"cxdl-prd-curated-eu-central-1\",\"apjc\":\"cxdl-prd-curated-ap-southeast-2\"} |
| UploadPrefixRegionMap | String | None |  | {\"apjc\":\"cloud-ibes-ap-southeast-2\"} | {\"emea\":\"cloud-ibes-eu-central-1\"} | {\"us\":\"cloud-ibes\", \"emea\":\"cloud-ibes-eu-central-1\", \"apjc\":\"cloud-ibes-ap-southeast-2\"} | {\"apjc\":\"cloud-ibes-ap-southeast-2\"} | {\"emea\":\"cloud-ibes-eu-central-1\"} | {\"us\":\"cloud-ibes\", \"emea\":\"cloud-ibes-eu-central-1\", \"apjc\":\"cloud-ibes-ap-southeast-2\"} |
| HttpsProxyUrl | String | None |  |  |  |  |  |  |  |
| EcsTaskCpu | Number | None |  |  |  |  |  |  |  |
| EcsTaskMemory | Number | None |  |  |  |  |  |  |  |
| StepFunctionMaxConcurrency | Number | None |  |  |  |  |  |  |  |
| AccountName | String | None |  | cx-nprd-datalake | cx-nprd-datalake | cx-nprd-datalake | cx-prd-datalake | cx-prd-datalake | cx-prd-datalake |
| VpcName | String | VpcName parameter from base-infra-prov |  | d1 | d1 | d1 | d1 | d1 | d1 |
| LandingS3Bucket | String | None |  | cxdl3-dev-landing-ap-southeast-2 | cxdl3-dev-landing-eu-central-1 | cxdl3-dev-landing-us-west-2 | cxdl-prd-landing-ap-southeast-2 | cxdl-prd-landing-eu-central-1 | cxdl-prd-landing-us-west-2 |
| TaskLimitBySource | String | None |  | {\"EDF_IB_ASSETS\":250, \"*\":250} | {\"EDF_IB_ASSETS\":250, \"*\":250} | {\"EDF_IB_ASSETS\":250, \"*\":250} | {\"EDF_IB_ASSETS\":250, \"*\":250} | {\"EDF_IB_ASSETS\":250, \"*\":250} | {\"EDF_IB_ASSETS\":250, \"*\":250} |
| IbesProcSfnExecLimit | String | None |  |  |  |  |  |  |  |
| StepFunctionMaxConcurrency | Number | None |  |  |  |  |  |  |  |
| SFNTriggerLambdaMemSize | Number | None |  |  |  |  |  |  |  |
| SFNTimeout | Number | None |  | 7200 | 7200 | 7200 | 7200 | 7200 | 7200 |
| FisEnricherWorkerCount | Number | None |  | 2 | 2 | 2 | 2 | 2 | 2 |
| NEShardLimit | String | NE Shard Limit for IPE process |  |  |  |  |  |  |  |
| CmkIbesFailureNotifySnsProvisioningArtifactName | String | Name of the product in ServiceCataLog |  | v2.0 | v2.0 | v2.0 | v2.0 | v2.0 | v2.0 |
| CmkIbesFailureNotifySnsResourceSuffix | String | Resource Suffix Identifier for the CMK for SNS |  |  |  |  |  |  |  |
| CmkSnsProvisioningArtifactName | String | Name of the product in ServiceCataLog. |  | v2.0 | v2.0 |
| IbesFailureNotifySnsProvisioningArtifactName | String | Name of the product in ServiceCataLog |  | v1.0.2 | v1.0.2 | v1.0.2 | v1.0.2 | v1.0.2 | v1.0.2 |
| IbesFailureNotifySnsPolicyProvisioningArtifactName | String | Name of the product in ServiceCataLog |  | v1.0.0 | v1.0.0 | v1.0.0 | v1.0.0 | v1.0.0 | v1.0.0 |
| DdcCrawlerTargetPath | String | Ddc S3 Target path to crawl data |  | s3://cxdl3-dev-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/CA_DDC_CAMPUS_ASSETS/ | s3://cxdl3-dev-curated-eu-central-1/cloud-ibes-eu-central-1/CA_DDC_CAMPUS_ASSETS/ | s3://cxdl3-dev-curated-us-west-2/cloud-ibes/CA_DDC_CAMPUS_ASSETS/ | s3://cxdl-prd-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/CA_DDC_CAMPUS_ASSETS/ | s3://cxdl-prd-curated-eu-central-1/cloud-ibes-eu-central-1/CA_DDC_CAMPUS_ASSETS/ | s3://cxdl-prd-curated-us-west-2/cloud-ibes/CA_DDC_CAMPUS_ASSETS/ |
| SdwanCrawlerTargetPath | String | Sdwan S3 Target path to crawl data |  | s3://cxdl3-dev-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/CDNAS3_SDWAN_ASSETS/ | s3://cxdl3-dev-curated-eu-central-1/cloud-ibes-eu-central-1/CDNAS3_SDWAN_ASSETS/ | s3://cxdl3-dev-curated-us-west-2/cloud-ibes/CDNAS3_SDWAN_ASSETS/ | s3://cxdl-prd-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/CDNAS3_SDWAN_ASSETS/ | s3://cxdl-prd-curated-eu-central-1/cloud-ibes-eu-central-1/CDNAS3_SDWAN_ASSETS/ | s3://cxdl-prd-curated-us-west-2/cloud-ibes/CDNAS3_SDWAN_ASSETS/ |
| CsdfIntersightCrawlerTargetPath | String | CSDF Intersight S3 Target path to crawl data |  | s3://cxdl3-dev-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/CSDF_INTERSIGHT/ | s3://cxdl3-dev-curated-eu-central-1/cloud-ibes-eu-central-1/CSDF_INTERSIGHT/ | s3://cxdl3-dev-curated-us-west-2/cloud-ibes/CSDF_INTERSIGHT/ | s3://cxdl-prd-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/CSDF_INTERSIGHT/ | s3://cxdl-prd-curated-eu-central-1/cloud-ibes-eu-central-1/CSDF_INTERSIGHT/ | s3://cxdl-prd-curated-us-west-2/cloud-ibes/CSDF_INTERSIGHT/ |
| DccCrawlerTargetPath | String | DCC S3 Target path to crawl data |  | s3://cxdl3-dev-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/DCC/ | s3://cxdl3-dev-curated-eu-central-1/cloud-ibes-eu-central-1/DCC/ | s3://cxdl3-dev-curated-us-west-2/cloud-ibes/DCC/ | s3://cxdl-prd-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/DCC/ | s3://cxdl-prd-curated-eu-central-1/cloud-ibes-eu-central-1/DCC/ | s3://cxdl-prd-curated-us-west-2/cloud-ibes/DCC/ |
| DnacCrawlerTargetPath | String | DNAC S3 Target path to crawl data |  | s3://cxdl3-dev-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/DNAC_CAMPUS_ASSETS/ | s3://cxdl3-dev-curated-eu-central-1/cloud-ibes-eu-central-1/DNAC_CAMPUS_ASSETS/ | s3://cxdl3-dev-curated-us-west-2/cloud-ibes/DNAC_CAMPUS_ASSETS/ | s3://cxdl-prd-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/DNAC_CAMPUS_ASSETS/ | s3://cxdl-prd-curated-eu-central-1/cloud-ibes-eu-central-1/DNAC_CAMPUS_ASSETS/ | s3://cxdl-prd-curated-us-west-2/cloud-ibes/DNAC_CAMPUS_ASSETS/ |
| EdfDccSubscriptionCrawlerTargetPath | String | EDF DCC Subscription S3 Target path to crawl data |  | s3://cxdl3-dev-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/EDF_DCC_SUBSCRIPTION/ | s3://cxdl3-dev-curated-eu-central-1/cloud-ibes-eu-central-1/EDF_DCC_SUBSCRIPTION/ | s3://cxdl3-dev-curated-us-west-2/cloud-ibes/EDF_DCC_SUBSCRIPTION/ | s3://cxdl-prd-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/EDF_DCC_SUBSCRIPTION/ | s3://cxdl-prd-curated-eu-central-1/cloud-ibes-eu-central-1/EDF_DCC_SUBSCRIPTION/ | s3://cxdl-prd-curated-us-west-2/cloud-ibes/EDF_DCC_SUBSCRIPTION/ |
| EdfIbCrawlerTargetPath | String | EDF IB S3 Target path to crawl data |  | s3://cxdl3-dev-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/EDF_IB_ASSETS/ | s3://cxdl3-dev-curated-eu-central-1/cloud-ibes-eu-central-1/EDF_IB_ASSETS/ | s3://cxdl3-dev-curated-us-west-2/cloud-ibes/EDF_IB_ASSETS/ | s3://cxdl-prd-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/EDF_IB_ASSETS/ | s3://cxdl-prd-curated-eu-central-1/cloud-ibes-eu-central-1/EDF_IB_ASSETS/ | s3://cxdl-prd-curated-us-west-2/cloud-ibes/EDF_IB_ASSETS/ |
| MerakiCrawlerTargetPath | String | Meraki S3 Target path to crawl data |  | s3://cxdl3-dev-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/MERAKI/ | s3://cxdl3-dev-curated-eu-central-1/cloud-ibes-eu-central-1/MERAKI/ | s3://cxdl3-dev-curated-us-west-2/cloud-ibes/MERAKI/ | s3://cxdl-prd-curated-ap-southeast-2/cloud-ibes-ap-southeast-2/MERAKI/ | s3://cxdl-prd-curated-eu-central-1/cloud-ibes-eu-central-1/MERAKI/ | s3://cxdl-prd-curated-us-west-2/cloud-ibes/MERAKI/ |
| DdcGlueDatabaseSuffix | String | DDC Glue Database suffix name |  |  |  |  |  |  |  |
| SdwanGlueDatabaseSuffix | String | Sdwan Glue Database suffix name |  |  |  |  |  |  |  |
| CsdfIntersightGlueDatabaseSuffix | String | CSDF Intersight Glue Database suffix name |  |  |  |  |  |  |  |
| DccGlueDatabaseSuffix | String | DCC Glue Database suffix name |  |  |  |  |  |  |  |
| DnacGlueDatabaseSuffix | String | DNAC Glue Database suffix name |  |  |  |  |  |  |  |
| EdfDccSubscriptionGlueDatabaseSuffix | String | EDF DCC Subscription Glue Database suffix name |  |  |  |  |  |  |  |
| EdfIbGlueDatabaseSuffix | String | EDF IB Glue Database suffix name |  |  |  |  |  |  |  |
| MerakiGlueDatabaseSuffix | String | Meraki Glue Database suffix name |  |  |  |  |  |  |  |
| GlueCrawlerProvisioningArtifactName | String | Name of the glue crawler product in ServiceCatalog |  | v1.0.11 | v1.0.11 | v1.0.11 | v1.0.11 | v1.0.11 | v1.0.11 |
| GlueJobDatabaseArtifactName | String |Glue Job Database ArtifactName |  |v1.0.4 | v1.0.4 | v1.0.4 | v1.0.4 | v1.0.4 | v1.0.4 |
| SecurityCompliance | String | SecurityCompliance |  | Yes | Yes | Yes | Yes | Yes | Yes |
| AvailabilityZone | String | Availability Zone for Glue connection |  | ap-southeast-2a | eu-central-1a | us-west-2a | ap-southeast-2a | eu-central-1a | us-west-2a |
| CuratedRegionalBucket | String | Regional Bucket |  | cxdl3-dev-curated-ap-southeast-2 | cxdl3-dev-curated-eu-central-1 | cxdl3-dev-curated-us-west-2 | cxdl3-dev-curated-us-west-2 | cxdl-prd-curated-ap-southeast-2 | cxdl-prd-curated-eu-central-1 |
| CmkSnsResourceSuffix | String | Resource Suffix Identifier for the CMK for SNS |  | ibes | ibes |
| CmkSnsTopicPolicyJson | String | Policy for the CMK key which Sns topic is using |  |  | {\"Version\":\"2012-10-17\",\"Id\":\"CmkPolicy\",\"Statement\":[{\"Sid\":\"Allow CMK admin operations\",\"Effect\":\"Allow\",\"Principal\":{\"AWS\":\"arn:aws:iam::841402138232:root\"},\"Action\":[\"kms:CancelKeyDeletion\",\"kms:Create*\",\"kms:Delete*\",\"kms:Describe*\",\"kms:Disable*\",\"kms:Enable*\",\"kms:Get*\",\"kms:List*\",\"kms:Put*\",\"kms:Revoke*\",\"kms:ScheduleKeyDeletion\",\"kms:Update*\"],\"Resource\":\"*\"},{\"Sid\":\"Allow CMK usage\",\"Effect\":\"Allow\",\"Principal\":{\"AWS\":[\"arn:aws:iam::841402138232:root\",\"arn:aws:iam::841402138232:role/admin\"]},\"Action\":[\"kms:Decrypt\",\"kms:DescribeKey\",\"kms:Encrypt\",\"kms:GenerateDataKey*\",\"kms:ReEncrypt*\"],\"Resource\":\"*\"},{\"Sid\":\"Allow CMK usage by service on the account\",\"Effect\":\"Allow\",\"Principal\":{\"AWS\":\"*\"},\"Action\":[\"kms:Decrypt*\",\"kms:Describe*\",\"kms:Encrypt*\",\"kms:GenerateDataKey*\",\"kms:ReEncrypt*\"],\"Resource\":\"*\",\"Condition\":{\"StringEquals\":{\"kms:ViaService\":\"sns.us-west-2.amazonaws.com\",\"kms:CallerAccount\":\"841402138232\"}}},{\"Sid\":\"Allow CMK to remote roles\",\"Effect\":\"Allow\",\"Principal\":{\"AWS\":[\"arn:aws:iam::466549614249:role/cp-asset-dws-data-import-cluster01-usw2-cx-prd-cxc-glue-role\",\"arn:aws:iam::466549614249:role/cp-asset-dws-data-import-cluster01-euc1-cx-prd-cxc-glue-role\",\"arn:aws:iam::466549614249:role/cluster01_usw2_cx-prd-cxc20200710212609033900000008\",\"arn:aws:iam::466549614249:role/cluster01_euc1_cx-prd-cxc20201215004756887400000008\"]},\"Action\":[\"kms:Decrypt*\",\"kms:Describe*\"],\"Resource\":\"*\",\"Condition\":{\"StringEquals\":{\"kms:ViaService\":\"sns.us-west-2.amazonaws.com\",\"kms:CallerAccount\":\"841402138232\"}}},{\"Sid\":\"Allow attachment of persistent resources\",\"Effect\":\"Allow\",\"Principal\":{\"AWS\":[\"arn:aws:iam::841402138232:root\",\"arn:aws:iam::841402138232:role/admin\"]},\"Action\":[\"kms:CreateGrant\",\"kms:ListGrants\",\"kms:RevokeGrant\"],\"Resource\":\"*\",\"Condition\":{\"Bool\":{\"kms:GrantIsForAWSResource\":\"true\"}}},{\"Sid\":\"EventBridge SNS CMK Usage\",\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"events.amazonaws.com\"},\"Action\":[\"kms:Decrypt\",\"kms:GenerateDataKey\"],\"Resource\":\"*\"}]} |
| SnsTopicNameSuffix | String | Topic name suffix. |  |  | ibes-notify |
| SnsTopicPolicyJson | String | Provide SNS topic policy document in Stringified Json format. |  |  | {\"Version\":\"2012-10-17\",\"Id\":\"__default_policy_ID\",\"Statement\":[{\"Sid\":\"__default_statement_ID\",\"Effect\":\"Allow\",\"Principal\":{\"AWS\":\"*\"},\"Action\":[\"SNS:GetTopicAttributes\",\"SNS:SetTopicAttributes\",\"SNS:AddPermission\",\"SNS:RemovePermission\",\"SNS:DeleteTopic\",\"SNS:Subscribe\",\"SNS:ListSubscriptionsByTopic\",\"SNS:Publish\",\"SNS:Receive\"],\"Resource\":\"arn:aws:sns:us-west-2:841402138232:cxdl-prd-ibes-notify\",\"Condition\":{\"StringEquals\":{\"AWS:SourceOwner\":\"841402138232\"}}},{\"Sid\":\"EventBridgePublishEventsToTopic\",\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"events.amazonaws.com\"},\"Action\":\"sns:Publish\",\"Resource\":\"arn:aws:sns:us-west-2:841402138232:cxdl-prd-ibes-notify\"},{\"Sid\":\"SubscriberAccountId\",\"Effect\":\"Allow\",\"Principal\":{\"AWS\":[\"arn:aws:iam::466549614249:root\"]},\"Action\":\"sns:Subscribe\",\"Resource\":\"arn:aws:sns:us-west-2:841402138232:cxdl-prd-ibes-notify\"}]} |
| EventSnsProvisioningArtifactName | String | Name of the product in ServiceCatalog. |  |  | v1.0.0 |
| EventSnsSourceS3BucketPrefix | String | S3 folder prefix on which this Eventbridge rule will trigger. |  |  | cloud-ibes |
| EventSnsSourceS3BucketName | String | The S3 bucket which Eventbridge will monitor to trigger the rule. |  |  |  cxdl-prd-curated-us-west-2 |
| EventSnsEventBridgeNameSuffix | String | The suffix to append to the name of the Eventbridge rule. |  |  | ibes-process |
| S3CuratedPolicyProductId | String | Product Id. |  |  |  |
| S3CuratedPolicyProvisioningArtifactName | String | Name of the product in ServiceCatalog. |  |  |  |
| S3CuratedPolicyCuratedS3BucketName | String | Short name of the S3 curated bucket for which you wish to apply this bucket policy. |  |  |  |
| S3CuratedPolicyJson | String | Provide S3 bucket policy document in Stringified Json format. |  |  |  |
| EnvironmentName | String | Environment name; the value you specify here should map to the value of the tag for the environment: see the "Environment" parameter description for more information. | - **sbx** <br />- dev <br />- tst <br />- prf <br />- stg <br />- prd <br /> | dev | prd |
| Environment | String | Tag name for the environment to use: please specify "Sandbox" for "sbx", "Prod" for "prd", or "NonProd" for "dev", "tst", "prf" or "stg". | - **Sandbox** <br />- NonProd <br />- Prod <br /> | NonProd | prod |
| DataClassification | String | Data classification. | - Cisco Restricted <br />- Cisco Highly Confidential <br />- **Cisco Confidential** <br />- Cisco Public <br /> |  |  |
| ApplicationName | String | Application name. |  | ibes | ibes |
| ResourceOwner | String | Resource owner. |  | CX Cloud IBES | CX Cloud IBES  |
| CiscoMailAlias | String | Email alias. |  | cxe-cloud-ibes@cisco.com | cxe-cloud-ibes@cisco.com |
| DataTaxonomy | String | Data taxonomy. | - Administrative Data <br />- Customer Data <br />- Entrusted Data <br />- Financing Data <br />- **Support Data** <br />- Telemetry Data <br />- Cisco Operations Data <br />- Cisco Strategic Data <br />- Human Resources Data <br /> | Support Data | Support Data |


## Output values
| Name | Description | Exported as |
|------|-------------|-------------|


## Created SSM Parameters
| SSM Param. Name | Description | Value |
|-----------------|-------------|-------------|
