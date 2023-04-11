pipeline {
  agent any
  stages {
    stage('Run a command') {
      steps {
        sh '''pwd
date
echo "${BUILD_ID}"'''
      }
    }

    stage('Print a Message') {
      steps {
        echo 'This is new step'
      }
    }

    stage('Build') {
      steps {
        sleep 10
      }
    }

  }
}