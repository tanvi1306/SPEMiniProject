pipeline {
    agent any
    tools{
    maven 'Maven'
    }
    environment {
        DOCKER_IMAGE_NAME = 'scientific_calculator'
        GITHUB_REPO_URL = 'https://github.com/tanvi1306/SPEMiniProject.git'
    }

    stages {
        stage('Build Maven') {
            steps {
                script {
                    // Checkout the code from the GitHub repository
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                    sh 'mvn clean install'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }

        stage('Push Docker Images') {
            steps {
                script{
                    docker.withRegistry('', 'DockerId') {
                    sh 'docker tag scientific_calculator tanvi1306/scientific_calculator:latest'
                    sh 'docker push tanvi1306/scientific_calculator'
                    }
                 }
            }
        }

   stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                     )
                }
            }
        }

    }
}
