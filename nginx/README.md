#Nginx Installation on CentOS7
https://www.digitalocean.com/community/tutorials/how-to-install-nginx-on-centos-7 <br />
Using root <br />
yum update <br />
yum install epel-release -y <br />
yum install nginx -y <br />
<br />
##Nginx Reserve proxy configuration
https://www.nginx.com/resources/admin-guide/reverse-proxy/ <br />
configure /etc/nginx/nginx.conf <br /> 
location / { <br /> 
    proxy_pass http://$backEndHost:$backEndPort; <br />
} <br />
then restart nginx  <br />

