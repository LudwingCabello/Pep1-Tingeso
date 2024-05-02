pipeline{
    agent any
    tools{
        maven "maven"

    }
    stages{
        stage("Build JAR File"){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/LudwingCabello/Pep1-Tingeso']])
                dir("Pep1Tingeso"){
                    bat "mvn install -Dmaven.test.skip=true"
                }
            }
        }
        /*
        stage("Test"){
            steps{
                dir("Pep1Tingeso"){
                    bat "mvn test"
                }
            }
        }
        */
        stage("Build and Push Docker Image"){
            steps{
                dir("Pep1Tingeso"){
                    script{
                         withDockerRegistry(credentialsId: 'docker-credentials'){
                            bat "docker build -t ludwingcabello/pep1tingeso ."
                            bat "docker push ludwingcabello/pep1tingeso"
                        }
                    }                    
                }
            }
        }
    }
}
