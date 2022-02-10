pipeline{
    agent any
    tools{
        maven 'MAVEN'
    }
    stages{
    stage('checkout'){
        steps{
        checkout scm
        }
    }
    
    stage('Unit Test'){
        steps{
        sh "mvn clean test"
        }
    }
        stage('Sonar Analysis'){
            steps{
                withSonarQubeEnv("SonarQube"){
                    sh "mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar"
                }
            }
        }
    }
    post{
        success{
            sh "echo success"
        }
    }
}
