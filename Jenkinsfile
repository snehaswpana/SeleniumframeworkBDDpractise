pipeline {
    agent any
   tools{
	maven 'Maven'
   }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
//xnbzcbzmc