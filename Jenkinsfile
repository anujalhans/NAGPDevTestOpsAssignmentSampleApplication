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
        stage("Publish to Artifactory"){
            steps{
                rtMavenDeployer(
                    id: 'deployer',
                    serverId: 'NAGPDevTestOpsArtifactory',
                    releaseRepo: 'Anuj.NAGPDevTestOpsPipeline',
                    snapshotRepo: 'Anuj.NAGPDevTestOpsPipeline'
                )
                rtMavenRun(
                    pom: 'pom.xml',
                    goals: 'clean install',
                    deployerId: 'deployer'
                    )
                rtPublishBuildInfo(
                    serverId:'NAGPDevTestOpsArtifactory',
                )
            }        
        }
    }
    post{
        success{
            bat 'echo success'
        }
    }
}
