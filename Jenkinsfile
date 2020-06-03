node {
   // This is to demo github action	
   
   stage('SCM Checkout'){
    // Clone repo
	git branch: 'master', 
	url: 'https://github.com/SanthoshKumar4939/Devops201'   
   }
   
   
	
   stage('Compile-Package'){
	   // Build using maven
	   def mvn = tool name: 'maven-3', type: 'maven'
	   
	   sh "${mvn}/bin/mvn package"
   }
   


}