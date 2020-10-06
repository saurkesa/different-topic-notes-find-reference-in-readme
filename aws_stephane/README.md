
# aws_developer_certificate
notes prepared by others

https://github.com/shrinivas93/AWS-Certified-Developer-Associate-Notes

https://github.com/mransbro/aws-developer-notes#iam

https://github.com/mostafac0des/certified-aws-developer-associate-notes/blob/master/1-aws-fundamentals/iam.md

https://digitalcloud.training/aws-developer-associate-exam/


https://aws.amazon.com/certification/certification-prep/===================imp


user experience

https://www.soldevelo.com/blog/my-journey-to-becoming-aws-certified/

https://www.testpreptraining.com/blog/how-to-pass-aws-certified-developer-associate-exam/

very important :https://www.whizlabs.com/blog/aws-certified-developer-associate-exam-review/

https://medium.com/bb-tutorials-and-thoughts/how-to-pass-the-aws-certified-developer-associate-exam-fa9de075ec20
====================

ec2 user_data

#!/bin/bash
sudo su
yum update -y
yum install httpd -y 
service httpd start
service httpd status
echo "hello world from $(hostname)" > /var/www/html/index.html
