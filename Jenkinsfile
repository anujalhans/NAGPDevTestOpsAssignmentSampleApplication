pipeline{
    agent any
    tools{
        maven 'MAVEN'
        jdk 'JAVA_HOME'
    }
    stages{
    stage('checkout'){
        steps{
        checkout scm
        }
    }
        stage('Build'){
            steps{
                bat 'mvn clean'
        }
    }
    
    stage('Automated Test'){
        steps{
        bat 'mvn test'
        }
    }
    }
    post{
        success{
            bat 'echo success'
        }
    }
}
