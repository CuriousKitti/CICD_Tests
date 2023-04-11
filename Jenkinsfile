pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    
    stages{
        
        stage('Checkout'){
            steps{
                 checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'MyGitHub', url: 'https://github.com/CuriousKitti/CICD_Tests.git']])
            }
        }
        stage('Build'){
            steps{
                sh 'mvn clean install'
            }
            
        }
        
    }
    
}
