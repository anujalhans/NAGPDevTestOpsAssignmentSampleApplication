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
        withMaven("MAVEN") {
                bat'mvn install'
        }
        }
    }
    
    stage('Automated Test'){
        steps{
        sh "clean test"
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
