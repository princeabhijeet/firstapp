pipeline {

	agent any
	
	parameters {
		string name: 'App', description: 'App name', defaultValue: 'firstapp'
	}
	
	tools {
		maven 'Maven 3.9.0'
		jdk 'JDK 17'
	}
	
	stages {
		stage("Maven Clean") {
			steps {
				echo "STAGE: Maven clean - START"
				sh "mvn clean"
				echo "STAGE: Maven clean - COMPLETE"
			}
		}
		stage("Maven Build") {
			steps {
				echo "STAGE: Maven Build - START"
				sh "mvn -Dmaven.test.failure.ignore=false install"
				echo "STAGE: Maven Build - COMPLETE"
			}
		}
	}
}