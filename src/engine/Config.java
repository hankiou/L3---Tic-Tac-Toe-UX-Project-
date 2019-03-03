package engine;

public class Config {

	private String aiAlgorithmName = "RandomChoice"; // Default IA algorithm
	private boolean againstAI;

	public boolean isAgainstAI() {
		return againstAI;
	}

	public void setAgainstAI(boolean againstAI) {
		this.againstAI = againstAI;
	}

	public String getAiAlgorithmName() {
		return aiAlgorithmName;
	}

	public void setAiAlgorithmName(String aiAlgorithmName) {
		this.aiAlgorithmName = aiAlgorithmName;
	}
	
	
	
	// ... //
	
	
}
