def runPythonScript(String pythonScriptPath, String apiKey) {
    try {
        // Create a list of command-line arguments to pass to the Python script
        def commandLineArgs = ["python", pythonScriptPath, "--api-key", apiKey]

        def process = commandLineArgs.execute()
        process.waitFor()

        println "Python script executed with exit code: ${process.exitValue()}"
    } catch (Exception e) {
        println "An error occurred: ${e.message}"
    }
}


runPythonScript(pythonScriptPath, apiKey)
