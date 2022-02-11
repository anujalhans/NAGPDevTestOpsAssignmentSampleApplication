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
                bat 'mvn clean install'
        }
    }
    
    stage('Automated Test'){
        steps{
        bat 'mvn clean test'
        }
    }
        stage('Sonar Analysis'){
            steps{
                withSonarQubeEnv("SonarQube"){
                    bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
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
