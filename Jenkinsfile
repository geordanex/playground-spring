pipeline {
  agent any
  stages {
    stage('Checkout Code') {
      steps {
        git(url: 'https://github.com/geordanex/playground-spring', branch: 'main')
      }
    }

    stage('Maven Test') {
      steps {
        sh 'mvn test'
      }
    }

  }
}