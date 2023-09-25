def pythonScript = "p0werfull321/Test/pipeline.py"
def apiKey = "artifactory-access-token"

// Create a list of command-line arguments to pass to the Python script
def commandLineArgs = ["python", pythonScript, "--api-key", apiKey]

def process = commandLineArgs.execute()

process.waitFor()

println "Python script executed with exit code: ${process.exitValue()}"
