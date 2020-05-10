pipeline {
  
  agent any
  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/ashtsh/calculator.git'
      }
    }
    stage('Compiling and Testing Project') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Building Project') {
      steps {
        sh 'mvn clean install'
      }
    }
    
    stage('Building image') {
      steps{
        sh 'docker build -t calculator .'
      }
    }
     stage('Pushing image') {
      steps{
     
        withDockerRegistry([credentialsId: 'dockercred', url: '']){
        
        sh 'docker push ashtsh/calculator:final'
        sh 'docker rmi -f ashtsh/calculator:final'
        }
      }
    }
    stage('Deploying image with rundeck') {
      steps{
     
        build job: 'rundeckjob'
        }
      }
    
  }
}
